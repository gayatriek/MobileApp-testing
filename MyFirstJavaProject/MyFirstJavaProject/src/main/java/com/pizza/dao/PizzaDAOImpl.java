/**
 * 
 */
package com.pizza.dao;

import java.util.List;

import com.pizza.exception.PizzaException;
import com.pizza.model.Pizza;

/**
 * @author smitkuma
 *
 */
public class PizzaDAOImpl implements PizzaDAO {
	//write the code to call the database 

	public Pizza addPizza(Pizza pizza) throws PizzaException {
		// Insert pizza record in the DB
		
		return pizza;
	}

	public List<Pizza> listAllPizza() throws PizzaException {
		// TODO Auto-generated method stub
		List<Pizza> pizzaList = null;//call the DB to get the list of Pizza
		return pizzaList;
	}

}
