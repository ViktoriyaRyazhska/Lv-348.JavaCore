package e_sixth_lesson.taskTwo;

public class Employee implements Pay {
    private String name;
    private String employeeId;
    private double salary;

    @Override
    public double calculatePay(){
        return salary;
    }

    @Override
    public String getDescription(){
        return "Employee: \nName: " + this.getName();
    }

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {
    }

    public double getSalary(){
        return  salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

}
