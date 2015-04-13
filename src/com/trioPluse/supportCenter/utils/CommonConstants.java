package com.trioPluse.supportCenter.utils;

public class CommonConstants {
	
	public static final String COMMON_FILE_PROP="commonConfig.properties";
	
	// -------------------EMAIL CONSTANTS------------------
	public static final String MAIL_SERVER = "mail.server";

	public static final String MAIL_HEADER = "mail.header";

	public static final String MAIL_SENDER = "mail.sender";

	public static final String MAIL_CUSTOMER_SENDER = "mail.customer.sender";

	public static final String MAIL_RECIEPIENTS = "mail.reciepient";
	
	/******************** E-mail Msisdn Selling Reservation Code  **************************************************/
	public static final String MAIL_BODY_RESERVE_EN_HEADER = "msisdnSelling.mail.body.en.header";

	public static final String MAIL_BODY_RESERVE_EN_FOOTER = "msisdnSelling.mail.body.en.footer";
	
	public static final String MAIL_ACTIVATION_KEY_REQUEST_RESERVE_EN_SUBJECT = "msisdnSelling.mail.reservation.code.request.en.subject";
	
	public static final String MAIL_BODY_RESERVE_AR_HEADER = "msisdnSelling.mail.body.ar.header";

	public static final String MAIL_BODY_RESERVE_AR_FOOTER = "msisdnSelling.mail.body.ar.footer";
	
	public static final String MAIL_ACTIVATION_KEY_REQUEST_RESERVE_AR_SUBJECT = "msisdnSelling.mail.reservation.code.request.ar.subject";
	
	/******************** Bill Notification Service***************************************/
	public static final String BILL_NOTIFICATION_ACTIVATE_SMS_EN="bill.notification.activation.sms.en";
	
	/******************** Registeration Service***************************************/
	public static final String REGISTERATION_ACTIVATE_SMS_EN="registeration.activation.code.sms.en";
	
	public static final String REGISTERATION_ACTIVATE_SMS_AR="registeration.activation.code.sms.ar";
	
	public static final String REGISTERATION_CRYPTO_PASSWORD_KEY="userprofile.userid";
	
	public static final int PREPAID_DATA_PAY_AS_YOU_GO=1;
	
	public static final int PREPAID_DATA_MONTHLY_BUNDLE=2;

	public static final int PREPAID_DATA_DAILY_TARRIF=8;
	
	public static final int VOICE_LINE_FLAG=3;
	
	public static final int PREPAID_DATA_DUMMY=0;
	
	public static final String CUSTOMER_TYPE_CONSUMER = "0";
	
	public static final String CUSTOMER_TYPE_BUSINESS = "1";
	
	public static final String BILL_ACTIVATION_PASS_SMS="MY010_PASS_SMS";
	public static final String BILL_AUTH_ACTIV_SMS="MY010_BILL_AUTH_SMS";
}
