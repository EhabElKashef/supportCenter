package com.trioPlus.supportCenter.dao;

import com.trioPlus.supportCenter.entity.User;

public interface SupportCenterUserDAO {
 void registerUser(User user);
 User getUserByMSISDN(String msisdn);
}
