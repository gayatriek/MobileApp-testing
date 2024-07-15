/**
 * 
 */
package com.pizza.exception;

/**
 * @author smitkuma
 *
 */
//custom exception class
public class PizzaException extends Exception {
	private static final long serialVersionUID = 1L;
	String msg;
	public PizzaException() {
		// TODO Auto-generated constructor stub
	}
	public PizzaException(String msg) {
		super();
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "PizzaException [msg=" + msg + "]";
	}
	
}
