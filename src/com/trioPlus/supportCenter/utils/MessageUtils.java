package com.trioPlus.supportCenter.utils;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;


@Scope("singleton")
public class MessageUtils {
	@Autowired
	static ReloadableResourceBundleMessageSource bundleMessageSource;  
public static String getMessage(String key){
	ReloadableResourceBundleMessageSource bundleMessageSource=new ReloadableResourceBundleMessageSource();
//	bundleMessageSource.setBasename("classpath:com/vis/selfServices/resources/mgm-messages");
	bundleMessageSource.setBasename("classpath:messages");

	return bundleMessageSource.getMessage(key, null, Locale.getDefault());
}
}
