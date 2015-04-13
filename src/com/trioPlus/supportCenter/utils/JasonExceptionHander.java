package com.trioPlus.supportCenter.utils;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.springframework.dao.EmptyResultDataAccessException;

import com.trioPlus.supportCenter.dto.CodeResponse;
import com.trioPlus.supportCenter.exception.BusinessException;
import com.trioPlus.supportCenter.exception.Code;
import com.trioPlus.supportCenter.exception.DataAccessException;



@JsonAutoDetect
public class JasonExceptionHander {

	private Throwable ex;
	private String message;
	private Integer code;
	
	public JasonExceptionHander(Integer code) {
		this.code=code;
	}
	public JasonExceptionHander(Integer code,Throwable ex) {
		this.code=code;
		this.ex=ex;
	}
	public JasonExceptionHander(Integer code,String message, Throwable ex) {
		this.code=code;
		this.message = message;
		this.ex = ex;
	}
	public JasonExceptionHander(Integer code,String message) {
		this.code=code;
		this.message = message;
	}
	
	public JasonExceptionHander(String message) {
		this.message = message;
	}
 
	public JasonExceptionHander(String message, Throwable ex) {
		this.message = message;
		this.ex = ex;
	}
	
	
	public JasonExceptionHander(Throwable ex) {
		super();
		this.ex = ex;
	}
	public String getMessage() {
		return message;
	}
	
	public Integer getCode() {
		return code;
	}
	public CodeResponse getCodeResponse()
	{
		CodeResponse codeResponse=null;
		if(ex!=null)
		{
			if (ex instanceof BusinessException) {
				codeResponse=new CodeResponse(String.valueOf(((BusinessException) ex).getCode().getValue()), ((BusinessException) ex).getMessage());
			}else if (ex instanceof DataAccessException) {
				if(((DataAccessException) ex).getCode()!=null)
				codeResponse=new CodeResponse(String.valueOf(((DataAccessException) ex).getCode().getValue()), ((DataAccessException) ex).getMessage());
				else
					codeResponse=new CodeResponse(String.valueOf(Code.TIBCO_ERROR.getValue()),ex.getMessage());
			}else if(ex instanceof EmptyResultDataAccessException){
				codeResponse=new CodeResponse("-100", "No record found");
			}
			else{
				ex.printStackTrace();
				codeResponse=new CodeResponse("-500", "Error Occured");
			}
		}
		return codeResponse;
	}

}
