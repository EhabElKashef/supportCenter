package com.trioPlus.supportCenter.dao;

import java.util.List;

import com.trioPlus.supportCenter.entity.Stakeholder;
import com.trioPlus.supportCenter.entity.SystemNotification;

public interface NotificationDAO {
	public void save(SystemNotification m);
    
	 public List<SystemNotification> list();
	 public void deleteSystemNotification(int id);
	 public void updateSystemNotification(Stakeholder s);
	 public SystemNotification getSystemNotificationById(int id);
}
