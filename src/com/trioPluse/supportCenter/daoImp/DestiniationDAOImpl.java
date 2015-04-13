package com.trioPluse.supportCenter.daoImp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.trioPlus.supportCenter.dao.DestinationDAO;
import com.trioPlus.supportCenter.dao.StackHolderDAO;
import com.trioPlus.supportCenter.entity.Destination;
import com.trioPlus.supportCenter.entity.Stakeholder;
import com.trioPlus.supportCenter.entity.User;

public class DestiniationDAOImpl implements DestinationDAO {
	private static final Logger logger = LoggerFactory.getLogger(DestiniationDAOImpl.class);
	 
	
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	
	
	@Override
	public void save(Destination m) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.persist(m);
        tx.commit();
       // session.close();
	}

	@Override
	public List<Destination> list() {
		Session session = this.sessionFactory.openSession();
        List<Destination> stakeholder = session.createQuery("from Destination").list();
        System.out.println(stakeholder);
        session.close();
        return stakeholder;
 	}

	
	@Override
	public Destination getDestinationById(int id) {
		Session session = this.sessionFactory.openSession();
		Destination personList = (Destination) session.get(Destination.class, new Integer(id));
//        		sessionFactory.getCurrentSession().getNamedQuery(
//        		FIND_Manager_BY_ID).setParameter( "id", id).list();
        session.close();
        if (personList != null )
			return personList;
		else
			return null;

         	}

	@Override
	public void deleteDestination(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Destination p = (Destination) session.load(Destination.class, new Integer(id));
        if(null != p){
            session.delete(p);
        }
        //logger.info("Person deleted successfully, person details="+p);

	}

	@Override
	public void updateDestination(Destination s) {
		Session session = this.sessionFactory.getCurrentSession();
        session.update(s);
        
	}

}
