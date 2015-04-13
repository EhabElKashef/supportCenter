package com.trioPluse.supportCenter.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.trioPlus.supportCenter.dto.CodeResponse;
import com.trioPluse.supportCenter.services.DataService;
import com.trioPluse.supportCenter.utils.JasonExceptionHander;

@Controller
@RequestMapping(value = "/")

public class UserProfileController {
	@Autowired
	private DataService dataService;
	
	@RequestMapping(value = "/verifyUser", method = RequestMethod.POST)
	@ResponseBody
	public CodeResponse verifyUser(@RequestParam(required = true) String msisdn)  {
		try {
			dataService.verifyUser(msisdn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CodeResponse codeResponse=new CodeResponse();
		codeResponse.seteCode("0");
		codeResponse.seteDesc("Success");
		return codeResponse;
	}
	
	
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	@ResponseBody
	public CodeResponse registerUser(@RequestParam(required = true) String msisdn,@RequestParam(required = true) String verificationKey,@RequestParam(required = true) String email,@RequestParam(required=true) String name,@RequestParam (required=true)String password)  {
		try {
			dataService.registerUser(msisdn, verificationKey, password, name, email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		CodeResponse codeResponse=new CodeResponse();
		codeResponse.seteCode("0");
		codeResponse.seteDesc("Success");
		return codeResponse;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public CodeResponse login(@RequestParam(required = true) String msisdn,@RequestParam (required=true)String password)  {
//		try {
//			dataService.registerUser(msisdn, password);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			
//		}
		CodeResponse codeResponse=new CodeResponse();
		codeResponse.seteCode("0");
		codeResponse.seteDesc("Success");
		return codeResponse;
	}
	
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	@ExceptionHandler(Exception.class)
	public @ResponseBody CodeResponse exceptionHandling(Exception exception)
	{
		JasonExceptionHander exceptionHander=new JasonExceptionHander(exception);
		CodeResponse codeResponse=exceptionHander.getCodeResponse();
		return codeResponse;
	}
	
}
