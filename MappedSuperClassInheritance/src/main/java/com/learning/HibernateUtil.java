package com.learning;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


import com.learning.entity.Professor;
import com.learning.entity.Student;



public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(Student.class);
		configuration.addAnnotatedClass(Professor.class);
		//configuration.addAnnotatedClass(Market.class);
		return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
