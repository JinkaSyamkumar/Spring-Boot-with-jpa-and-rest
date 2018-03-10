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
public class RemovingEntities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//open session - opens the Persistent Context
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			session.beginTransaction();
			
			//Persistent state - added to pc
			Account acc = session.get(Account.class, 3L); 
			System.out.println("In persistent context"+session.contains(acc));
			//Removed state - deleted from pc
			session.delete(acc);
			
			System.out.println("Method executed");
			
			System.out.println("In persistent context"+session.contains(acc));
			
			session.getTransaction().commit();
			System.out.println("QUERY ISSUED AFTER INVOKING COMMIT");
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
			session.getSessionFactory().close();
		}

	}

}
