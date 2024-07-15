/**
 * 
 */
package com.pizza.service;

import java.util.List;

import com.pizza.dao.PizzaDAO;
import com.pizza.dao.PizzaDAOImpl;
import com.pizza.exception.PizzaException;
import com.pizza.model.Pizza;

/**
 * @author smitkuma
 *
 */
public class PizzaServiceImpl implements PizzaService {
	//create DAO layer object & call DAO layer method
	//call & forward principle
	//validates & perform calculations
	
	PizzaDAO pizzaDao = new PizzaDAOImpl(); //losely coupled 

	public Pizza addPizza(Pizza pizza) throws PizzaException {
		// TODO Auto-generated method stub
		return pizzaDao.addPizza(pizza);
	}

	public List<Pizza> listAllPizza() throws PizzaException {
		// TODO Auto-generated method stub
		return pizzaDao.listAllPizza();
	}

}
