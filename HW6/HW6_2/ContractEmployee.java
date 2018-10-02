package Lesson6.HW6.HW6_2;

public class ContractEmployee extends Employee implements Pay {

	private String name;
	private String EmployeeId;
	private String FederalTaxIdNumber;
	private int fixedMounthlyPayment;

	public ContractEmployee(String name, String EmployeeId, String FederalTaxIdNumber, int fixedMounthlyPayment) {
		this.name = name;
		this.EmployeeId = EmployeeId;
		this.FederalTaxIdNumber = FederalTaxIdNumber;
		this.fixedMounthlyPayment = fixedMounthlyPayment;

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

	public String getFederalTaxIdNumber() {
		return FederalTaxIdNumber;
	}

	public void setFederalTaxIdNumber(String federalTaxIdNumber) {
		FederalTaxIdNumber = federalTaxIdNumber;
	}

	public int getFixedMounthlyPayment() {
		return fixedMounthlyPayment;
	}

	public void setFixedMounthlyPayment(int fixedMounthlyPayment) {
		this.fixedMounthlyPayment = fixedMounthlyPayment;
	}

	@Override
	public double calculatePay() {
		return fixedMounthlyPayment;
	}

	@Override
	public String Inf() {
		return "name: " + getName() + "\n " + "ID: " + getEmployeeId() + "\n " + "average monthly salary: "
				+ calculatePay();
	}

	@Override
	public String toString() {
		return Inf();
	}

}
