/**
 * 
 */
package com.learning;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.learning.entities.SingleTable;


/**
 * @author syamkumarj
 *
 */
public class App2_hql {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		SessionFactory sessionFactory = null;
		Session session = null;
		org.hibernate.Transaction tx = null;

		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
/*			//Position with setParameter with position like 0,1,2
			Query query = session.createQuery("select s from SingleTable s "
					+ "where s.id=? ");
			
			System.out.println("Specify input id");
			
			query.setParameter(0, new Integer(scanner.next()));*/
		
			//Named with setParameter takes names instead
			Query query2 = session.createQuery("select s from SingleTable s "
					+ "where s.id=:id ");
			
			System.out.println("Specify input id");
			
			query2.setParameter("id", new Integer(scanner.next()));
			
			List<SingleTable> ss = query2.list();

			ss.forEach(s -> System.out.println(s.getName()));

			tx.commit();
			

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			scanner.close();
			session.close();
			sessionFactory.close();
		}

	}

}

