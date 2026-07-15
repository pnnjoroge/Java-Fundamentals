
/* AUTHOR: PAULETTE NJOROGE
 * DATE: 04/09/2026
 * PURPOSE: PROGRAM IS A CLASS THAT HOLDS EMPLOYEE DATA.
 */
package EmployeeClass;

public class NjorogeEmployeeClass {
	
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public void setName(String assignedName) {
		name = assignedName;
	}
	public void setIdNumber(int assignedIdNumber) {
		idNumber = assignedIdNumber;
	}
	public void setIdNumber(String assignedIdNumber) {
		idNumber = Integer.parseInt(assignedIdNumber);
	}
	public void setDepartment(String assignedDepartment) {
		department = assignedDepartment;
	}
	public void setPosition(String assignedPosition) {
		position = assignedPosition;
	}
	public String getName() {
		return name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public String getDepartment() {
		return department;
	}

	public void Employee (String employeeName, int employeeIdNumber, String employeeDepartment, String employeePosition) {
		name = employeeName;
		idNumber = employeeIdNumber;
		department = employeeDepartment;
		position = employeePosition;
	
	}
	public void Employee (String employeeName, int employeeIdNumber) {
		name = employeeName;
		idNumber = employeeIdNumber;
		department = "";
		position = "";
	
	}
	public void Employee() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	
	}
}

