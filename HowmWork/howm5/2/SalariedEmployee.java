package Howm1;

public class SalariedEmployee extends Employee implements Howm_culc1 {

	public String socialSecurityNumber;
	public float hour_lyrate;
	public float number_of_hours_worked;

	public SalariedEmployee(String socialSecurityNumber, float hour_lyrate, float number_of_hours_worked,
			String employeeId, String name) {
		super(employeeId, name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.hour_lyrate = hour_lyrate;
		this.number_of_hours_worked = number_of_hours_worked;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public float getHour_lyrate() {
		return hour_lyrate;
	}

	public void setHour_lyrate(float hour_lyrate) {
		this.hour_lyrate = hour_lyrate;
	}

	public float getNumber_of_hours_worked() {
		return number_of_hours_worked;
	}

	public void setNumber_of_hours_worked(float number_of_hours_worked) {
		this.number_of_hours_worked = number_of_hours_worked;
	}

	@Override
	public float calculatePay() {
		
		return (getHour_lyrate()*getNumber_of_hours_worked());
	}

	@Override
	public String toString() {
		return "SalariedEmployee [socialSecurityNumber=" + socialSecurityNumber + ", EmployeeId:" + getEmployeeId()
				+ ", Name:" + getName() +"the average monthly wage:"+calculatePay() + "]";
	}
	
}
