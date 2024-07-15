/**
 * 
 */
package com.pizza.model;

/**
 * @author smitkuma
 *
 */
public class Pizza {
	private Long pizzaId;
	private String pizzaName;
	private Double price;
	private String pizzaDesc;

	public Pizza() {
		// TODO Auto-generated constructor stub
	}

	public Long getPizzaId() {
		return pizzaId;
	}

	public void setPizzaId(Long pizzaId) {
		this.pizzaId = pizzaId;
	}

	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPizzaDesc() {
		return pizzaDesc;
	}

	public void setPizzaDesc(String pizzaDesc) {
		this.pizzaDesc = pizzaDesc;
	}

	public Pizza(Long pizzaId, String pizzaName, Double price, String pizzaDesc) {
		super();
		this.pizzaId = pizzaId;
		this.pizzaName = pizzaName;
		this.price = price;
		this.pizzaDesc = pizzaDesc;
	}

	@Override
	public String toString() {
		return "Pizza [pizzaId=" + pizzaId + ", pizzaName=" + pizzaName + ", price=" + price + ", pizzaDesc="
				+ pizzaDesc + "]";
	}
	
}
