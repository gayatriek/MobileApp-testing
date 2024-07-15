package com.capg.jdbc.emp.client.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.capg.jdbc.emp.factory.EmployeeServiceFactory;
import com.capg.jdbc.emp.model.Employee;
import com.capg.jdbc.emp.services.IEmployeeService;
/**
 * @author smita
 *
 */
public class EmployeeUserInterface {
	static IEmployeeService employeeService;
	static{
		employeeService = 
				 EmployeeServiceFactory.getInstance();
	}

 
 	@SuppressWarnings("resource")
	public static void addEmployee()
 	{
 		Employee emp;
 		emp=new Employee();
 		Scanner sc= new Scanner(System.in);
 		String ename;
 		double sal;
 		//sc.nextLine();
 		System.out.print("\nEnter Name Of the Employee:\t");
 		ename=sc.next();
 		
 		System.out.print("\nEnter salary Of the Employee:\n\t");
 		sal=sc.nextDouble();
 		emp.setEname(ename);
 		emp.setSal(sal);
 		//calling addEmployee(e) employeeService 
 		int result= employeeService.addEmployee(emp);
 		if(result==1){
 			System.out.println("Added Successfully");
 		}
 		else
 			System.out.println("Sorry! Something wnet wrong");
 		
 	}
 	public static void modifyEmployee()
 	{
 		Scanner sc= new Scanner(System.in);
 		int id;
 		System.out.print("\nEnter Employee ID:\t");
 		id=sc.nextInt();
 		Employee emp=employeeService.searchEmployee(id);
 		if(emp!=null){	
 			String ename;double sal;
 			System.out.print("\nEnter Employee name:\t");
 			ename=sc.next();
 			System.out.print("\nEnter salary Of the Employee:\n\t");
 	 		sal=sc.nextDouble();
 	 		emp.setEname(ename);
 	 		emp.setSal(sal);
 	 		//calling modifyEmployee(emp) employeeService 
 			int result=employeeService.modifyEmployee(emp);
 			if(result==1)
 				System.out.println("Modified Succefully!");
 			
 		}else{
 	 	 		System.out.println("Sorry! Something was not right");
 		}
 	}
 	public static void removeEmployee(){
 		Scanner sc= new Scanner(System.in);
 		int id;
 		System.out.print("\nEnter Employee ID:\t");
 		id=sc.nextInt();
 		Employee emp=employeeService.searchEmployee(id);
 		//calling removeEmployee(emp) employeeService 
 		if(emp!=null){
	 		int result = employeeService.removeEmployee(emp);	 		
	 		if(result==1){
	 			System.out.println("Removed Succefully!");
 			}	 			
 		}else
 			System.out.println("Sorry! Something was not right");
 	}
 	public static void getAllEmployee(){
 		//calling getAllEmployee(emp) employeeService 
 		ArrayList<Employee> empList=employeeService.getAllEmployee();
 		if(empList.size()>0){
	 		System.out.println("\n================================"
	 				+ "\nEmployee Details"
	 				+ "\n=========================================\n");
	 		for(Employee e : empList){
	 			System.out.println(e);
	 		}
 		}else{
 			System.out.println("\n=========Sorry No Records Found=======");
 		}
 	}
 	public static void SearchEmployee(){
 		Scanner sc= new Scanner(System.in);
 		int id;
 		System.out.print("\nEnter Employee ID:\t");
 		id=sc.nextInt();
 		Employee emp=employeeService.searchEmployee(id);
 		if (emp!=null)
 			System.out.println("Employee found\nEmployee details are"
 					+ "\n"+emp);
 		else
 			System.out.println("Sorry Employee not found");
 	}
 	public static void SearchEmployeeByName(){
 		Scanner sc= new Scanner(System.in);
 		System.out.print("\nEnter Employee Name:\t");
 		String ename=sc.next();
 		Employee emp=employeeService.searchEmployeeByName(ename);
 		if (emp!=null)
 			System.out.println("Employee found\nEmployee details are"
 					+ "\n"+emp);
 		else
 			System.out.println("Sorry Employee not found");
 	}
}
