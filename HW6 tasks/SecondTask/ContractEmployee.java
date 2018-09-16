package SecondTask;

public class ContractEmployee implements Employee {

	private String name;
	private int federalTaxIdmember;
	private int fixedSalary;
	private String employeeId;;
	
	public ContractEmployee(String name, int federalTaxIdmember, int fixedSalary, String employeeId) {
		super();
		this.name = name;
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixedSalary = fixedSalary;
		this.employeeId = employeeId;
	}

	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}



	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}



	public int getFixedSalary() {
		return fixedSalary;
	}



	public void setFixedSalary(int fixedSalary) {
		this.fixedSalary = fixedSalary;
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
		return fixedSalary;
	}

	@Override
	public String empId() {
		return employeeId;
	}
	
	

}
