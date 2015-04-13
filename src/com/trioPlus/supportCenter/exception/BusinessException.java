package com.trioPlus.supportCenter.exception;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private Throwable ex;
	private String message;
	private Code code;
	
	public BusinessException(Code code) {
		this.code=code;
	}
	public BusinessException(Code code,Throwable ex) {
		this.code=code;
		this.ex=ex;
	}
	public BusinessException(Code code,String message, Throwable ex) {
		this.code=code;
		this.message = message;
		this.ex = ex;
	}
	public BusinessException(Code code,String message) {
		this.code=code;
		this.message = message;
	}
	
	public BusinessException(String message) {
		this.message = message;
	}
 
	public BusinessException(String message, Throwable ex) {
		this.message = message;
		this.ex = ex;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	public Code getCode()
	{
		return code;
	}

}
