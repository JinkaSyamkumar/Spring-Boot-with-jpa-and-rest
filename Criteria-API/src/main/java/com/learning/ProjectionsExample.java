package com.learning;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.AliasToBeanConstructorResultTransformer;
import org.hibernate.transform.AliasToBeanResultTransformer;

import com.learning.entities.Item;
import com.learning.entities.ItemPojo;
import com.learning.entities.ItemPojo1;

public class ProjectionsExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
/*		Projection
 * 		what data is to be returned from a query is projection. 
 * 		Whenever we query, we get all the details from db ie it returns entire object
 * 		instead if u want just some column info like select name from item here we can use projection
 * 		Criteria API supports projection via programmatically
 * 		You can select exactly which objects or properties of objects you need in the query result 
 * 		and how you possibly want to aggregate and group results for a report.
 * 
		The Hibernate criteria supports the equivalent of a SELECT clause for simple projection, aggregation, and grouping.*/
		
		//****we set projections with setProjection() method --*****
		
		System.out.println("---------Basic projection - selecting names");
		Criteria criteria1 = session.createCriteria(Item.class)
							.setProjection(Projections.property("name"));
		//generates - select this_.name as y0_ from item this_
		
		//It basically returns String, but for list we can use item
		//but when you try to assign itr1.next() value to Item object, you get class cast exceptio
		//below works, but use appropriate return type list
		//List<Item> lst1 = criteria1.list();
		
		List<String> lst1 = criteria1.list();
		Iterator<String> itr1 = lst1.iterator();
		while(itr1.hasNext()) {
			System.out.println("value: "+itr1.next());
		}
		
		System.out.println("---------Basic projection - selecting ids and some restrictions");
		
		/*for selecting ids, projections has inbuilt method id() so we can directly call id(), instead of Projections.property("id")*/
		
		Criteria criteria = session.createCriteria(Item.class)
							.add(Restrictions.le("id", 5))
							.setProjection(Projections.id());
		//generates - select this_.id as y0_ from item this_ where this_.id<=?
		List<Integer> lstItems = criteria.list();
		Iterator<Integer> itr=lstItems.iterator();
		
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println("value : "+obj);
		}
		
		System.out.println("---------Basic projection - multiple projections");
		
		System.out.println("***wrong way***");
		//at a time u can add one project with setProjection
		//if u run below, eventhough we have projection on Id and name
		//ONLY LAST PROJECTION, ie Name alone will be returned
		Criteria criteria2 = session.createCriteria(Item.class)
				//.add(Restrictions.le("id", 5))
				.setProjection(Projections.id())
				.setProjection(Projections.property("name"));
		

		//generates - select this_.name as y0_ from item this_
		List<Object> lstItems2 = criteria2.list();
		Iterator<Object> itr2=lstItems2.iterator();

		while(itr2.hasNext()) {
			Object obj = itr2.next();
			System.out.println("value : "+obj);
		}
		
		System.out.println("***Correct way***");
		
		Criteria criteria3 = session.createCriteria(Item.class)
				//.add(Restrictions.le("id", 5))
				.setProjection(Projections.projectionList()
								.add(Projections.id())
								.add(Projections.property("name")));
		List<Object[]> lstItems3 = criteria3.list();
		Iterator<Object[]> itr3=lstItems3.iterator();

		while(itr3.hasNext()) {
			Object[] objArr = itr3.next();
			System.out.println("value : "+objArr.length);
			System.out.println("value : "+objArr[0].toString());
			System.out.println("value : "+objArr[1].toString());
		}
		
		//***but it reruns Object array
		
		System.out.println("-----another way of setting multiple projections------------");
		Criteria criteria4 = session.createCriteria(Item.class)
				//.add(Restrictions.le("id", 5))
				.setProjection(Projections.projectionList()
								.add(Property.forName("id"))
								.add(Property.forName("name")));
		List<Object[]> lstItems4 = criteria4.list();
		Iterator<Object[]> itr4=lstItems4.iterator();

		while(itr4.hasNext()) {
			Object[] objArr = itr4.next();
			System.out.println("value : "+objArr.length);
			System.out.println("value : "+objArr[0].toString());
			System.out.println("value : "+objArr[1].toString());
		}
		
		System.out.println("-----another way of creating projection list------------");
		//This way just like Criterion object created explicitly
		//we can create ProjectionList explicitly and can add it to criteria
		
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Property.forName("id"));
		projectionList.add(Property.forName("name"));
		
		Criterion criterion1 = Restrictions.le("id", 5);
		
		Criteria criteria5 = session.createCriteria(Item.class)
							.add(criterion1)
							.setProjection(projectionList);  
		
		
		List<Object[]> lstItems5 = criteria5.list();
		Iterator<Object[]> itr5=lstItems5.iterator();

		while(itr5.hasNext()) {
			Object[] objArr = itr5.next();
			System.out.println("value : "+objArr.length);
			System.out.println("value : "+objArr[0].toString());
			System.out.println("value : "+objArr[1].toString());
		}
		
		/*Suppose , you want return java class, instead of object[]
		we can do like below*/
/*		In HQL and JPA QL, 
 * 		you can use dynamic instantiation with the SELECT NEW operation and return a collection of custom objects instead of Object[]. 
				Hibernate bundles a ResultTransformer for criteria queries that can do almost the same (in fact, it's more flexible).
				
		The following query returns the same result as the previous one, but wrapped in data transfer objects:
*/		
		
		
		System.out.println("-------------Returning result as pojo----------------");
		//Step1 - create a new pojo with setters and getters for required properties
		//Step2 - in projections use .as method defined in pojo class to map property 
		//step3 - use setResultTransformer method and AliasToBeanResultTransformer constructor to pass pojo 
		
/*		ItemPojo.class - It doesn't have to be a mapped persistent class;should not have arg constructor 
						only the property/field names must match with the aliases assigned to the projected properties 
						in the criteria query. 
						Aliases are assigned with the as() method (which you can think of as the equivalent of 
								the AS keyword in an SQL SELECT).
								*****S The result transformer calls the setter methods or
								populates the fields directly and returns a collection of ItemPriceSummary objects*/
		
		Criteria criteria6= session.createCriteria(Item.class)
							.add(Restrictions.le("id", 5))
							.setProjection(Projections.projectionList()
									.add(
											Property.forName("id")
											.as("id_")
										)
									
									.add(
											Property.forName("name")
											.as("name_")
										)
									.add(Property.forName("description")
											.as("description_")
										)
											)
							.setResultTransformer(
										            new AliasToBeanResultTransformer(ItemPojo.class)
											        );
		List<ItemPojo> lstItems6 = criteria6.list();
		Iterator<ItemPojo> itr6=lstItems6.iterator();

		while(itr6.hasNext()) {
			ItemPojo obj = itr6.next();
			System.out.println("value : "+obj.toString());
		}					
									
		System.out.println("----Returning result as same class---------");
		
		
		//Create a constrcutor with the returned parameters as arguments - OPTIONAL - NOT REQUIRED
		//otherwise it will fail
		
		//as is mandatory - because it calls the getters and setters
		
		Criteria criteria7= session.createCriteria(Item.class)
				.add(Restrictions.le("id", 5))
				.setProjection(Projections.projectionList()
						.add(
								Property.forName("id")
								.as("id")
							)
						
						.add(
								Property.forName("name")
								.as("name")
							)
						.add(Property.forName("description")
								.as("description")
							)
								)
				.setResultTransformer(
							            new AliasToBeanResultTransformer(Item.class)
								        );
				List<Item> lstItems7 = criteria7.list();
				Iterator<Item> itr7=lstItems7.iterator();

				while(itr7.hasNext()) {
					Item obj = itr7.next();
					System.out.println("value : "+obj.toString());
				}	
		
				System.out.println("------trail------------");
				Criteria criteria8 = session.createCriteria(Item.class)
									.add(Restrictions.le("id", 5))
									.setProjection(Projections.projectionList()
											.add(Property.forName("id")
													.as("id")
												)
											.add(Property.forName("name")
													.as("name"))
											.add(Property.forName("description")
													.as("description"))
											)
									.setResultTransformer(new AliasToBeanResultTransformer(ItemPojo1.class));
		
			List<ItemPojo1> itemPojo1s = criteria8.list();
			Iterator<ItemPojo1> iterator1s = itemPojo1s.iterator();
			while(iterator1s.hasNext()) {
				System.out.println("value : "+iterator1s.next());
			}
			
			System.out.println("---------Aggregator n Grouping-----------------");
		
			System.out.println("-----getting total row count - Projections.rowCount() ---------");
			//returns row count as long value
			Criteria criteria9 = session.createCriteria(Item.class)
									.setProjection(Projections.rowCount());
			long count = (Long)criteria9.uniqueResult();				
									
			System.out.println("count is - "+count);
		
		
		
		
		
		
		
/*		First we need to create alias of the associated object like so
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria("model.Person");
		criteria.createAlias("cars", "cars");
		Select the needed using Hibernate Projections
		ProjectionList projections = Projections.projectionList();
		projections.add(Projections.property("id").as("id"));
		projections.add(Projections.property("name").as("name"));
		projections.add(Projections.property("cars").as("cars"));
		Group the result based on the root entity (in this case using its id, Person.id), this is needed especially when used with aggregation to group the aggregation
		projections.add(Projections.groupProperty("id"));
		Use the aggregate function
		projections.add(Projections.min("cars.year").as("minYear"));
		projections.add(Projections.max("cars.year").as("maxYear"));
		Set the projection
		criteria.setProjection(projections);
		Use result transformer AliasToBeanResultTransformer to map the result fields (as specified in step 2 & 4) to the POJO
		criteria.setResultTransformer(new AliasToBeanResultTransformer(Person.class));
		Get the result
		List<Person> results = (List<Person>) criteria.list();*/
		
	}

}
