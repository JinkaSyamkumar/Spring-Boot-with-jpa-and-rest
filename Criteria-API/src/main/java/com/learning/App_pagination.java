package com.learning;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import com.learning.entities.SingleTable;


public class App_pagination {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SessionFactory factory = null;
		Session session = null;
		org.hibernate.Transaction tx = null;

		int pageNumber = 3;
		int pageSize = 4;

		try {
			factory = HibernateUtil.getSessionFactory();
			session = factory.openSession();
			tx = session.beginTransaction();

			Criteria criteria = session.createCriteria(SingleTable.class)
					.addOrder(Order.asc("title"));
			criteria.setFirstResult((pageNumber - 1) * pageSize);
			criteria.setMaxResults(pageSize);

			List<SingleTable> ss = criteria.list();
			
			
			System.out.println("After to List");
			ss.forEach(s -> System.out.println(s.getName()));

			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
			factory.close();
			scanner.close();
		}
	}
}
