package com.trioPlus.supportCenter.daoImp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.trioPlus.supportCenter.dao.UserVerificationDAO;
import com.trioPlus.supportCenter.entity.User;
import com.trioPlus.supportCenter.entity.UserVerification;

public class UserVerificationDAOImpl implements UserVerificationDAO {
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@Override
	public void addVerificationKey(UserVerification userVerification) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();        
        tx.commit();
       // session.close();
	}

	@Override
	public UserVerification getKeyByMsisdn(String msisdn,String verificationKey) {
		Session session = this.sessionFactory.openSession();
		Criteria criteria = session.createCriteria(UserVerification.class);
		criteria.add( Restrictions.like("msisdn", msisdn) );
		criteria.add(Restrictions.like("verificationKey", verificationKey));
		List<UserVerification> result = criteria.list();
		if(result!=null)
		return result.get(0);	
		else{
			return null;
		}
		}

}
