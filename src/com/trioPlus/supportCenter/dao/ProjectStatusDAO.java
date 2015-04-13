package com.trioPlus.supportCenter.dao;

import java.util.List;

import com.trioPlus.supportCenter.entity.ProjectStatus;

public interface ProjectStatusDAO {
	public void save(ProjectStatus m);

	public List<ProjectStatus> list();

	public void deleteProjectStatus(int id);

	public void updateProjectStatus(ProjectStatus s);

}
