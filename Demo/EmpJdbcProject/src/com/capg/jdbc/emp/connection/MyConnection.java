package com.capg.jdbc.emp.connection;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author smita
 *
 */
public class MyConnection {
	public static Connection connection;

	public static Connection getConnection() {
		String driver = null, url = null, username = null, password = null;
		/*
		 * String driver="oracle.jdbc.OracleDriver"; //String
		 * url="jdbc:oracle:thin:172.17.141.85:1521:orcl"; String
		 * url="jdbc:oracle:thin:@localhost:1521:orcl"; String
		 * username="system"; String password="M8$tek12";
		 */
		String pathname = "src\\database.properties";
		File file = new File(pathname);
		if (file.exists()) {
			try {
				FileInputStream fis = new FileInputStream(file);
				Properties prop = new Properties();
				prop.load(fis);
				fis.close();

				driver = prop.getProperty("driver");
				url = prop.getProperty("url");
				username = prop.getProperty("username");
				password = prop.getProperty("password");

				// Step 1: load the driver
				Class.forName(driver);
				// Step 2: get the connection
				connection = DriverManager.getConnection(url, username,
						password);
				if (connection != null) {
					System.out.println("Connection Obtained....");
				} else {
					System.out.println("Connection Not Obtained....");
				}//end of inner if

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}// end of outer if
		else{
			System.out.println("Sorry File does not exists");
		}
		return connection;
	}

	public static void setConnection(Connection connection) {
		MyConnection.connection = connection;
	}

	public static void main(String[] args) {
		MyConnection.getConnection();
	}

}
