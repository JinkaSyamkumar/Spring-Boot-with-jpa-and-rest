/**
 * 
 */
package com.learning;

import org.hibernate.Session;

import com.learning.entity.Currency;
import com.learning.ids.CurrencyId;

/**
 * @author syamkumarj
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// open persistent context
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			
			Currency currency = new Currency();
			currency.setCountryName("INDIA");
			currency.setName("RUPEES");
			currency.setSymbol("R");
			session.persist(currency);
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			
		}

		// open persistent context
		Session session2 = HibernateUtil.getSessionFactory().openSession();
		try {
			session2.beginTransaction();

			//retrieve instance
			Currency currency1 = (Currency) session2.get(Currency.class, new CurrencyId("RUPEES","INDIA"));
			
			System.out.println("Name : "+currency1.getName());
			
			session2.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session2.close();
			session2.getSessionFactory().close();
		}

	}

}
