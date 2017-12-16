package com.learning;

import java.util.Iterator;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.StandardBasicTypes;

import com.learning.entities.Item;

public class ArbitarySQLnSubQueries3 {

	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
/*	You may have noticed that many standard comparison operators (less than, greater than, equals, and so on) 
		are built into the Criteria API,
	but certain operators are missing. 
		For example, any arithmetic operators such as addition and division aren't supported directly.
*/	
		//suppose if u want call length() function with criteria
		//like restrictions.le or restrictions.eq there is no Restrictions.length
		//so here in this scenarios
		//we can use Restrictions.sqlRestriction
		//whatever condition you want to write after where, you can put
		//method is overloaded - 3 forms
		//1- form - it takes 3 parameters 
		//			1.query
		//			2.value
		//			3.Type
		//2- form takes 1.query as string, object array of values, type array
		//3 - form takes only string
		
		//This query returns all Item objects that have a id with less than 3 characters.ie alla less than 1000
		List<Item> lItems = session.createCriteria(Item.class)
				   				.add( Restrictions.sqlRestriction(
				   						"length('id') < ?",
				   						3,
				   						StandardBasicTypes.INTEGER
				   						)
				   						).list();
		for(Iterator<Item> iterator =lItems.iterator();iterator.hasNext();) {
			System.out.println("value: "+iterator.next().toString());
		}
		
		
/*		The {alias} placeholder is needed to prefix any table alias in the final SQL;
		it always refers to the table the root entity is mapped to (USERS in this case). */
		//sample we are using simple < condition, but it can be any
		
		//below {alias}
		//whenevr hibernate executes table query, it creates alias - ex from item this_
		//here this_ is alias
		//just to append that alias to our inline query string we use {alias}
		
		List<Item> lItems2 = session.createCriteria(Item.class)
								.add(Restrictions.sqlRestriction(
										"{alias}.initial_price < 30000"
											)
										).
								list();
		for(Iterator<Item> iterator =lItems2.iterator();iterator.hasNext();) {
			System.out.println("value: "+iterator.next().toString());
		}
		session.getTransaction().commit();
		session.close();
		
		
		//Subqueries
	}

}
