import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Employee[] employee = new Employee[6];
		employee[0] = new SalariedEmployee();
		employee[1] = new SalariedEmployee();
		employee[2] = new SalariedEmployee();
		employee[3] = new ContractEmployee();
		employee[4] = new ContractEmployee();
		employee[5] = new ContractEmployee();

		for (int i = 0; i < employee.length; i++) {

			employee[i].SetInformation(reader);

			if (employee[i] instanceof SalariedEmployee) {

				((SalariedEmployee) employee[i]).calculatePay(reader);

			}

			else {
				((ContractEmployee) employee[i]).calculatePay(reader);

			}
		}

		employee[0].OrderBySalary(employee);

	}

}
