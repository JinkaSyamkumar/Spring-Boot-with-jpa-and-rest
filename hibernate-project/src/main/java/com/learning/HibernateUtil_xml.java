/**
 * 
 */
package com.learning;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * @author syamkumarj
 *
 */
public class HibernateUtil_xml {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration configuration = new Configuration();
			//configuration.addAnnotatedClass(StudentDetails.class);
			//return configuration.buildSessionFactory(
			//								new StandardServiceRegistryBuilder().build());
			return configuration.buildSessionFactory(
							new StandardServiceRegistryBuilder()
							.applySettings(configuration.getProperties())
							.build());
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Error building the factory");
		}
	} 
	
	//the way singleton works is
	//above two are with private so we create a method with public below
	//to return sessionFactory
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
