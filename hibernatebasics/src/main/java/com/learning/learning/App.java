package com.learning.learning;

import java.util.Date;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.learning.learning.entities.StudentAccount;

public class App {

	public static void main(String[] args) {
		
		/* Configuration */
		Configuration configuration = new Configuration();

		configuration.addAnnotatedClass(StudentAccount.class);

		configuration.setProperties(new Properties() {
			{
				put("hibernate.connection.username", "infinite");
				put("hibernate.connection.password", "skills");
				put("hibernate.connection.driver_class",
						"com.mysql.jdbc.Driver");
				put("hibernate.connection.url",
						"jdbc:mysql://localhost:3306/ifinances");
			}
		});

		/* Building SessionFactory */
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(new StandardServiceRegistryBuilder(
						).applySettings(configuration.getProperties()).build());
	
		/* Obtain Session and Call Persistence Methods */
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		StudentAccount type = new StudentAccount();

		/*type.setName("Checking");
		type.setCreatedDate(new Date());
		type.setLastUpdatedDate(new Date());
		type.setCreatedBy("kevinbowersox");
		type.setLastUpdatedBy("kevinbowersox");*/
		
		session.save(type);
		session.getTransaction().commit();
		session.close();

	}
}
