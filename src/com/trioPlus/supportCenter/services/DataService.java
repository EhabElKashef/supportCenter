package com.trioPlus.supportCenter.services;

import java.util.List;
















import com.trioPlus.supportCenter.entity.Report;
import com.trioPlus.supportCenter.entity.User;
import com.trioPlus.supportCenter.entity.UserRoles;
import com.trioPlus.supportCenter.form.Destination;
import com.trioPlus.supportCenter.form.Manager;
import com.trioPlus.supportCenter.form.Project;
import com.trioPlus.supportCenter.form.ProjectPhase;
import com.trioPlus.supportCenter.form.ProjectStatus;
import com.trioPlus.supportCenter.form.ReportForm;
import com.trioPlus.supportCenter.form.ReportFormList;
import com.trioPlus.supportCenter.form.SrCommentType;
import com.trioPlus.supportCenter.form.SrScope;
import com.trioPlus.supportCenter.form.Stakeholder;
import com.trioPlus.supportCenter.form.SystemCost;
import com.trioPlus.supportCenter.form.SystemNotification;
import com.trioPlus.supportCenter.form.TravelCostForm;


public interface DataService {
	void registerUser(String msisdn,String verificationKey,String password,String name,String email)throws Exception;	 
	void verifyUser(String msisdn) throws Exception;
}
