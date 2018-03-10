/**
 * 
 */
package com.learning;

import org.hibernate.Session;

/**
 * @author syamkumarj
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.close();
	}

}
