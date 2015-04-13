package com.trioPluse.supportCenter.utils;

import java.util.HashMap;
import java.util.Map;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.SmsFactory;
import com.twilio.sdk.resource.instance.Sms;
public class SmsSender {
/* Find your sid and token at twilio.com/user/account */
	public static final String ACCOUNT_SID = "ACdef5cc2f971dfc3d7c9813669b452306"; 
	 public static final String AUTH_TOKEN = "5d8957c8810c081a66b7e85cfdc19083"; 
	 public static void sendSMS(String msisdn,String msg) throws TwilioRestException {
		 TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN); 
		 
		 // Build the parameters 
		 Map<String,String> params = new HashMap<String,String>();
  
		 params.put("From", "+17744351167");    
		 params.put("to", msisdn);
		 params.put("Body", msg);
		 SmsFactory messageFactory = client.getAccount().getSmsFactory(); 
		 Sms message = messageFactory.create(params); 
		 System.out.println(message.getSid()); 
}
}