package com.trioPlus.supportCenter.dao;

import java.util.List;

import com.trioPlus.supportCenter.entity.Project;
import com.trioPlus.supportCenter.entity.Stakeholder;
import com.trioPlus.supportCenter.entity.User;

public interface ProjectDAO {
 public void save(Project m);
     
	 public List<Project> list();
	 public void deleteProject(int id);
	 public void updateProject(Project s);
	 public Project getById(int projectId);
}
