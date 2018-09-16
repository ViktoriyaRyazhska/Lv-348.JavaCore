package homeWork5;

public class SalariedEmployee extends Employee implements Payment {

	private String socialSecurityNumber;
	private int hourlyRate;
	private float numberOfHoursWorked;

	public SalariedEmployee(String socialSecurityNumber, int hourlyRate, float numberOfHoursWorked, String employeeId,
			String name) {
		super(employeeId, name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;

	}
		
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public float getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(float numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	@Override
	public float calculatePay() {
		return (float)((getHourlyRate() * getNumberOfHoursWorked()));
	}

	@Override
	public String toString() {
		return "Salaried employee: employee ID - " + getEmployeeId() + "; employee name - " + getName() + "; Social Security Number - " + getSocialSecurityNumber() + 
				 "; the average monthly wage - " + calculatePay();
	}
	
	

}
