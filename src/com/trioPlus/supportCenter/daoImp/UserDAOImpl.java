package com.trioPlus.supportCenter.daoImp;

import java.util.List;











import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.trioPlus.supportCenter.dao.UserDAO;
import com.trioPlus.supportCenter.entity.Stakeholder;
import com.trioPlus.supportCenter.entity.User;
import com.trioPlus.supportCenter.entity.UserRoles;

public class UserDAOImpl implements UserDAO {
	private static final String FIND_Manager_BY_ID = "FROM User m  where m.id=:id";
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	public void save(User m,List<UserRoles> roles) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        m.setPassword("test1234");
        
        session.persist(m);
        for (int i = 0; i < roles.size(); i++) {
        	session.persist(roles.get(i));	
		}
        
        tx.commit();
       // session.close();

	}

	public List<User> list() {
		Session session = this.sessionFactory.openSession();
        List<User> personList = session.createQuery("from User").list();
        System.out.println(personList);
        session.close();
        return personList;
 
	}
	
	public List<User> listManager() {
		Session session = this.sessionFactory.openSession();
        List<User> personList = session.createQuery("from User m where m.userType='M'").list();
        System.out.println(personList);
        session.close();
        return personList;
 
	}

	public List<User> listUser() {
		Session session = this.sessionFactory.openSession();
        List<User> personList = session.createQuery("from User m where m.userType='U'").list();
        System.out.println(personList);
        session.close();
        return personList;
 
	}

	@Override
	public User getManagerById(int id) {
		Session session = this.sessionFactory.openSession();
       User personList = (User) session.get(User.class, new Integer(id));
//        		sessionFactory.getCurrentSession().getNamedQuery(
//        		FIND_Manager_BY_ID).setParameter( "id", id).list();
        session.close();
        if (personList != null )
			return personList;
		else
			return null;

         	}

	@Override
	public User get(String username) {
		Session session = this.sessionFactory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add( Restrictions.like("username", username) );
		List<User> result = criteria.list();
		
		return result.get(0);

   
	      

	}
	
	
	
	@Override
	public User getById(int userId) {
		Session session = this.sessionFactory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add( Restrictions.like("user_id", userId) );
		List<User> result = criteria.list();
		
		return result.get(0);

	}
     
   
}
