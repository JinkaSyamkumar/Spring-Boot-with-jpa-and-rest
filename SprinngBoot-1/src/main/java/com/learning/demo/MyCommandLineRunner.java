/**
 * 
 */
package com.learning.demo;

import org.springframework.boot.CommandLineRunner;

/**
 * @author syamkumarj
 *
 */
public class MyCommandLineRunner implements CommandLineRunner {

	/* (non-Javadoc)
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("arguments used to start the app");
		
		for(String arg:args) {
			System.out.println("args"+args);
		}

	}

}
