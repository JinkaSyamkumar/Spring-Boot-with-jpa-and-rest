/**
 * 
 */
package com.learning;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.learning.entities.SingleTable;


/**
 * @author syamkumarj
 *
 */
public class App_restrictions {

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
			
			Criterion criterion1 = Restrictions.le("id", 2);
			Criterion criterion2 = Restrictions.eq("name", "syam");
			
			Criteria criteria = session.createCriteria(SingleTable.class)
								.add(criterion1)
								.add(criterion2)
								.addOrder(Order.desc("name"));
			
			Criteria criteria1 = session.createCriteria(SingleTable.class)
					.add(Restrictions.and(criterion1,criterion2))
					.addOrder(Order.desc("name"));

			List<SingleTable> ss = criteria1.list();
			
			
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
