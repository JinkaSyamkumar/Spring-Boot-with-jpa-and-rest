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
			acc.setHoldername("FLUSH4");
			System.out.println("CALLING FLUSH");
			session.flush();
		
			acc.setHolderbank("icici4");
			System.out.println("CALLING COMMIT"); 
			//MODIFY ABOVE two values
			//and uncomment below line
			//for the second update - commt ie update query should be called only on at transaction.commit(); line
			//but when you uncomment the below line..before issuing select, it calls update ..ie flush ..one of the the way that flush can happen see the etxt
			//Account acc1 = (Account)session.get(Account.class,1L);
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
