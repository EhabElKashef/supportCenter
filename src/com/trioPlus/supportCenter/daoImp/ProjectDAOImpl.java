package com.trioPlus.supportCenter.daoImp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.trioPlus.supportCenter.dao.ProjectDAO;
import com.trioPlus.supportCenter.entity.Project;
import com.trioPlus.supportCenter.entity.ProjectPhase;
import com.trioPlus.supportCenter.entity.User;

public class ProjectDAOImpl implements ProjectDAO {

	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Project getById(int projectId) {
		Session session = this.sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Project.class);
		criteria.add( Restrictions.like("id", projectId) );
		List<Project> result = criteria.list();
		
		return result.get(0);

	}

	@Override
	public void save(Project m) {
		Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(m);
        tx.commit();
        session.close();

	}

	@Override
	public List<Project> list() {
		Session session = this.sessionFactory.openSession();
        List<Project> personList = session.createQuery("from Project").list();
        session.close();
        return personList;
 	}

	@Override
	public void deleteProject(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateProject(Project s) {
		// TODO Auto-generated method stub

	}

}
