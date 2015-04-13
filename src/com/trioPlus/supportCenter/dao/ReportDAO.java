package com.trioPlus.supportCenter.dao;

import java.util.List;

import com.trioPlus.supportCenter.entity.Report;

public interface ReportDAO {
	 public void save(Report m);
     
	    public List<Report> list();
	    public Report getReportById(int id);
	  
}
