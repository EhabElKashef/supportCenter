package com.trioPlus.supportCenter.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.trioPlus.supportCenter.form.Manager;
import com.trioPlus.supportCenter.form.Project;




@Component("userFormValidator")
public class UserFormValidator implements Validator
{
	private static final String START_DATE = null;

	@SuppressWarnings("unchecked")
	@Override
	public boolean supports(Class clazz)
	{
		return Project.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object model, Errors errors)
	{
		Manager board=(Manager)model;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name","required.name", "Name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email","required.email", "Kindly Enter valid mail ");
		
		
	    if ( board.getEmail()!=null && !"".equals(board.getEmail()) &&!isValidEmailAddress(board.getEmail())) errors.rejectValue("email",
                  "email.invalid", "Email address is invalid");   

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user_id","required.user_id", "Kindly add user id");
//		 if ( board.getUser_id()!=0  &&!isValidNumber(board.getUser_id())) errors.rejectValue("user_id",
//                 "user_id.invalid", "User Id is invalid");   

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userType","required.userType", "Kindly choose customer type ");
		
		/*ValidationUtils.rejectIfEmpty(errors, "START_DATE","required.SURVEY_NAME", "Enter date");*/
	}
	 public boolean isValidEmailAddress(String emailAddress){
	        String expression="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	        CharSequence inputStr = emailAddress;
	        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(inputStr);
	        return matcher.matches();
	    }
	 
	 public boolean isValidName(String emailAddress){
	        String expression="^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	        CharSequence inputStr = emailAddress;
	        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(inputStr);
	        return matcher.matches();
	    }
	 public boolean isValidNumber(int number){
	        String expression="\\d{6}";
	        String inputStr = ""+number;
	        Pattern pattern = Pattern.compile(expression);
	        Matcher matcher = pattern.matcher(inputStr);
	        return matcher.matches();
	    }

}

