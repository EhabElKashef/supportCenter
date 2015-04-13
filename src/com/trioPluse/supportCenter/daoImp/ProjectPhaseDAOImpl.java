package com.trioPluse.supportCenter.daoImp;

import java.util.List;








import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.trioPlus.supportCenter.dao.ProjectPhaseDAO;
import com.trioPlus.supportCenter.dao.UserDAO;
import com.trioPlus.supportCenter.entity.ProjectPhase;
import com.trioPlus.supportCenter.entity.User;

public class ProjectPhaseDAOImpl implements ProjectPhaseDAO {

	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	public void save(ProjectPhase m) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(m);
        tx.commit();
       // session.close();

	}

	public List<ProjectPhase> list() {
		Session session = this.sessionFactory.openSession();
        List<ProjectPhase> personList = session.createQuery("from ProjectPhase").list();
        session.close();
        return personList;
 
	}
     
   
}
