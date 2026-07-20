
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/23/2026
 * PURPOSE: PROGRAM PULLS EMPLOYEE INFORMATION OF NAME, EMPLOYEE NUMBER AND HIRE DATE FROM EMPLOYEE CLASS AND ADDS SALARY AND BONUS.
 */

package EmployeeandProductionWorker;

import java.util.Scanner;

public class NjorogeShiftSupervisor extends NjorogeEmployee{
	
	private double annualSalary;
	private double productionBonus;
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		NjorogeShiftSupervisor S = new NjorogeShiftSupervisor("Rachael","512-KM","05/08/2005", 90000, 5000);
		S.addSalaryBonus();
		System.out.println(S);
	}

	public NjorogeShiftSupervisor() {
		super();
		this.annualSalary = 0;
		this.productionBonus = 0;
		
	}
	
	@Override
	public String toString() {
		double totalSalary = annualSalary + productionBonus;
		return super.toString() + "\nSupervisor Annual Salary: " + annualSalary +
				"\nSupervisor Bonus: $" + productionBonus + 
				"\nSupervisor Total Salary: $" + totalSalary;
	}	
	
	
	public NjorogeShiftSupervisor(String employeeName, String employeeNumber, String employeeHire, double annualSalary, double productionBonus) {
		super(employeeName, employeeNumber, employeeHire);
		if (productionBonus <= 0) {
			System.out.println("Error: Bonus cannot be negative or $0.");
		}
		else {
			this.productionBonus = productionBonus;
		}
		if (annualSalary <= 0) {
			System.out.println("Error: Annual salary cannot be negative or $0.");
		}
		else {
			this.annualSalary = annualSalary;
		}
		
	}
	public void addSalaryBonus() {
	    double additionalBonus = this.annualSalary * 0.08;
	    this.productionBonus = additionalBonus;
	}


	public double getAnnualSalary() {
		return annualSalary;
	}


	public void setAnnualSalary(double annualSalary) {
		if (annualSalary <= 0) {
			System.out.println("Error: Annual salary cannot be negative or $0.");
		}
		else {
			this.annualSalary = annualSalary;
		}
	}


	public double getProductionBonus() {
		return productionBonus;
	}


	public void setProductionBonus(double productionBonus) {
		if (productionBonus <= 0) {
			System.out.println("Error: Bonus cannot be negative or $0.");
		}
		else {
			this.productionBonus = productionBonus;
		}
	}
}


