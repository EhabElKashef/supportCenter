package com.trioPluse.supportCenter.daoImp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.trioPlus.supportCenter.dao.StackHolderDAO;
import com.trioPlus.supportCenter.entity.Stakeholder;
import com.trioPlus.supportCenter.entity.User;

public class StakeHolderDAOImpl implements StackHolderDAO {
	private static final Logger logger = LoggerFactory.getLogger(StakeHolderDAOImpl.class);
	 
	
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	
	
	@Override
	public void save(Stakeholder m) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.persist(m);
        tx.commit();
       // session.close();
	}

	@Override
	public List<Stakeholder> list() {
		Session session = this.sessionFactory.openSession();
        List<Stakeholder> stakeholder = session.createQuery("from Stakeholder").list();
        System.out.println(stakeholder);
        session.close();
        return stakeholder;
 	}

	
	@Override
	public Stakeholder getStakeholderById(int id) {
		Session session = this.sessionFactory.openSession();
		Stakeholder personList = (Stakeholder) session.get(Stakeholder.class, new Integer(id));
//        		sessionFactory.getCurrentSession().getNamedQuery(
//        		FIND_Manager_BY_ID).setParameter( "id", id).list();
        session.close();
        if (personList != null )
			return personList;
		else
			return null;

         	}

	@Override
	public void deleteStakeHolder(int id) {
		Session session = this.sessionFactory.getCurrentSession();
        Stakeholder p = (Stakeholder) session.load(Stakeholder.class, new Integer(id));
        if(null != p){
            session.delete(p);
        }
        //logger.info("Person deleted successfully, person details="+p);

	}

	@Override
	public void updateStakeHolder(Stakeholder s) {
		Session session = this.sessionFactory.getCurrentSession();
        session.update(s);
        
	}

}
