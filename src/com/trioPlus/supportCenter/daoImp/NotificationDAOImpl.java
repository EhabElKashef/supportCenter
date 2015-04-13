package com.trioPlus.supportCenter.daoImp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.trioPlus.supportCenter.dao.NotificationDAO;
import com.trioPlus.supportCenter.entity.Stakeholder;
import com.trioPlus.supportCenter.entity.SystemNotification;

public class NotificationDAOImpl implements NotificationDAO {
	private static final Logger logger = LoggerFactory.getLogger(NotificationDAOImpl.class);
	
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@Override
	public void save(SystemNotification m) {
		Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.persist(m);
        tx.commit();
        session.close();
	}

	@Override
	public List<SystemNotification> list() {
		Session session = this.sessionFactory.openSession();
        List<SystemNotification> systemNotifications = session.createQuery("from SystemNotification").list();
        logger.info("systemNotifications :"+systemNotifications);
        session.close();
        return systemNotifications;
 	}

	@Override
	public void deleteSystemNotification(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		SystemNotification p = (SystemNotification) session.load(SystemNotification.class, new Integer(id));
        if(null != p){
            session.delete(p);
        }
        logger.info("Notification deleted successfully, Notification details="+p);


	}

	@Override
	public void updateSystemNotification(Stakeholder s) {
		Session session = this.sessionFactory.getCurrentSession();
        session.update(s);
        
	}

	@Override
	public SystemNotification getSystemNotificationById(int id) {
		Session session = this.sessionFactory.openSession();
		SystemNotification systemNotification = (SystemNotification) session.get(SystemNotification.class, new Integer(id));
//        		sessionFactory.getCurrentSession().getNamedQuery(
//        		FIND_Manager_BY_ID).setParameter( "id", id).list();
        session.close();
        if (systemNotification != null )
			return systemNotification;
		else
			return null;
	}

}
