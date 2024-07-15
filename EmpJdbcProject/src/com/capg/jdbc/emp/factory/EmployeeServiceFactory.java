package com.capg.jdbc.emp.factory;

import com.capg.jdbc.emp.services.EmployeeService;
import com.capg.jdbc.emp.services.IEmployeeService;
/**
 * @author smita
 *
 */
public class EmployeeServiceFactory {
	private static IEmployeeService instance;
	static{
		instance = new EmployeeService();
	}
	public static IEmployeeService getInstance(){
		return instance;
	}
	private EmployeeServiceFactory(){}
}
