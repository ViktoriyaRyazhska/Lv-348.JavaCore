package e_sixth_lesson.taskTwo;

public class SalariedEmployee extends Employee implements Pay {
    private String socialSecurityNumber;
    private double hoursWorked;
    private double hourlyRate;

    public SalariedEmployee(String name,  String employeeId, String socialSecurityNumber, double hoursWorked, double hourlyRate) {
        super(name,employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;

    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getDescription() {
        return "SalariedEmp{" +
                "Name: " + this.getName() + ", " +
                "EmployeeID: " + this.getEmployeeId() + ", " +
                "socialSecurityNumber: " + socialSecurityNumber +
                ", hoursWorked: " + hoursWorked +
                ", hourlyRate: " + hourlyRate +
                ", Salary= " + calculatePay() + "}";
    }

}
