package com.trioPlus.supportCenter.dao;

import java.util.List;

import com.trioPlus.supportCenter.entity.ProjectStatus;
import com.trioPlus.supportCenter.entity.SrCommentType;
import com.trioPlus.supportCenter.entity.SrScope;
import com.trioPlus.supportCenter.entity.User;

public interface SRScopeDAO {
	public void save(SrScope m);

	public List<SrScope> list();

	public void deleteSrScope(int id);

	public void updateSrScope(SrScope s);

}
