package com.capg.jdbc.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.capg.jdbc.emp.connection.MyConnection;
import com.capg.jdbc.emp.model.Employee;
/**
 * @author smita
 *
 */
public class EmployeeDao implements IEmployeeDao {
	
	public EmployeeDao() {
		//empList=deSerializeEmployees();
		//System.out.println("EmployeeDao() "+empList);
	}
	@Override
	public int addEmployee(Employee employee) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int noOfRecord=0;
		String sql = "insert into emp values(?,?,?)";
		try { // step 1: obtain conn
			con = MyConnection.getConnection(); // step 2 : obtain pstmt obj
			if(con!=null){
				pstmt = con.prepareStatement(sql); // step 3 : set the value at
													// runtime
				pstmt.setInt(1, employee.getEmpId());
				pstmt.setString(2, employee.getEname());
				pstmt.setDouble(3, employee.getSal()); // step 4: executeUpdate
				noOfRecord = pstmt.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {// step 5: close the resources if they are not null
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}// end of finally
		return noOfRecord;
	}

	@Override
	public int modifyEmployee(Employee employee) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int noOfRecord=0;
		String sql = "update emp set empsal=? where empid=?";
		try {
			// step 1: obtain conn
			con = MyConnection.getConnection(); 
			//only if con is not null
			if(con!=null){
				// step 2 : obtain pstmt obj
				pstmt = con.prepareStatement(sql); 
				// step 3 : set the value at runtime
				pstmt.setInt(2, employee.getEmpId());
				pstmt.setDouble(1, employee.getSal());
				// step 4: executeUpdate
				noOfRecord = pstmt.executeUpdate();
				System.out.println(noOfRecord + ", Update!!");	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {// step 5: close the resources if they are not null
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}// end of finally
		return noOfRecord;
	}

	@Override
	public int removeEmployee(Employee employee) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int noOfRecord=0;
		String sql = "delete emp where empid=?";
		try {
			// step 1: obtain conn
			con = MyConnection.getConnection(); // step 2 : obtain pstmt obj
			if(con!=null){
				pstmt = con.prepareStatement(sql); // step 3 : set the value at
				pstmt.setInt(1, employee.getEmpId()); // step 4: executeUpdate
				noOfRecord = pstmt.executeUpdate();
				System.out.println(noOfRecord + ", Deleted!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {// step 5: close the resources if they are not null
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}// end of finally
		return noOfRecord;
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from emp";
		Employee e1 = null;
		ArrayList<Employee> empList=null;
		try { // step 1: obtain conn
			con = MyConnection.getConnection(); // step 2 : obtain stmt obj
			if(con!=null){
				stmt = con.createStatement();
			// step 3 : for select query invoke executeQuery
			// and fetch ResultSet 
				rs= stmt.executeQuery(sql);
			// step 4: iterate through ResultSet
				System.out.println("=========Emp Records========");
				empList=new ArrayList<>();
				while (rs.next()) {
					e1 = new Employee(rs.getString(2), rs.getDouble(3));
					e1.setEmpId(rs.getInt(1));
					empList.add(e1);
				}
				System.out.println("==============================");
			}//end of outer if
		} catch (Exception e) {
			e.printStackTrace();
		}finally {// step 5: close the resources if they are not null
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}// end of finally
		return empList;
	}

	@Override
	public Employee searchEmployee(int empId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs;
		String sql = "select * from emp where empid=?";
		Employee e1=null;
		try {
			// step 1: obtain conn
			con = MyConnection.getConnection();
			// step 2 : obtain pstmt obj
			if (con != null) {
				pstmt = con.prepareStatement(sql);
				// step 3 : set the value at runtime
				pstmt.setInt(1, empId);
				// step 4: executeQuery
				rs = pstmt.executeQuery();
				// if loop is used as we are fetching only 1 record
				while (rs.next()) {
					System.out.println("============Record Found===========");
					int id = rs.getInt(1);
					String ename = rs.getString(2);
					double sal = rs.getDouble("empsal");
					e1 = new Employee(ename, sal);
					e1.setEmpId(id);
				}// end of inner if
			}// end of outer if
		} catch (Exception e) {
			e.printStackTrace();
		} finally {// step 5: close the resources if they are not null
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}// end of finally
		return e1;
	}

	@Override
	public Employee searchEmployeeByName(String empName) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs;
		String sql = "select * from emp where empname=?";
		Employee e1=null;
		try {
			// step 1: obtain conn
			con = MyConnection.getConnection();
			// step 2 : obtain pstmt obj
			if (con != null) {
				pstmt = con.prepareStatement(sql);
				// step 3 : set the value at runtime
				pstmt.setString(1, empName);
				// step 4: executeUpdate
				rs = pstmt.executeQuery();
				// if loop is used as we are fetching only 1 record
				while (rs.next()) {
					System.out.println("============Record Found===========");
					int id = rs.getInt(1);
					String ename = rs.getString(2);
					double sal = rs.getDouble("empsal");
					e1 = new Employee(ename, sal);
					e1.setEmpId(id);
				}// end of inner if
			}// end of outer if
		} catch (Exception e) {
			e.printStackTrace();
		} finally {// step 5: close the resources if they are not null
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}// end of finally
		return e1;
	}
}//end of class
