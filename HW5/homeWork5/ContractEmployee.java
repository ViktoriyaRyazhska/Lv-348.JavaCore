package homeWork5;

public class ContractEmployee extends Employee implements Payment{
	
	private String federalTaxIdmember;
	private float fixedMonthlyPayment;
	
	
	public ContractEmployee(String federalTaxIdmember, float fixedMonthlyPayment, String employeeId, String name) {
		super(employeeId, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixedMonthlyPayment =fixedMonthlyPayment;
	}
	
	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
	
	public void setFederalTaxIdmember(String fedelarTaxIdmember) {
		this.federalTaxIdmember = fedelarTaxIdmember;
	}
	
	public float getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}
	
	public void setFixedMonthlyPayment(float fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}
	
	@Override
	public float calculatePay() {
		return getFixedMonthlyPayment();
	}

	@Override
	public String toString() {
		return "Contract employee: employee ID - " + getEmployeeId() + "; employee name - " + getName() + "; Federal tax ID - " + getFederalTaxIdmember() + 
				 "; the average monthly wage - " + calculatePay();
	}
	
	

}
