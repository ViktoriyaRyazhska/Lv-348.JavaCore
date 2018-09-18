package e_sixth_lesson.taskTwo;

public class ContractEmployee extends Employee implements Pay {
    private double fixedSalary;
    private String federalTaxIdMember;

    public ContractEmployee(String name, String employeeId, double fixedSalary, String federalTaxIdMember) {
        super(name, employeeId);
        this.fixedSalary = fixedSalary;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public String federalTaxIdMember() {
        return this.federalTaxIdMember;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculatePay() {
        return fixedSalary;
    }
    @Override
    public String getDescription(){
        return "ContractEmp{" +
                "Name: " + this.getName() + ", " +
                "FederalTaxIdMember: " + federalTaxIdMember() + ", " +
                "EmployeeId: " + getEmployeeId() +
                ", Salary: " + calculatePay() + "}";
    }

}