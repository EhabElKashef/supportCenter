package com.trioPluse.supportCenter.daoImp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.trioPlus.supportCenter.dao.ProjectStatusDAO;
import com.trioPlus.supportCenter.entity.ProjectStatus;
import com.trioPlus.supportCenter.entity.Stakeholder;

public class ProjectStatusDAOImpl implements ProjectStatusDAO {
	private static final Logger logger = LoggerFactory.getLogger(ProjectStatusDAOImpl.class);
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	@Override
	public void save(ProjectStatus m) {
		Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.persist(m);
        tx.commit();
       
	}

	@Override
	public List<ProjectStatus> list() {
		Session session = this.sessionFactory.openSession();
        List<ProjectStatus> projectStatus = session.createQuery("from ProjectStatus").list();
        logger.info("projectStatus"+projectStatus);
        session.close();
        return projectStatus;
 	}

	@Override
	public void deleteProjectStatus(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		ProjectStatus p = (ProjectStatus) session.load(ProjectStatus.class, new Integer(id));
        if(null != p){
            session.delete(p);
        }
        logger.info("ProjectStatus deleted successfully, ProjectStatus details="+p);

	}

	@Override
	public void updateProjectStatus(ProjectStatus s) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
        session.update(s);
        
	}

}
