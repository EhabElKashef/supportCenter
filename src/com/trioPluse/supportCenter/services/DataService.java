package com.trioPluse.supportCenter.services;

import java.util.List;















import com.trioPlus.supportCenter.entity.Report;
import com.trioPlus.supportCenter.entity.User;
import com.trioPlus.supportCenter.entity.UserRoles;
import com.trioPluse.supportCenter.form.Destination;
import com.trioPluse.supportCenter.form.Manager;
import com.trioPluse.supportCenter.form.Project;
import com.trioPluse.supportCenter.form.ProjectPhase;
import com.trioPluse.supportCenter.form.ProjectStatus;
import com.trioPluse.supportCenter.form.ReportForm;
import com.trioPluse.supportCenter.form.ReportFormList;
import com.trioPluse.supportCenter.form.SrCommentType;
import com.trioPluse.supportCenter.form.SrScope;
import com.trioPluse.supportCenter.form.Stakeholder;
import com.trioPluse.supportCenter.form.SystemCost;
import com.trioPluse.supportCenter.form.SystemNotification;
import com.trioPluse.supportCenter.form.TravelCostForm;


public interface DataService {
	void registerUser(String msisdn,String verificationKey,String password,String name,String email)throws Exception;	 
	void verifyUser(String msisdn) throws Exception;
}
