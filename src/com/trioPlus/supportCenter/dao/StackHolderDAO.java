package com.trioPlus.supportCenter.dao;

import java.util.List;




import com.trioPlus.supportCenter.entity.Stakeholder;
import com.trioPlus.supportCenter.entity.User;

public interface StackHolderDAO {
	 public void save(Stakeholder m);
     
	 public List<Stakeholder> list();
	 public void deleteStakeHolder(int id);
	 public void updateStakeHolder(Stakeholder s);
	 public Stakeholder getStakeholderById(int id);
}
