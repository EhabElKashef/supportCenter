package com.trioPlus.supportCenter.dao;

import java.util.List;





import com.trioPlus.supportCenter.entity.Stakeholder;
import com.trioPlus.supportCenter.entity.SystemCost;
import com.trioPlus.supportCenter.entity.TravelCost;

public interface CostDAO {
	 public void save(SystemCost m);
     
	 public List<SystemCost> list();
	 public void deleteSystemCost(int id);
	 public void updateSystemCost(SystemCost s);
	 
	 public void saveTravelCost(TravelCost m);
	 public List<TravelCost> listTravelCost();
}
