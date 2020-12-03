package fon.nst.springhibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


import fon.nst.springhibernate.domain.Stats;
import fon.nst.springhibernate.domain.User;


public class HibernateUtility {
	public static final SessionFactory sessionFactory;

	static {
		try {

			Configuration conf = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(User.class)
					.addAnnotatedClass(Stats.class);
			StandardServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conf.getProperties())
					.build();
			sessionFactory = conf.buildSessionFactory(reg);

		} catch (Throwable ex) {
			System.err.println("Inicijalno kreiranje SessionFactory nije uspjelo! " + ex);
			throw new ExceptionInInitializerError(ex);
		}

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;

	}
}
