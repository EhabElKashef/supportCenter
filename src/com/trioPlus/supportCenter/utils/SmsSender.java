package com.trioPlus.supportCenter.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
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
		 params.put("To", "+2"+msisdn);
		 params.put("Body", msg);
		 SmsFactory messageFactory = client.getAccount().getSmsFactory(); 
		 Sms message = messageFactory.create(params); 
		 System.out.println(message.getSid()); 
}
	 
	 static public String stringToHex(String s) {
	        char[] chars = s.toCharArray();
	        String next;
	        StringBuffer output = new StringBuffer();
	        for (int i = 0; i < chars.length; i++) {
	            next = Integer.toHexString((int)chars[i]);
	            // Unfortunately, toHexString doesn't pad with zeroes, so we have to.
	            for (int j = 0; j < (4-next.length()); j++)  {
	                output.append("0");
	            }
	            output.append(next);
	        }
	        return output.toString();
	    }

	 public static void SendSMS(String msisdn,String msg){
		 try{
		 String data = "";
         /*
          * Note the suggested encoding for certain parameters, notably
          * the username, password and especially the message.  ISO-8859-1
          * is essentially the character set that we use for message bodies,
          * with a few exceptions for e.g. Greek characters.  For a full list,
          * see:  http://developer.bulksms.com/eapi/submission/character-encoding/
          */
         data += "username=" + URLEncoder.encode("myusername", "ISO-8859-1");
         data += "&password=" + URLEncoder.encode("xxxxxx", "ISO-8859-1");
         data += "&message=" + stringToHex("This is a test");
         data += "&dca=16bit";
         data += "&want_report=1";
         data += "&msisdn=44123123123";

         // Send data
         // Please see the FAQ regarding HTTPS (port 443) and HTTP (port 80/5567)
         URL url = new URL("«EAPI URL»/submission/send_sms/2/2.0");

         URLConnection conn = url.openConnection();
         conn.setDoOutput(true);
         OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
         wr.write(data);
         wr.flush();

         // Get the response
         BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
         String line;
         while ((line = rd.readLine()) != null) {
             // Print the response output...
             System.out.println(line);
         }
         wr.close();
         rd.close();
     } catch (Exception e) {
         e.printStackTrace();
     }
	 }
}