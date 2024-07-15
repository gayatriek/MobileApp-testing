/**
 * 
 */
package com.pizza.service;

import java.util.List;

import com.pizza.exception.PizzaException;
import com.pizza.model.Pizza;

/**
 * @author smitkuma
 *
 */
//Service 
//call & forward principle
//validates & perform calculations
public interface PizzaService {
	//interface as a contract i.e additional role or service provided as per the contract
	//CRUD 
	public Pizza addPizza(Pizza pizza)throws PizzaException;
	public List<Pizza> listAllPizza()throws PizzaException;
}
/*
 * 
 */
