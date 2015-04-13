package com.trioPlus.supportCenter.dao;

import java.util.List;



import com.trioPlus.supportCenter.entity.ProjectPhase;

public interface ProjectPhaseDAO {
	 public void save(ProjectPhase m);
     
	    public List<ProjectPhase> list();
	   
}
