
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/23/2026
 * PURPOSE: PROGRAM HOLDS AND PRINTS EMPLOYEE INFORMATION OF NAME, EMPLOYEE NUMBER AND HIRE DATE.
 */

package EmployeeandProductionWorker;

import java.util.Scanner;

public class NjorogeEmployee {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		NjorogeEmployee A = new NjorogeEmployee("Rachel","456-DE","08/07/2006");
		
		System.out.println(A);
	}
	
		private String employeeName;
		private String employeeNumber;
		private String employeeHire;
		

	public NjorogeEmployee() {
		this.employeeName = "";
		this.employeeNumber = "";
		this.employeeHire = "";
	}
	
	public NjorogeEmployee(String employeeName, String employeeNumber, String employeeHire) {
		this.employeeName = employeeName;
		this.employeeHire = employeeHire;
		setEmployeeNumber(employeeNumber);
	}
	
	@Override
	public String toString() {
		return "Employee Name: " + employeeName +
				"\nEmployee Number: " + employeeNumber +
				"\nEmployee Hire Date: " + employeeHire;
	}
	
	public void setEmployeeNumber(String employeeNumber) {
		if (employeeNumber.length() != 6) {
			System.out.println("Error: Employee number must be EXACTLY 5 characters, with a dash in between.");
		}
		else {
			String part1 = employeeNumber.substring(0,3);
			String part2 = employeeNumber.substring(4);
			
			
			if (part1.matches("^[0-9]{3}$")) {
				this.employeeNumber = employeeNumber;
			}
			else {
				System.out.println("Error: Employee number's first 3 numbers must be between 0 - 9");
			}
			if (part2.matches("^[A-M]{2}$")) {
				this.employeeNumber = employeeNumber;
			}
			else {
				System.out.println("Error: Employee number's last 2 letters must be between A - M");
			}
		}
		
	}

		public String getEmployeeName() {
			return employeeName;
		}
	
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
	
		public String getEmployeeNumber() {
			return employeeNumber;
		}
	
		public String getEmployeeHire() {
			return employeeHire;
		}
	
		public void setEmployeeHire(String employeeHire) {
			this.employeeHire = employeeHire;
		}
}


