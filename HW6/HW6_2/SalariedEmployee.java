package Lesson6.HW6.HW6_2;

public class SalariedEmployee extends Employee implements Pay {

	private String name;
	private String EmployeeId;
	private String socialSecuritNumber;
	private int workedHours;
	private double hourlyRate;

	public SalariedEmployee(String name, String EmployeeId, String socialSecuritNumber, int workedHours,
			double hourlyRate) {
		this.name = name;
		this.EmployeeId = EmployeeId;
		this.socialSecuritNumber = socialSecuritNumber;
		this.workedHours = workedHours;
		this.hourlyRate = hourlyRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}

	public String getSocialSecuritNumber() {
		return socialSecuritNumber;
	}

	public void setSocialSecuritNumber(String socialSecuritNumber) {
		this.socialSecuritNumber = socialSecuritNumber;
	}

	public int getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculatePay() {
		return hourlyRate * workedHours;
	}

	@Override
	public String Inf() {
		return "name: " + getName() + "\n " + "ID: " + getEmployeeId() + "/n " + "average monthly salary: "
				+ calculatePay();
	}

	@Override
	public String toString() {
		return Inf();
	}

}
