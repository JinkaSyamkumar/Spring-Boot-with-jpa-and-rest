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
public class SaveEntities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//


		Account acc= new Account(); //Transient state
		acc.setAccountno(5L);
		acc.setHoldername("Syam");
		acc.setHolderbank("CITI");

		Transact tr = new Transact();
		tr.setId(8L);
		tr.setInsertTime(new Date());

		Transact tr1 = new Transact();
		tr1.setId(9L);
		tr1.setInsertTime(new Date());

		acc.getTransactions().add(tr);
		acc.getTransactions().add(tr1);

		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		//open session - opens the Persistent Context
		Session session = factory.openSession();
		
		//Persistent context created but entities not added yet
		System.out.println("in Persistent context"+session.contains(acc));
		System.out.println("in Persistent context"+session.contains(tr));
		System.out.println("in Persistent context"+session.contains(tr1));

		try {
			//Begin and commit transaction in the same try block
			org.hibernate.Transaction transaction = session.beginTransaction();
			session.save(acc); //Persistent state
			//Entities added to persistent context
			System.out.println("in Persistent context"+session.contains(acc));
			System.out.println("in Persistent context"+session.contains(tr));
			System.out.println("in Persistent context"+session.contains(tr1));

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

