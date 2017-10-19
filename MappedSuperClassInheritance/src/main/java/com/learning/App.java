/**
 * 
 */
package com.learning;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.learning.entity.Professor;
import com.learning.entity.Student;


/**
 * @author syamkumarj
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		org.hibernate.Transaction tx = null;

		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			Student stud = new Student();
			stud.setName("syam");
			stud.setEmail("s@gmail");
			stud.setDob(new Date());
			stud.setAddress("chennai");
			session.save(stud);
			
			Professor professor = new Professor();
			professor.setName("syam");
			professor.setEmail("s@gmail");
			professor.setDob(new Date());
			professor.setExp(4);
			session.save(professor);
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
			sessionFactory.close();
		}

	}

}
