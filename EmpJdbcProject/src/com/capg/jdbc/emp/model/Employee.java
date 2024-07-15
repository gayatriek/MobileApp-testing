package com.capg.jdbc.emp.model;

import java.io.Serializable;

/**
 * @author smita
 *
 */
public class Employee implements Serializable{
	private int empId;
	private String ename;
	private double sal;
	private static int numId;
	
	//static init block
	static
	{
		numId=(int) (1000+Math.random()*12.123);
	}
	//init block
	{
		empId=numId++;
	}
	public Employee() {
		
	}

	public Employee(String ename, double sal) {
		super();
		this.ename = ename;
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", sal=" + sal
				+ "]";
	}
}
