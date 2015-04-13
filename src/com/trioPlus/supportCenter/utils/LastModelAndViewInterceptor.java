package com.trioPlus.supportCenter.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


 
public class LastModelAndViewInterceptor extends HandlerInterceptorAdapter {
//	@Autowired
//	private MgmServiceClient mgmServiceClient;
//	@Override
//	public boolean preHandle(HttpServletRequest request,
//			HttpServletResponse response, Object handler) throws Exception {
//		
//		//if(request.getSession().getAttribute("customer")!=null){
//			String mobileNumber="1007817712";
//					//(Customer)request.getSession().getAttribute("customer");
//			if(request.getSession().getAttribute(LOGGED_IN_PROMOTER)==null){
//				if(request.getServletPath().endsWith("addPromoterEntry")){
//					MgmPromoterDTO  mgmPromoterDTO=mgmServiceClient.getPromoterInfo(mobileNumber);
//					if(mgmPromoterDTO!=null){
//						request.getSession().setAttribute(LOGGED_IN_PROMOTER,mgmPromoterDTO);
//						if(mgmPromoterDTO.getParentId().floatValue()>0){
//							if(mgmPromoterDTO.getFirstName()==null || mgmPromoterDTO.getLastName()==null || mgmPromoterDTO.getNationalIdNo()==null){
//								throw new NotMGMCustomerException("Customer MSISDN:"+mobileNumber+" Not MGM Customer");
//							}
//						}
//					}else{
//						throw new NotMGMCustomerException("Customer MSISDN:"+mobileNumber+" Not MGM Customer");
//					}
//				}
//			}
//		//}
//		return super.preHandle(request, response, handler);
//	}

	public static final String LAST_MODEL_VIEW_ATTRIBUTE = LastModelAndViewInterceptor.class.getName() + ".lastModelAndView";
	public static final String LAST_MODEL_ATTRIBUTE = LastModelAndViewInterceptor.class.getName() + ".lastModel";
	public static final String LOGGED_IN_PROMOTER="loggedIn";
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    	if(modelAndView!=null)
        request.getSession().setAttribute(LAST_MODEL_VIEW_ATTRIBUTE, modelAndView);
        super.postHandle(request, response, handler, modelAndView);
    }

}
