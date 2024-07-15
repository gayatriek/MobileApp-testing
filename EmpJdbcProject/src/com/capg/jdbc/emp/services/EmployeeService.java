package com.capg.jdbc.emp.services;

import java.util.ArrayList;

import com.capg.jdbc.emp.dao.EmployeeDao;
import com.capg.jdbc.emp.dao.IEmployeeDao;
import com.capg.jdbc.emp.model.Employee;

/**
 * @author smita
 *
 */
public class EmployeeService implements IEmployeeService {

	private static IEmployeeDao employeeDao;
	static
	{
		employeeDao= new EmployeeDao();
	}
	@Override
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.addEmployee(employee);
	}
	@Override
	public int modifyEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.modifyEmployee(employee);
	}
	@Override
	public int removeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.removeEmployee(employee);
	}
	@Override
	public ArrayList<Employee> getAllEmployee() {
		//System.out.println("getAllEmployee() Employee Service ....");
		return employeeDao.getAllEmployee();
	}
	@Override
	public Employee searchEmployee(int empId) {
		// TODO Auto-generated method stub
		return employeeDao.searchEmployee(empId);
	}
	@Override
	public Employee searchEmployeeByName(String empName) {
		// TODO Auto-generated method stub
		return employeeDao.searchEmployeeByName(empName);
	}
	
}
