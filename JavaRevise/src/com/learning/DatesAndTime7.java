/**
 * 
 */
package com.learning;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author syamkumarj
 *
 */
public class DatesAndTime7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*There are two completely different APIs to handle date and time
		 * Original set introduced in mid 90s and completely new api is introduced in JAVA8
		 * 
		 * 
		 * */

		//ORIGINAL api
		Date d = new Date();
		System.out.println(d);
		
		//suppose you want to represent a specific day
		//instead of using date class, we use
		GregorianCalendar gc = new GregorianCalendar(2009,1,28); //year,month,day
		//now lets add - what you want to add , a year,a date, hour etc 
		//lets add a day
		gc.add(GregorianCalendar.DATE, 1);
		Date d2 = gc.getTime();
		//here we output the result
		System.out.println(d2);
		//result shows it is march instead of feb why?
		//in original API months started from O so we passed (2009,1,28) so it is considered as Feb and when u adda a day to it , it is march that is why
		
		//To format date
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		//below gives nicely formatted date
		System.out.println(df.format(d2));
		
		
		//JAVA8 VERSION
		//Date and time are represented by LocalDate,LocalTime,LocalDateTime
		//LETS USE LoalDateTime
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); //standard unix type timestamp - 2017-10-30T23:16:41.597 
		
		//specifying a date
		LocalDate ld = LocalDate.of(2009, 1, 28); //same date we used before
		System.out.println(ld); //but here 1 for jan the correct easy way
		
		//in the new one month numbering goes from 1 unlike old which is
		
		//now formatting
		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
		System.out.println(dtf.format(ld));
		
		//now try with of Pattern
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("M/d/yyyy");
		System.out.println(dtf1.format(ld));
		
		
		
	}

}
