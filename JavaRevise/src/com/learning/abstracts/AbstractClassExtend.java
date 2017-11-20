/**
 * 
 */
package com.learning.abstracts;

/**
 * @author syamkumarj
 *
 */
public class AbstractClassExtend extends AbstractClass{
	
	//as there is no default constructor in parent 
	//you must explicitly declare one here using super
	
	public AbstractClassExtend() {
		super("hello");
	}
	@Override
	public String sayMyName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return "subclass";
	}
}
