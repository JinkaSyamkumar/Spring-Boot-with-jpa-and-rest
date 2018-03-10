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
public class ReattachingDetachedEntities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//persistent context 1
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Account acc = (Account)session.get(Account.class, 10L);
			session.getTransaction().commit();
			session.close();
			
			//At this moment as closed above session.close - session and persistent context is closed
			//we begin again below and try to reattche
			//Persistent Context 2
			Session session2 = HibernateUtil.getSessionFactory().openSession();
			session2.beginTransaction();

			System.out.println("Before update - in persistent context?:"+session2.contains(acc));
			
			session2.update(acc);
			
			System.out.println("After update - in persistent context?:"+session2.contains(acc));
			session2.getTransaction().commit();
			System.out.println("QUERY ISSUED AFTER INVOKING COMMIT");
			//hibernate issues update statement 
				//whether u update fields or not on entity when u invoke update
			session2.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			HibernateUtil.getSessionFactory().close();
		}
	}

}
