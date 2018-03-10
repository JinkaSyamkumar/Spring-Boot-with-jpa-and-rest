/**
 * 
 */
package com.learning;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import com.learning.entities.SingleTable;


/**
 * @author syamkumarj
 *
 */
public class App_hql {

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
			
			Criteria criteria = session.createCriteria(SingleTable.class);
			criteria.addOrder(Order.desc("name"));

			List<SingleTable> ss = criteria.list();
			
			
			System.out.println("After to List");
			ss.forEach(s -> System.out.println(s.getName()));

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
