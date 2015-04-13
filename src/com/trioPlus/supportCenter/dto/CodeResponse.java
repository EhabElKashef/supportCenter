package com.trioPlus.supportCenter.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;


@JsonAutoDetect
public class CodeResponse {
	
	private String eCode;
	private String eDesc;
	
	public CodeResponse() {
		super();
	}
	public CodeResponse(String eCode, String eDesc) {
		super();
		this.eCode = eCode;
		this.eDesc = eDesc;
	}
	public String geteCode() {
		return eCode;
	}
	public void seteCode(String eCode) {
		this.eCode = eCode;
	}
	public String geteDesc() {
		return eDesc;
	}
	public void seteDesc(String eDesc) {
		this.eDesc = eDesc;
	}
	@Override
	public String toString() {
		return "CodeResponse [eCode=" + eCode + ", eDesc=" + eDesc + "]";
	}

	
}
