/**
 * 
 */
package com.learning;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;

import com.learning.entities.SingleTable;

/**
 * @author syamkumarj
 *
 */
public class DetachedCriteriaExample1 {


	public static void main(String[] args) {
		//Creating here without session object
		DetachedCriteria crit = DetachedCriteria.forClass(SingleTable.class)
				.addOrder(Order.asc("name"));
		execute(crit);
	}

	public static void execute(DetachedCriteria crit) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		//we are executing here with session
		List<SingleTable> lst = crit.getExecutableCriteria(session).list();
		
		Iterator<SingleTable> itr = lst.iterator();
		while(itr.hasNext()) {
			System.out.println(" - "+itr.next());
		}
		
		System.out.println("Crazy -------");
		List l = session.createCriteria(java.lang.Object.class).list();
		Iterator it = l.iterator();
		while(it.hasNext()) {
			Object x = it.next();
			System.out.println(x.getClass());
		}
		session.getTransaction().commit();
		session.close();
		
	}
}
