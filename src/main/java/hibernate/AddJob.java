package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AddJob {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addJob(String id, String title, Integer min, Integer max) {
		Job job = new Job();
		job.setId(id);
		job.setTitle(title);
		job.setMin(min);
		job.setMax(max);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(job);
		session.getTransaction().commit();

	}
}
