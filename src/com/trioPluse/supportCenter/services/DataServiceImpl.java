package com.trioPluse.supportCenter.services;



import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trioPlus.supportCenter.dao.CostDAO;
import com.trioPlus.supportCenter.dao.DestinationDAO;
import com.trioPlus.supportCenter.dao.NotificationDAO;
import com.trioPlus.supportCenter.dao.ProjectDAO;
import com.trioPlus.supportCenter.dao.ProjectPhaseDAO;
import com.trioPlus.supportCenter.dao.ProjectStatusDAO;
import com.trioPlus.supportCenter.dao.ReportDAO;
import com.trioPlus.supportCenter.dao.SRCommentTypeDAO;
import com.trioPlus.supportCenter.dao.SRScopeDAO;
import com.trioPlus.supportCenter.dao.StackHolderDAO;
import com.trioPlus.supportCenter.dao.SupportCenterUserDAO;
import com.trioPlus.supportCenter.dao.UserDAO;
import com.trioPlus.supportCenter.dao.UserVerificationDAO;
import com.trioPlus.supportCenter.entity.Report;
import com.trioPlus.supportCenter.entity.User;
import com.trioPlus.supportCenter.entity.UserRoles;
import com.trioPlus.supportCenter.entity.UserVerification;
import com.trioPlus.supportCenter.exception.Code;
import com.trioPlus.supportCenter.exception.NotValidVerificationKey;
import com.trioPlus.supportCenter.exception.UserAlreadyExistException;
import com.trioPluse.supportCenter.daoImp.StakeHolderDAOImpl;
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
import com.trioPluse.supportCenter.utils.CommonConstants;
import com.trioPluse.supportCenter.utils.DateUtil;
import com.trioPluse.supportCenter.utils.ExchangeRate;
import com.trioPluse.supportCenter.utils.KeyUtils;
import com.trioPluse.supportCenter.utils.PropertiesReader;
import com.trioPluse.supportCenter.utils.SmsSender;



@Component
public class DataServiceImpl implements DataService {
	@Autowired  
	private SupportCenterUserDAO supportCenterUserDAO;
	@Autowired
	private UserVerificationDAO userVerificationDAO;

	@Override
	public void registerUser(String msisdn, String verificationKey,
			String password, String name, String email) throws Exception {
		// TODO Auto-generated method stub
		UserVerification userVerification=userVerificationDAO.getKeyByMsisdn(msisdn, verificationKey);
		if(userVerification==null){
			throw new NotValidVerificationKey(Code.NO_DATE_FOUND);
		}else{
			Date generationKeyDate= 
			userVerification.getGenerationKeyTime();
			boolean flag= DateUtil.checkDifference(generationKeyDate);
			if(!flag){
				throw new NotValidVerificationKey(Code.EXPIRED_KEY);
			}
		}
		User user=supportCenterUserDAO.getUserByMSISDN(msisdn);
		if(user!=null){
			throw new UserAlreadyExistException(Code.USER_ALREADY_EXIST);
		}else{
			User user2=new User();
			user2.setMsisdn(msisdn);
			user2.setEmail(email);
			user2.setName(name);
			user2.setPassword(password);
			supportCenterUserDAO.registerUser(user2);
		}
		
	}

	@Override
	public void verifyUser(String msisdn) throws Exception {
		// TODO Auto-generated method stub
		String key=KeyUtils.generateActivationKey();
		UserVerification userVerification=new UserVerification();
		userVerification.setGenerationKeyTime(new Date());
		userVerification.setMsisdn(msisdn);
		userVerification.setVerificationKey(key);
		userVerificationDAO.addVerificationKey(userVerification);
		String	msg=MessageFormat.format(PropertiesReader.getInstance(CommonConstants.COMMON_FILE_PROP).getProperty(CommonConstants.REGISTERATION_ACTIVATE_SMS_EN), new Object[]{key});;
		SmsSender.sendSMS(msisdn, msg);
	} 
	
		
}
