package com.trioPluse.supportCenter.daoImp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.trioPlus.supportCenter.dao.SRCommentTypeDAO;
import com.trioPlus.supportCenter.entity.SrCommentType;
import com.trioPlus.supportCenter.entity.User;

public class SRCommentTypeDAOImpl implements SRCommentTypeDAO {
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	public void save(SrCommentType m) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(m);
        tx.commit();
        session.close();

	}

	public List<SrCommentType> list() {
		Session session = this.sessionFactory.openSession();
        List<SrCommentType> personList = session.createQuery("from SrCommentType").list();
        session.close();
        return personList;
 	}

	

}
