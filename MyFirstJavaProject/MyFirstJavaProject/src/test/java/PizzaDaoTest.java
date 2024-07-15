import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pizza.dao.PizzaDAO;
import com.pizza.dao.PizzaDAOImpl;
import com.pizza.exception.PizzaException;
import com.pizza.model.Pizza;

public class PizzaDaoTest {
	public static 	PizzaDAO pizzaDao;
//static  - per class
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//Database connectivity
		pizzaDao = new PizzaDAOImpl(); //losely coupled 
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Closing the DB
	}
	
	/*
	 * @Before public void setUp() throws Exception { //Database connectivity }
	 * 
	 * @After public void tearDown() throws Exception { //Closing the DB }
	 */

	@Test
	public void testAddPizza() throws PizzaException {
		Pizza pizza = pizzaDao.addPizza(new Pizza());
		assertNull("Pizza id Null ", pizza);
		
	}

	@Test
	public void testListAllPizza() throws PizzaException {
		List<Pizza> pizzaList = pizzaDao.listAllPizza();
		assertNull("Pizza List id Null ", pizzaList);
	}

}
