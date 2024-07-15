package com.capg.jdbc.emp.client;

import java.util.Scanner;

import com.capg.jdbc.emp.client.ui.EmployeeUserInterface;

/**
 * @author smita
 *
 */
public class EmployeeBootClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String answere = "yes";
		int choice;
		Scanner sc = new Scanner(System.in);
		outer: do {
			System.out.println("\n======================================"
					+ "Enter your choice==================================\n"
					+ "\n1. Add Employee" + "\n2. View All Employees"
					+ "\n3. Modify Employee" + "\n4. Remove Employee"
					+ "\n5. Search Employee by ID"
					+ "\n6. Search Employee by name"

					+ "\n=================================================="
					+ "===================================================");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				EmployeeUserInterface.addEmployee();
				break;
			case 2:
				EmployeeUserInterface.getAllEmployee();
				break;
			case 3:
				EmployeeUserInterface.modifyEmployee();
				break;
			case 4:
				EmployeeUserInterface.removeEmployee();
				break;
			case 5:
				EmployeeUserInterface.SearchEmployee();
				break;
			case 6:
				EmployeeUserInterface.SearchEmployeeByName();
				break;
			default:
				System.out.println("Wrong Input!! only 1 to 6 ");

			}// end of switch
			System.out.println("Do you want to continue(yes/no)"
					+ "Enter Yes to continue");
			answere = sc.next();
			if (answere.equalsIgnoreCase("no")) {
				System.out
						.println("Thank you for using the application!\n\t\t BYE!");
				System.exit(0);
			} else {
				answere = "yes";
				continue outer;
			}
		} while (answere.equalsIgnoreCase("yes"));
	}// end of main
}
