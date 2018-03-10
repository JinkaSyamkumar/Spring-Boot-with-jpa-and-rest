/**
 * 
 */
package com.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learning.entity.Account;

/**
 * @author syamkumarj
 *
 */
public class RetrievingEntities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SessionFactory sessionFactory =  HibernateUtil.getSessionFactory();

		//Persistent Context is created by below openSession method
		Session session = sessionFactory.openSession();
		
		try {
			Transaction transaction = session.beginTransaction();

			//GET
			//it queries db and gets the result
/*			Account acc =(Account) session.get(Account.class, 1L);
			System.out.println("Method Executed");
			//what if u call get twice, it wont query from db again - it will PULL FROM persistent context  CACHE
			//as in the first get --> objects will be pulled from db and added to persistent context 
			//acc =(Account) session.get(Account.class, 1L);
			System.out.println("Account holder name"+acc.getHoldername());
			System.out.println("Transactions "+acc.getTransactions().toString());*/
			
			//LOAD - here when u debug
			//Ideally query should come and then "Method Executed" will be printed
			//BUT WITH LOAD METHOD - it wont query immediately unlike get
			//it will have proxies ready and only be queried when we need
			//here we need it while printing "Account holder name"
			//that time it will be queried from db
			Account acc =(Account) session.load(Account.class, 11L);
			System.out.println("Method Executed");
			System.out.println("Account holder name"+acc.getHoldername());
			
			
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
			sessionFactory.close();
		}
		
		

	}

}
