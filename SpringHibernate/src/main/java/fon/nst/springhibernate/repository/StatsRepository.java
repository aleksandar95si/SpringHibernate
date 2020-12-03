package fon.nst.springhibernate.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import fon.nst.springhibernate.domain.Stats;
import fon.nst.springhibernate.util.HibernateUtility;

@Component
public class StatsRepository {
	
	public void inc() throws Exception {
		Session session=HibernateUtility.getSessionFactory().getCurrentSession();
		session.getTransaction();
		Stats stats=session.get(Stats.class, 1);
		stats.setValue(stats.getValue()+1);
	}
	
	public void dec() throws Exception {
		Session session=HibernateUtility.getSessionFactory().getCurrentSession();
		session.getTransaction();
		Stats stats=session.get(Stats.class, 1);
		stats.setValue(stats.getValue()-1);
	}
	
}
