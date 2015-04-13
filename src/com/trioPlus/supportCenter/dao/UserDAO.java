package com.trioPlus.supportCenter.dao;

import java.util.List;

import com.trioPlus.supportCenter.entity.User;
import com.trioPlus.supportCenter.entity.UserRoles;

public interface UserDAO {
	 public void save(User m,List<UserRoles> roles);
     
	    public List<User> list();
	    public User getManagerById(int id);
	    public List<User> listManager();
	    public User get(String username);
	    public User getById(int userId);
	    public List<User> listUser();
	   
}
