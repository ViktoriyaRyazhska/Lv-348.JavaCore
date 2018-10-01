package Howm1;

public class Employee {

	private String employeeId;
	private String name;
	
	
	public Employee() {
	}
	
	
	public Employee(String employeeld, String name) {
		
		this.employeeId = employeeld;
		this.name = name;
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	
}
