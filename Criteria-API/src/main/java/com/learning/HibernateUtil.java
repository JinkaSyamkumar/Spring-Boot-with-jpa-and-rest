package com.learning;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.learning.entities.Employee;
import com.learning.entities.Item;
import com.learning.entities.SingleTable;
import com.learning.entities.SkillSet;


public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(SingleTable.class);
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(SkillSet.class);
		configuration.addAnnotatedClass(Item.class);
		return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
