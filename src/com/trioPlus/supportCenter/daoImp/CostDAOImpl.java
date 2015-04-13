package com.trioPlus.supportCenter.daoImp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.trioPlus.supportCenter.dao.CostDAO;
import com.trioPlus.supportCenter.entity.SrCommentType;
import com.trioPlus.supportCenter.entity.Stakeholder;
import com.trioPlus.supportCenter.entity.SystemCost;
import com.trioPlus.supportCenter.entity.TravelCost;

public class CostDAOImpl implements CostDAO {
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	@Override
	public void save(SystemCost m) {
		Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(m);
        tx.commit();
        session.close();
	}

	@Override
	public List<SystemCost> list() {
		Session session = this.sessionFactory.openSession();
        List<SystemCost> personList = session.createQuery("from SystemCost").list();
        session.close();
        return personList;
	}

	@Override
	public void deleteSystemCost(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		SystemCost p = (SystemCost) session.load(SystemCost.class, new Integer(id));
        if(null != p){
            session.delete(p);
        }
        //logger.info("Person deleted successfully, person details="+p);

	}

	@Override
	public void updateSystemCost(SystemCost s) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
        session.update(s);
        
	}
	@Override
	public void saveTravelCost(TravelCost m) {
		Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(m);
        tx.commit();
        session.close();
	}
	@Override
	public List<TravelCost> listTravelCost() {
		Session session = this.sessionFactory.openSession();
        List<TravelCost> personList = session.createQuery("from TravelCost").list();
        session.close();
        return personList;
	}

}
