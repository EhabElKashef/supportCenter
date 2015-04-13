package com.trioPlus.supportCenter.dao;

import java.util.List;

import com.trioPlus.supportCenter.entity.SrCommentType;
import com.trioPlus.supportCenter.entity.User;

public interface SRCommentTypeDAO {
	 public void save(SrCommentType m);
     
	    public List<SrCommentType> list();
	
}
