/**
 * 
 */
package com.learning;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.learning.entities.SingleTable;
import com.learning.entities.SkillSet;


/**
 * @author syamkumarj
 *
 */
public class App3_hql {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		SessionFactory sessionFactory = null;
		Session session = null;
		org.hibernate.Transaction tx = null;

		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			//implicit join
			/*Query query = session.createQuery("SELECT e.skillSets FROM Employee e "
					+ "WHERE e.id='JINKSY04'");*/
			
			//explicit join
//			Query query = session.createQuery("select s from employee4 employee0_ inner join emp4_skill1 skillsets1_ on employee0_.emp_id=skillsets1_.emp_id inner join skillset_1 skillset2_ on skillsets1_.skill_id=skillset2_.tech_id "
//					+ "where employee0_.emp_id='JINKSY04'");
			
			//Named queries
			Query query =session.getNamedQuery("get_skills");
					
			List<SkillSet> ss =query.list();
			ss.forEach(sobj -> System.out.println(sobj.getTechName()));
			
			tx.commit();
			

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			scanner.close();
			session.close();
			sessionFactory.close();
		}

	}

}

