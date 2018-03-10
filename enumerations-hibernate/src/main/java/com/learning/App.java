/**
 * 
 */
package com.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.learning.entity.Account;
import com.learning.entity.AccountType;


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
			
			Account account = new Account();
			account.setAccountType(AccountType.SAVINGS);
			session.save(account);
			System.out.println("ee");
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
