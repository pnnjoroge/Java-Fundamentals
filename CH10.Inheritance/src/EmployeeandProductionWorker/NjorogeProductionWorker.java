
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/23/2026
 * PURPOSE: PROGRAM PULLS EMPLOYEE INFORMATION OF NAME, EMPLOYEE NUMBER AND HIRE DATE FROM EMPLOYEE CLASS AND ADDS SHIFT INFORMATION.
 */

package EmployeeandProductionWorker;

import java.util.Scanner;

public class NjorogeProductionWorker  extends NjorogeEmployee{
	
	
		public static final int dayShift = 1;
		public static final int nightShift = 2;
		
		private int shift;
		private double payRate;
		
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		NjorogeProductionWorker A = new NjorogeProductionWorker("Mike","013-AC","01/01/2000", 1, 30);
		
		System.out.println(A);
	}
	public NjorogeProductionWorker() {
		super();
		this.shift = dayShift;
		this.payRate = 0;
	}
	
	@Override
	public String toString() {
		String shiftType = shift == dayShift ? "Day" : "Night";
		return super.toString() + "\nEmployee Shift: " + shiftType +
				"\nEmployee Pay Rate: $" + payRate;
	}	
	
	public NjorogeProductionWorker(String employeeName, String employeeNumber, String employeeHire, int shift, double payRate) {
		
		super(employeeName,employeeNumber, employeeHire);
		
		if (shift == dayShift || shift == nightShift) {
			this.shift = shift;
		}
		else {
			System.out.println("Error: shifts should be either 1 (Day) or (2) Night");
		}
		if (payRate <= 0) {
			System.out.println("Error: Pay rate has to be more than $0");
		}
		else {
			this.payRate = payRate;
		}
	}


	public int getShift() {
		return shift;
	}


	public void setShift(int shift) {
		if (shift == dayShift || shift == nightShift) {
			this.shift = shift;
		}
	}


	public double getPayRate() {
		return payRate;
	}


	public void setPayRate(double payRate) {
		if (payRate <= 0) {
			System.out.println("Error: Pay rate has to be more than $0");
		}
		else {
			this.payRate = payRate;
		}

	}
	
}
