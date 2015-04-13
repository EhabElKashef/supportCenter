package com.trioPluse.supportCenter.utils;

import java.util.Date;

public class DateUtil {
public static boolean checkDifference(Date d1){
	{
		Date d2 = new Date();
	    // Date d1 = new Date(1384831803875l);

	        long diff = d2.getTime() - d1.getTime();
	        long diffSeconds = diff / 1000 % 60;
	        long diffMinutes = diff / (60 * 1000) % 60;
	        if(diffMinutes<=20)
	        	return true;
	        else
	        	return false;
	     
}


}
}
