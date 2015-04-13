package com.trioPlus.supportCenter.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.trioPlus.supportCenter.form.Manager;
import com.trioPlus.supportCenter.form.Project;
import com.trioPlus.supportCenter.form.TravelCostForm;




@Component("costFormValidator")
public class TravelFormValidator implements Validator
{
	private static final String START_DATE = null;

	@SuppressWarnings("unchecked")
	@Override
	public boolean supports(Class clazz)
	{
		return Project.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object model, Errors errors) {
		TravelCostForm board = (TravelCostForm) model;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "startDate",
				"required.startDate", "Start Date is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "endDate",
				"required.endDate", "End Date is required.");
		if (board.getStartDate() != null
				&& !isValidDate(new Date(), board.getStartDate()))
			errors.rejectValue("startDate", "startDate.invalid",
					"startDate is invalid");
		if (board.getEndDate() != null
				&& !isValidDate(board.getStartDate(), board.getEndDate()))
			errors.rejectValue("endDate", "endDate.invalid",
					"endDate is invalid");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "destinationId",
				"required.destinationId", "Destination is required.");
		if (board.getAccomodation() != 0
				&& !isValidNumber(board.getAccomodation()))
			errors.rejectValue("accomodation", "accomodation.invalid",
					"Accomodation is invalid");
		if (board.getFlightCost() != 0 && !isValidNumber(board.getFlightCost()))
			errors.rejectValue("flightCost", "flightCost.invalid",
					"flightCost is invalid");

		/*
		 * ValidationUtils.rejectIfEmpty(errors,
		 * "START_DATE","required.SURVEY_NAME", "Enter date");
		 */
	}
	 public boolean isValidNumber(double number){
	        String expression=".*[^0-9].*";
	        CharSequence inputStr = String.valueOf(number);
	        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(inputStr);
	        return matcher.matches();
	    }
	 public boolean isValidDate(Date date1,Date date2){
		
                  if(date1.after(date2)){
             return false;
         }

                  else if(date1.before(date2)){
             return true;
         }

                  else if(date1.equals(date2)){
             return false;
         }
                  return false;
	 }

}

