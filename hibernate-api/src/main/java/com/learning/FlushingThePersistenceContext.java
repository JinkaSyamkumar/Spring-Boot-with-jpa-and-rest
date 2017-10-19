/**
 * 
 */
package com.learning;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learning.entity.Account;

/**
 * @author syamkumarj
 *
 */
public class FlushingThePersistenceContext {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		try {
			//WE are making two changes to entity
			//after making first we are calling flush on session
			//and we make another change and calling commit on transaction
			//and also handle exception in catch torollback changes
			//put transaction.
			
			Account acc = (Account)session.get(Account.class, 10L);
			acc.setHoldername("FLUSH");
			System.out.println("CALLING FLUSH");
			session.flush();
		
			acc.setHolderbank("icici");
			System.out.println("CALLING COMMIT");
			transaction.commit();
			//console log verify
			//so what happens with flush, instead of waiting till COMMIT
			//u can force persistent context to sync whatever it has with db
			//and again accept for change on pc
			//so usually one pc one commit
			//but if u want to have multple commits to db in single pc , u can use flush
			
			
		} catch (Exception e) {
			//**to rollback if any failure
			transaction.rollback();
			e.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}

	}

}
