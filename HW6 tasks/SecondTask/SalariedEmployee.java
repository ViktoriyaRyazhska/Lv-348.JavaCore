package SecondTask;

public class SalariedEmployee implements Employee {

	private String name;
	private int socialSecurityNumber;
	private int hourlyRate;
	private int numberOfHoursWorked;
	private int salary;
	private String employeeId;
	
	
	
	public SalariedEmployee(String name, int socialSecurityNumber, int hourlyRate, int numberOfHoursWorked, String employeeId) {
		super();
		this. name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.employeeId = employeeId;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "SalariedEmployee [name=" + name + ", employeeId=" + empId() + ", salary=" + calculatePay() + "]";
	}

	@Override
	public int calculatePay() {
		salary = hourlyRate * numberOfHoursWorked;
		return salary;
	}

	@Override
	public String empId() {
		return employeeId;
	}

}
