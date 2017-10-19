/**
 * 
 */
package com.learning;

import java.util.Date;

import org.hibernate.Session;

import com.learning.entity.Account;
import com.learning.entity.Transact;

/**
 * @author syamkumarj
 *
 */
public class SaveOrUpdate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//persistent context 1
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Account detachedAcc = (Account)session.get(Account.class, 10L);
		session.getTransaction().commit();
		session.close();
		
		Account transientAcc = createAccount();
		
		Session session2 = HibernateUtil.getSessionFactory().openSession();
		session2.beginTransaction();
		session2.saveOrUpdate(transientAcc); //SAVING TRANSIENT ENTITY
		session2.saveOrUpdate(detachedAcc); //SAVING DETACHED ENTITY
		detachedAcc.setHoldername("10L");
		session2.getTransaction().commit();
		session2.close();

	}

	private static Account createAccount() {
		Account acc= new Account(); //Transient state
		acc.setAccountno(100L);
		acc.setHoldername("Syam");
		acc.setHolderbank("CITI");

		Transact tr = new Transact();
		tr.setId(100L);
		tr.setInsertTime(new Date());

		Transact tr1 = new Transact();
		tr1.setId(101L);
		tr1.setInsertTime(new Date());

		acc.getTransactions().add(tr);
		acc.getTransactions().add(tr1);
		
		return acc;
	}

}
