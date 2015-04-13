package com.trioPlus.supportCenter.dao;

import com.trioPlus.supportCenter.entity.UserVerification;

public interface UserVerificationDAO {
void addVerificationKey(UserVerification userVerification);
UserVerification getKeyByMsisdn(String msisdn,String verificationKey);
}
