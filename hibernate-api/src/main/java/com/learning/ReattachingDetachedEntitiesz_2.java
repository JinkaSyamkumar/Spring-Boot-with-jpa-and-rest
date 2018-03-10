/**
 * 
 */
package com.learning;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.learning.entity.Account;
import com.learning.entity.Transact;

/**
 * @author syamkumarj
 *
 */
public class ReattachingDetachedEntitiesz_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		//open session - opens the Persistent Context
		Session session = factory.openSession();
		
		Account acc= new Account(); //Transient state
		acc.setAccountno(11L);
		acc.setHoldername("Syam");
		acc.setHolderbank("CITI");

		Transact tr = new Transact();
		tr.setId(12L);
		tr.setInsertTime(new Date());

		Transact tr1 = new Transact();
		tr1.setId(13L);
		tr1.setInsertTime(new Date());

		acc.getTransactions().add(tr);
		acc.getTransactions().add(tr1);
		
		try {
			//Begin and commit transaction in the same try block
			org.hibernate.Transaction transaction = session.beginTransaction();
			session.save(acc); //Persistent state
			//Entities added to persistent context
			System.out.println("in Persistent context"+session.contains(acc));
			acc.setHoldername("Updated");
			System.out.println("Updated values");
			session.save(acc);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//close - closes the persistent context
			session.close();
			HibernateUtil.getSessionFactory().close();
		}
	}

}
