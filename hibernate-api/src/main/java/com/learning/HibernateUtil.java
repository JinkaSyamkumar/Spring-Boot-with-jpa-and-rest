/**
 * 
 */
package com.learning;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.learning.entity.Account;
import com.learning.entity.StudentDetails;
import com.learning.entity.Transact;

/**
 * @author syamkumarj
 *
 */
public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(Account.class);
			configuration.addAnnotatedClass(StudentDetails.class);
			configuration.addAnnotatedClass(Transact.class);
			return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
			
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Error while building session factory");
		}
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
