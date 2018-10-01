package Howm1;

public class ContractEmployee extends Employee implements Howm_culc1 {
	public String federalTaxIdmember;
	public float fixed_monthly_payment;

	public ContractEmployee(String federalTaxIdmember, float fixed_monthly_payment, String employeeId, String name) {
		super(employeeId, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixed_monthly_payment = fixed_monthly_payment;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public float getFixed_monthly_payment() {
		return fixed_monthly_payment;
	}

	public void setFixed_monthly_payment(float fixed_monthly_payment) {
		this.fixed_monthly_payment = fixed_monthly_payment;
	}

	@Override
	public float calculatePay() {
		return getFixed_monthly_payment();
	}

	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdmember=" + federalTaxIdmember + ", EmployeeId:" + getEmployeeId()  + ", Name:" + getName() +"the average monthly wage:"+calculatePay() +"]";
	}                                                                         				

}
