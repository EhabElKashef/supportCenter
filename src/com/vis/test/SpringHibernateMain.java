package com.vis.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.trioPlus.supportCenter.dao.ProjectPhaseDAO;
import com.trioPlus.supportCenter.dao.UserDAO;
import com.trioPlus.supportCenter.entity.ProjectPhase;
import com.trioPlus.supportCenter.entity.User;

public class SpringHibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
         
		 ProjectPhaseDAO personDAO = context.getBean(ProjectPhaseDAO.class);
	         
	        ProjectPhase person = new ProjectPhase();
	        person.setId(1);
	        person.setPhaseName("tesing");
	        //person.set("India");
	         
	        personDAO.save(person);
	         
	        System.out.println("Person::"+person);
	         
	        List<ProjectPhase> list = personDAO.list();
	         
	        for(ProjectPhase p : list){
	            System.out.println("Person List::"+p);
	        }
	        //close resources
	        context.close();   
	    }

	

}
