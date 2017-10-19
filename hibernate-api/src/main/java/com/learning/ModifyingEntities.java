/**
 * 
 */
package com.learning;

import org.hibernate.Session;

import com.learning.entity.Account;

/**
 * @author syamkumarj
 *
 */
public class ModifyingEntities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			session.beginTransaction();
			
			Account acc = session.get(Account.class, 1L);
			acc.setHoldername("UPDATED1");
			
			session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
			session.getSessionFactory().close();
		}
	}

}
