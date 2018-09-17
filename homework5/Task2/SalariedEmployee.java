import java.io.BufferedReader;
import java.io.IOException;

public class SalariedEmployee extends Employee implements CalculatePay {

	private String socialSecurityNumber;

	

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public int calculatePay(BufferedReader reader) {

		try {

			System.out.println("Enter hours that you where working per Month ");

			int hours = Integer.parseInt(reader.readLine());

			System.out.println("Enter  hourly rate! Dolars per hour");

			setMonthsalary(Integer.parseInt(reader.readLine()) * hours);

		} catch (NumberFormatException | IOException e) {

			System.out.println("Wrong Data! " + e);
			e.printStackTrace();
		}
		return getMonthsalary();

	}

	@Override
	public String toString() {
		return "SalariedEmployee [getMonthsalary()=" + getMonthsalary() + ", getEmployeeId()=" + getEmployeeId()
				+ ", getName()=" + getName() + "]";
	}

}
