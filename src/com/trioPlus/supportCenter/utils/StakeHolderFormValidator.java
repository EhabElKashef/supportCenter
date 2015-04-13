package com.trioPlus.supportCenter.utils;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.trioPlus.supportCenter.form.Project;




@Component("stakeHolderFormValidator")
public class StakeHolderFormValidator implements Validator
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
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "stakeholder_name","required.stakeholder_name", "Name is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "projects","required.projects", "Kindly Choose project ");
		
		/*ValidationUtils.rejectIfEmpty(errors, "START_DATE","required.SURVEY_NAME", "Enter date");*/
	}

}

