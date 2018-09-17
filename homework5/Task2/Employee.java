import java.io.BufferedReader;
import java.io.IOException;

public class Employee {

	private String employeeId;

	private String name;

	private int monthsalary;

	public Employee(String name, String emloyeeId) {

		this.employeeId = emloyeeId;
		this.name = name;

	}

	public Employee() {

	}

	public int getMonthsalary() {
		
		return monthsalary;
	}

	public void setMonthsalary(int monthsalary) {
		
		this.monthsalary = monthsalary;
	}

	public String getEmployeeId() {
		
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		
		this.employeeId = employeeId;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void SetInformation(BufferedReader reader) {

		try {

			System.out.println("Enter an ID of employee ");

			this.employeeId = reader.readLine();

			System.out.println("Enter a name of employee ");

			this.name = reader.readLine();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void OrderBySalary(Employee[] employee) {

		Employee order;
		for (int i = 0; i < employee.length - 1; i++) {
			for (int j = i + 1; j < employee.length; j++) {
				if (employee[i].monthsalary < employee[j].monthsalary) {
					order = employee[i];
					employee[i] = employee[j];
					employee[j] = order;
				}
			}
		}
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);

			System.out.println();
		}

	}

}
