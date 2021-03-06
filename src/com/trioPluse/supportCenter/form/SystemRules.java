package com.trioPluse.supportCenter.form;

// default package
// Generated Jan 10, 2015 1:07:11 PM by Hibernate Tools 3.4.0.CR1

/**
 * SystemRules generated by hbm2java
 */
public class SystemRules implements java.io.Serializable {

	private int ruleId;
	private String rule1;
	private String rule2;
	private String rule3;
	private String rule4;
	private String rule5;

	public SystemRules() {
	}

	public SystemRules(int ruleId) {
		this.ruleId = ruleId;
	}

	public SystemRules(int ruleId, String rule1, String rule2, String rule3,
			String rule4, String rule5) {
		this.ruleId = ruleId;
		this.rule1 = rule1;
		this.rule2 = rule2;
		this.rule3 = rule3;
		this.rule4 = rule4;
		this.rule5 = rule5;
	}

	public int getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

	public String getRule1() {
		return this.rule1;
	}

	public void setRule1(String rule1) {
		this.rule1 = rule1;
	}

	public String getRule2() {
		return this.rule2;
	}

	public void setRule2(String rule2) {
		this.rule2 = rule2;
	}

	public String getRule3() {
		return this.rule3;
	}

	public void setRule3(String rule3) {
		this.rule3 = rule3;
	}

	public String getRule4() {
		return this.rule4;
	}

	public void setRule4(String rule4) {
		this.rule4 = rule4;
	}

	public String getRule5() {
		return this.rule5;
	}

	public void setRule5(String rule5) {
		this.rule5 = rule5;
	}

}
