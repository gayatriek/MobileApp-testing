package com.cg.demo;

class Mobile {
	String  brand;
	int  price;
	String network;
//	String name;
	static String name;
	
	public void show() {
		System.out.println(brand + ":" + price +":"+ name);
	}
	
}
public class demo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
//		obj1.name = "SmartPhone";
		
		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 1700;
//		obj2.name = "mobile";
		Mobile.name="MOBILE";		
		
		Mobile.name= "PHONE";
		
		obj1.show();
		obj2.show();
		
	}

}
