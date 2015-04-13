package com.trioPlus.supportCenter.dao;

import java.util.List;





import com.trioPlus.supportCenter.entity.Destination;
import com.trioPlus.supportCenter.entity.Stakeholder;
import com.trioPlus.supportCenter.entity.SystemCost;

public interface DestinationDAO {
	 public void save(Destination m);
     
	 public List<Destination> list();
	 public void deleteDestination(int id);
	 public void updateDestination(Destination s);
	 public Destination getDestinationById(int id);
}
