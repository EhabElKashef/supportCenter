package com.trioPluse.supportCenter.daoImp;

import java.util.List;













import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.trioPlus.supportCenter.dao.SupportCenterUserDAO;
import com.trioPlus.supportCenter.dao.UserDAO;
import com.trioPlus.supportCenter.entity.Stakeholder;
import com.trioPlus.supportCenter.entity.User;
import com.trioPlus.supportCenter.entity.UserRoles;

public class SupportCenterUserDAOImpl implements SupportCenterUserDAO {
	//private static final String FIND_Manager_BY_ID = "FROM User m  where m.id=:id";
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

		@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
			Session session = this.sessionFactory.getCurrentSession();
	        Transaction tx = session.beginTransaction();        
	        tx.commit();
	        session.close();
	}

		@Override
		public User getUserByMSISDN(String msisdn) {
			Session session = this.sessionFactory.openSession();
			Criteria criteria = session.createCriteria(User.class);
			criteria.add( Restrictions.like("msisdn", msisdn) );
			List<User> result = criteria.list();
			
			return result.get(0);
	}
     
   
}
