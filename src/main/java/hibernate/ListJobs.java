package hibernate;

import java.util.List;

import org.hibernate.SessionFactory;

public class ListJobs {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Job> getJobs() {
		return (List<Job>) sessionFactory.openSession().createQuery("from Job").list();
	}

}
