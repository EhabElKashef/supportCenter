package com.trioPluse.supportCenter.daoImp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.trioPlus.supportCenter.dao.ReportDAO;
import com.trioPlus.supportCenter.entity.Report;
import com.trioPlus.supportCenter.entity.User;

public class ReportDAOImpl implements ReportDAO {
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	@Override
	public void save(Report m) {
		// TODO Auto-generated method stub
				Session session = this.sessionFactory.getCurrentSession();
		        Transaction tx = session.beginTransaction();
		       
		        
		        session.persist(m);
		        
		        tx.commit();
		       // session.close();
	}

	@Override
	public List<Report> list() {
		Session session = this.sessionFactory.openSession();
        List<Report> personList = session.createQuery("from Report").list();
        System.out.println(personList);
        session.close();
        return personList;
	}

	@Override
	public Report getReportById(int id) {
		Session session = this.sessionFactory.openSession();
	       Report personList = (Report) session.get(Report.class, new Integer(id));
//	        		sessionFactory.getCurrentSession().getNamedQuery(
//	        		FIND_Manager_BY_ID).setParameter( "id", id).list();
	        session.close();
	        if (personList != null )
				return personList;
			else
				return null;
	}

	

	

	

}
