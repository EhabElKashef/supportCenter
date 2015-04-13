package com.trioPluse.supportCenter.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.mvc.AbstractController;

import com.trioPlus.supportCenter.exception.BusinessException;


import sun.security.action.GetLongAction;

public class CustomSimpleMappingExceptionResolver extends
		SimpleMappingExceptionResolver {
	// -------------------------------- CONSTRUCTOR
	public CustomSimpleMappingExceptionResolver() {
		super();
	}

	// -------------------------------- PROTECTED METHODS
	@Override
	protected ModelAndView doResolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		ModelAndView mv = null;
		try {
			if (ex instanceof BusinessException) {

				mv = (ModelAndView) request.getSession().getAttribute(
						LastModelAndViewInterceptor.LAST_MODEL_VIEW_ATTRIBUTE);
				Object o = createObj(mv.getModelMap().entrySet().iterator()
						.next().getValue(), request);
				String attr = mv.getModelMap().entrySet().iterator().next()
						.getKey();
				mv.getModelMap().clear();
				mv.getModelMap().addAttribute(attr, o);

				mv.getModelMap().addAttribute("errorMessage",
						MessageUtils.getMessage(getEcode(ex)));

			} else {
				mv = super.doResolveException(request, response, handler, ex);
				mv.getModelMap().addAttribute("errorMessage",
						MessageUtils.getMessage("vfe.technical.error"));
				ex.printStackTrace();

			}
		} catch (Exception e) {
			e.printStackTrace();
			mv = super.doResolveException(request, response, handler, ex);
			mv.getModelMap().addAttribute("errorMessage",
					MessageUtils.getMessage("vfe.technical.error"));
		}

		return mv;
	}

	private Object createObj(Object value, HttpServletRequest request)
			throws IllegalArgumentException, IllegalAccessException,
			SecurityException, NoSuchMethodException, InstantiationException,
			InvocationTargetException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class cls = value.getClass();
		Class[] containerParamterTypes = new Class[] {};
		Constructor containerCT = cls.getConstructor(containerParamterTypes);
		Object[] containerArgumentsType = new Object[] {};
		Object containerRetobj = containerCT
				.newInstance(containerArgumentsType);
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			if (request.getParameter(field.getName()) != null) {
				field.setAccessible(true);
				String className = field.getGenericType().toString();

				if (className.startsWith("class")) {

					className = className.substring("class".length()).trim();
				} else {
					if (className != null && "int".equalsIgnoreCase(className)) {
						className = "java.lang.Integer";
					} else {
						className = "java.lang."
								+ className.substring(0, 1).toUpperCase()
										.concat(className.substring(1));
					}
				}
				// System.out.println("Field Name"+field.getName());
				// System.out.println("Field value"+request.getParameter(field.getName()));
				Class[] containerParamter = null;
				Object[] containerArguments = null;
				if (className != null && className.startsWith("[L")) {
					containerParamter = new Class[] {};
					// containerArguments=new Object[] {
					// request.getParameterValues(field.getName())};
					Class innerCls = Class.forName(className);

					field.set(containerRetobj,
							request.getParameterValues(field.getName()));
				} else {
					containerParamter = new Class[] { String.class };
					// if(className.toLowerCase().endsWith("Boolean".toLowerCase())){
					// if(
					// request.getParameter(field.getName()).equalsIgnoreCase("true"))
					// containerArguments=new Object[] { "1"};
					// else
					// containerArguments=new Object[] { "0"};
					// }else{
					containerArguments = new Object[] { request
							.getParameter(field.getName()) };
					// }
					Class innerCls = Class.forName(className);

					Constructor containerCons = innerCls
							.getConstructor(containerParamter);

					Object innerClassObj = containerCons
							.newInstance(containerArguments);
					field.set(containerRetobj, innerClassObj);
				}

			}
		}
		return value;
	}

	public String getEcode(Object o) throws IllegalArgumentException,
			IllegalAccessException, SecurityException, NoSuchMethodException,
			InvocationTargetException {
		Field[] fields = o.getClass().getDeclaredFields();
		Class objCls = o.getClass();
		Class[] emptyParams = new Class[] {};
		Object[] emptyArgs = new Object[] {};
		String fieldValue = null;
		if (fields != null) {
			for (int j = 0; j < fields.length; j++) {

				if (fields[j].getName().equalsIgnoreCase("eCode")) {
					String name = fields[j].getName();

					name = name.substring(0, 1).toUpperCase()
							.concat(name.substring(1));

					String getterName = "get" + name;
					Method getter = objCls.getMethod(getterName, emptyParams);
					fieldValue = (String) getter.invoke(o, emptyArgs);

				}
			}

		}
		return fieldValue;
	}
}
