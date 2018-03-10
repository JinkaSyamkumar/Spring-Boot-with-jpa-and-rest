/**
 * 
 */
package com.learning;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import static org.hibernate.criterion.Restrictions.*;

import com.learning.entities.Employee;
import com.learning.entities.SingleTable;
import com.learning.entities.SkillSet;

/**
 * @author syamkumarj
 *
 */
public class RestrictionsExample2 {


	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(SingleTable.class);
		
		Criterion criterion = Restrictions.le("id",10);
		
		List<SingleTable> lst = criteria.add(criterion).list();
		
		@SuppressWarnings("unchecked")
		List<SingleTable> lst1 = session.createCriteria(SingleTable.class)
										.add(Restrictions.le("id", 10))
										.addOrder(Order.asc("name"))
										.list();
		
		//as the query becomes more , it becomes somewhat unreadble so
		//it can be avoided with static import
		//import static org.hibernate.criterion.Restrictions.*;
		
		//below no need of Restrictions. again
		@SuppressWarnings("unchecked")
		List<SingleTable> lst2 = session.createCriteria(SingleTable.class)
										.add(le("id", 10))
										.addOrder(Order.asc("name"))
										.list();			
		
		//another way is instead of Restrictions we can use
		//Property.forName("id")
		@SuppressWarnings("unchecked")
		List<SingleTable> lst3 = session.createCriteria(SingleTable.class)
										.add(Property.forName("id").le(10))
										.addOrder(Order.asc("name"))
										.list();
		//we can even go nested inside
		//employee has skillsets 
		//we can corresponding user details some thing like below

		
		/*Between - */
		System.out.println("----------Between---------");
		@SuppressWarnings("unchecked")
		List<SkillSet> lst5 = session.createCriteria(SkillSet.class)
										.add(Restrictions.between("id",1,5))
										.addOrder(Order.asc("techName"))
										.list();
		Iterator<SkillSet> itr5 = lst5.iterator();
		while(itr5.hasNext()) {
			SkillSet emp = itr5.next();
			System.out.println("value: "+emp.toString());
		}
		
		System.out.println("----------isNull---------");
		/*isNull -  returns all users with no email address*/
		/*session.createCriteria(User.class)
        .add( Restrictions.isNull("email") );*/
		
		System.out.println("----------isNotNull---------");
		/*You also need to be able to find users who do have an email address:*/

	    /*session.createCriteria(User.class)
			        .add( Restrictions.isNotNull("email") );*/
		
		/*You can also test a collection with isEmpty(), isNotEmpty(), or its actual size:*/
		System.out.println("----------isEmpty/isNotEmpty---------");
		@SuppressWarnings("unchecked")
		List<Employee> lst6=session.createCriteria(Employee.class)
        					.add( Restrictions.isNotEmpty("skillSets")).list();
		Iterator<Employee> itr6 = lst6.iterator();
		while(itr6.hasNext()) {
			Employee emp = itr6.next();
			System.out.println("value: "+emp.toString());
		}
		/*even with size*/
		System.out.println("----------sizeGt()-------------------");
		//employees with skillset greater than 2,
		@SuppressWarnings("unchecked")
		List<Employee> lst7=session.createCriteria(Employee.class)
        					.add( Restrictions.sizeGt("skillSets",2)).list();
		Iterator<Employee> itr7 = lst7.iterator();
		while(itr7.hasNext()) {
			Employee emp = itr7.next();
			System.out.println("--"+emp.toString());
		}
		System.out.println("----------Comparing properties - with eqpROPERTY-------------------");
		/*@SuppressWarnings("unchecked")
		List<Employee> lst8=session.createCriteria(Employee.class)
        					.add( Restrictions.eqProperty(propertyName, otherPropertyName)).list();*/
		
		System.out.println("--------ilike------------");
		
		//ilike vs like
		//suppose in table you have values like below
		// emp_id | name
		// sy02   | SYAM
		//our name is in caps
		//so when u use normal "like"
		//select * from employee4 where name like ('syam') -- gives no output because in db value is SYAM
		//but when u use ilike 
		//select * from employee4 where name ilike ('syam')  -- gives output because "ilike" does case-insensitive like search
		//ilike will be doing a lower of your input value, and a lower of the column value e.g.
		//select * from table where lower(column) like lower(?)
		
		@SuppressWarnings("unchecked")
		List<Employee> lst4 = session.createCriteria(Employee.class)
										.add(Restrictions.ilike("name","sYA"))
										.addOrder(Order.asc("name"))
										.list();
		Iterator<Employee> itr = lst4.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println("--"+emp.toString());
		}
		
		System.out.println("----------like----------------");
		@SuppressWarnings("unchecked")
		List<Employee> lst11 = session.createCriteria(Employee.class)
								.add(Restrictions.like("name", "Ku"))  //This is equivalent to where name='Ku'
								.list();								  //if u want like search, we need %
		Iterator<Employee> itr11 = lst11.iterator();
		while(itr11.hasNext()) {
			Employee emp = itr11.next();
			System.out.println("value: "+emp.toString());
		}
		System.out.println("----------like with traditional %----------------");
		@SuppressWarnings("unchecked")
		List<Employee> lst12 = session.createCriteria(Employee.class)
								.add(Restrictions.like("name", "Ku%"))  //This is equivalent to where name like 'Ku%'
								.list();								  //if u want like search, we need %
		Iterator<Employee> itr12 = lst12.iterator();
		while(itr12.hasNext()) {
			Employee emp = itr12.next();
			System.out.println("--"+emp.toString());
		}
		System.out.println("----------like with Match.mode----------------------");
		//instead of %, we can use match mode
		@SuppressWarnings("unchecked")
		List<Employee> lst13 = session.createCriteria(Employee.class)
								.add(Restrictions.like("name", "Ku",MatchMode.START))
								.list();
		Iterator<Employee> itr13 = lst13.iterator();
		while(itr13.hasNext()) {
			Employee emp = itr13.next();
			System.out.println("value: "+emp.toString());
		}
		//similarly we have MatchMode.END
		//				    MatchMode.EXACT
		//					MatchMode.ANYWHERE
		
		System.out.println("----------like with ignore case----------------------");
		//if u dont want to use ilike for some reason
		//and u still want to execute ignore case
		List<Employee> lst14 = session.createCriteria(Employee.class)
				.add(Restrictions.like("name", "SRAVS").ignoreCase())
				.list();
			Iterator<Employee> itr14 = lst14.iterator();
				while(itr14.hasNext()) {
						Employee emp = itr14.next();
						System.out.println("value: "+emp.toString());
				}
				
		System.out.println("--------Conjunction and disjunction - without - basic------------------");
		
		//without - the basic
		List<Employee> lst15 = session.createCriteria(Employee.class)
								.add(Restrictions.like("name", "Ku",MatchMode.START))
								.add(Restrictions.like("id", "06",MatchMode.END))
								.list();
		Iterator<Employee> itr15 = lst15.iterator();
		while(itr15.hasNext()) {
			Employee emp = itr15.next();
			System.out.println("----"+emp);
		}
		System.out.println("-------------using Restrictions.in()------------------------");		
		String[] names = {"Kumar","sravs","Syam"};
		List<Employee> lst19 = session.createCriteria(Employee.class)
						.add(
										Restrictions.in("name", names)
								)
						.list();
		Iterator<Employee> itr19 = lst19.iterator();
		while(itr19.hasNext()) {
						Employee emp = itr19.next();
						System.out.println("value: "+emp);	
				}	
		
		System.out.println("--------Conjunction and disjunction - without - using restrictions.and------------------");
		//without - next level
		//instead of adding 2 add
		//we can have one add and we can put the two restrictions inside Restrictions.and - as it makes more sense
		List<Employee> lst16 = session.createCriteria(Employee.class)
				.add(
						Restrictions.and(
								Restrictions.like("name", "Ku",MatchMode.START),
								Restrictions.like("id", "06",MatchMode.END)
								)
						)
				.list();
		
		Iterator<Employee> itr16 = lst16.iterator();
			while(itr16.hasNext()) {
					Employee emp = itr16.next();
					System.out.println("value: "+emp);	
			}
			

			
	System.out.println("--------Conjunction and disjunction - without - using restrictions.and------------------");
	//without - next level
	//instead of adding 2 add
	//we can have one add and we can put the two restrictions inside Restrictions.and - as it makes more sense
	List<Employee> lst17 = session.createCriteria(Employee.class)
					.add(
							Restrictions.and(
									Restrictions.like("name", "Ku",MatchMode.START),
									Restrictions.like("id", "06",MatchMode.END)
									)
							)
					.list();
			
	Iterator<Employee> itr17 = lst17.iterator();
				while(itr17.hasNext()) {
						Employee emp = itr17.next();
						System.out.println("value: "+emp);	
				}			
				
	
	List<Employee> lst18 = session.createCriteria(Employee.class)
			.add(
					Restrictions.and(
							Restrictions.like("name", "Ku",MatchMode.START),
							Restrictions.like("id", "06",MatchMode.END)
							)
					)
			.list();
	
	Iterator<Employee> itr18 = lst18.iterator();
		while(itr18.hasNext()) {
				Employee emp = itr18.next();
				System.out.println("value: "+emp);	
		}	
		
	System.out.println("--------------Conjunction and disjunction --without using or ------------------------");
	
/*	You can combine expressions with logical operators.
	Combining expressions with logical operators
	If you add multiple Criterion instances to the one Criteria instance, they're applied conjunctively (using and):
*/	
	List<Employee> lst20 = session.createCriteria(Employee.class)
			.add(
					Restrictions.or(
			                Restrictions.and(
			                    Restrictions.like("name", "Ku",MatchMode.START),
			                    Restrictions.like("id", "06",MatchMode.END)
			                ),
			                Restrictions.in("name", names)
					
							)
					)
			.list();
	
	Iterator<Employee> itr20 = lst20.iterator();
		while(itr20.hasNext()) {
				Employee emp = itr20.next();
				System.out.println("value: "+emp);	
		}
		
		System.out.println("--------------Conjunction and disjunction------------------------");
	//The second option is to use Restrictions.disjunction() together with Restrictions.conjunction()
		
		List<Employee> lst21 = session.createCriteria(Employee.class)
								.add(Restrictions.disjunction()
										.add(Restrictions.conjunction()
												.add(Restrictions.like("name", "Ku",MatchMode.START))
												.add(Restrictions.like("id", "06",MatchMode.END))
														)
										.add( Restrictions.in("name", names)))
				
				.list();
		
		Iterator<Employee> itr21 = lst21.iterator();
			while(itr21.hasNext()) {
					Employee emp = itr21.next();
					System.out.println("value: "+emp);	
			}
		
			System.out.println("-----------Using disjunction---------------");
		List<Employee> lst22 = session.createCriteria(Employee.class)
							.add(
									Restrictions.disjunction()
										.add(Restrictions.like("name", "Ku",MatchMode.START))
										.add( Restrictions.in("name", names))
								)
							.list();

			Iterator<Employee> itr22 = lst22.iterator();
			while(itr22.hasNext()) {
				Employee emp = itr22.next();
				System.out.println("value: "+emp);	
			}


}
}
