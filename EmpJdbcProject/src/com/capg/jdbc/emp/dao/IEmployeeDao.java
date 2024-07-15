package com.capg.jdbc.emp.dao;

import java.util.ArrayList;

import com.capg.jdbc.emp.model.Employee;
/**
 * @author smita
 *
 */
public interface IEmployeeDao {
	int addEmployee(Employee employee);
	int modifyEmployee(Employee employee);
	int removeEmployee(Employee employee);
	ArrayList<Employee> getAllEmployee();
	Employee searchEmployee(int empId);
	Employee searchEmployeeByName(String empName);
}
