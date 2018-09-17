import java.io.BufferedReader;
import java.io.IOException;

public class ContractEmployee extends Employee implements CalculatePay {

	private String federalTaxIdmember;

	public int getMonthsalary() {
		return monthsalary;
	}

	public void setMonthsalary(int monthsalary) {
		this.monthsalary = monthsalary;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public int calculatePay(BufferedReader reader) {

		try {

			System.out.println("Enter  your  monthly salary");

			this.monthsalary = Integer.parseInt(reader.readLine());

		} catch (NumberFormatException | IOException e) {

			System.out.println("Wrong Data! " + e);
			e.printStackTrace();
		}

		return monthsalary;
	}

	@Override
	public String toString() {
		return "ContractEmployee [getMonthsalary()=" + getMonthsalary() + ", getEmployeeId()=" + getEmployeeId()
				+ ", getName()=" + getName() + "]";
	}

}
