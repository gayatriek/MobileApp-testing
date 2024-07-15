package com.capg.jdbc.emp.services;

import java.util.ArrayList;

import com.capg.jdbc.emp.model.Employee;
/**
 * @author smita
 *
 */
public interface IEmployeeService {
	int addEmployee(Employee employee);
	int modifyEmployee(Employee employee);
	int removeEmployee(Employee employee);
	ArrayList<Employee> getAllEmployee();
	Employee searchEmployee(int empId);
	Employee searchEmployeeByName(String empName);
}
