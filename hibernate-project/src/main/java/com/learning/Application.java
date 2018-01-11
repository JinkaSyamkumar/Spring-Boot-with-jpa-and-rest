/**
 * 
 */
package com.learning;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.learning.entity.StudentDetails;

/**
 * @author syamkumarj
 *
 */
public class Application {
	
	public static void main(String[] args) {
	//to load via hibernate.properties	
		/*Session session = HibernateUtil_properties.getSessionFactory().openSession();
		session.beginTransaction();
		StudentDetails type = new StudentDetails();
		type.setId(1);	
		session.save(type);
		session.getTransaction().commit();
		session.close();*/
		
	//to load via hibernate.cfg.xml
	Session session = HibernateUtil_xml.getSessionFactory().openSession();
	session.beginTransaction();
	
	StudentDetails type = new StudentDetails();
	type.setId(1);
	
	session.save(type);
	
	session.getTransaction().commit();
	
	session.close();

	
	//to load via programmatic / javabased
		/* Configuration */
/*		Configuration configuration = new Configuration();

		configuration.addAnnotatedClass(StudentDetails.class);

		configuration.setProperties(new Properties() {
			private static final long serialVersionUID = -2275297213478978518L;

			{
				put("hibernate.connection.username", "postgres");
				put("hibernate.connection.password", "postgres");
				put("hibernate.connection.driver_class",
						"org.postgresql.Driver");
				put("hibernate.connection.url",
						"jdbc:postgresql://localhost:5432/postgres");
			}
		});

		 Building SessionFactory 
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(new StandardServiceRegistryBuilder(
						).applySettings(configuration.getProperties()).build());
	
		 Obtain Session and Call Persistence Methods 
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		StudentDetails type = new StudentDetails();

		type.setId(1);

		
		session.save(type);
		session.getTransaction().commit();
		session.close();*/
	
	}

}
