package com.trioPluse.supportCenter.utils;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.trioPluse.supportCenter.form.Project;




@Component("costFormValidator")
public class CostFormValidator implements Validator
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
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "costName","required.costName", "Name is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "paidInterval","required.paidInterval", "Kindly add Paid Interval ");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "system_Costcol","required.system_Costcol", "Kindly add Cost ");
		
		/*ValidationUtils.rejectIfEmpty(errors, "START_DATE","required.SURVEY_NAME", "Enter date");*/
	}

}

