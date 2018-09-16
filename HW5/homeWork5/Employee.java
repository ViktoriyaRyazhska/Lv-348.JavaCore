package homeWork5;

public class Employee {
	
	private String employeeId;
	private String name;
	
	public Employee() {
		
	}
	
	public Employee(String emplyeeId, String name) {
		this.employeeId = emplyeeId;
		this.name = name;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(String imployeeId) {
		this.employeeId = imployeeId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
