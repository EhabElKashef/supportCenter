package com.trioPlus.supportCenter.daoImp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.trioPlus.supportCenter.dao.SRScopeDAO;
import com.trioPlus.supportCenter.dao.StackHolderDAO;
import com.trioPlus.supportCenter.entity.SrScope;
import com.trioPlus.supportCenter.entity.Stakeholder;
import com.trioPlus.supportCenter.entity.User;

public class SRScopeDAOImpl implements SRScopeDAO {
	//private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	 
	
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	
	
	@Override
	public void save(SrScope m) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.persist(m);
        tx.commit();
       // session.close();
	}

	@Override
	public List<SrScope> list() {
		Session session = this.sessionFactory.openSession();
        List<SrScope> stakeholder = session.createQuery("from SrScope").list();
        System.out.println(stakeholder);
        session.close();
        return stakeholder;
 	}

	@Override
	public void deleteSrScope(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		SrScope p = (SrScope) session.load(SrScope.class, new Integer(id));
        if(null != p){
            session.delete(p);
        }
        //logger.info("Person deleted successfully, person details="+p);

	}

	@Override
	public void updateSrScope(SrScope s) {
		Session session = this.sessionFactory.getCurrentSession();
        session.update(s);
        
	}

}
