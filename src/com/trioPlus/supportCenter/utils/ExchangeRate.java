package com.trioPlus.supportCenter.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ExchangeRate {
	 public double getRate(String from, String to) {
	        try {
	            URL url = new URL("http://quote.yahoo.com/d/quotes.csv?f=l1&s=" + from + to + "=X");
	            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
	            String line = reader.readLine();
	            if (line.length() > 0) {
	                return Double.parseDouble(line);
	            }
	            reader.close();
	        } catch (IOException | NumberFormatException e) {
	            System.out.println(e.getMessage());
	        }
	 
	        return 0;
	    }
	 
	    public double getEuroEGPRate() {
	        return getRate("EUR", "EGP");
	    }
	    public double getUsdEGPRate() {
	        return getRate("GBP", "EGP");
	    }
	 
	    public double getGoldEuroRate() {
	        return getRate("XAU", "EUR");
	    }
	 
	    public double getSilverEuroRate() {
	        return getRate("XAG", "EUR");
	    }
	 
	    public static void main(String[] args) {
	        ExchangeRate exchange = new ExchangeRate();
	 
	        double rateSilver = exchange.getSilverEuroRate();
	        System.out.println("Silver/Euro: " + rateSilver);
	 
	        double rateGold = exchange.getGoldEuroRate();
	        System.out.println("Gold/Euro: " + rateGold);
	 
	        double rateUsd = exchange.getUsdEGPRate();
	        System.out.println("Euro/USD: " + rateUsd);
	    }
	}