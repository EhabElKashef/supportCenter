package com.trioPluse.supportCenter.utils;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.trioPluse.supportCenter.form.Project;




@Component("projectFormValidator")
public class ProjectFormValidator implements Validator
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
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "projectName","required.projectName", "Project name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "startDate","required.startDate", "Start Date is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "endDate","required.endDate", "End Date is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "estimatedTime","required.estimatedTime", "estimated date can not be blank.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "projectStatusId","required.projectStatusId", "Kindly Choose project status");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "managerId","required.managerId", "Kindly Choose project manager");
		
		/*ValidationUtils.rejectIfEmpty(errors, "START_DATE","required.SURVEY_NAME", "Enter date");*/
	}

}

