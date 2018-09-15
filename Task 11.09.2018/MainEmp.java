import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEmp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		Employee[] empl = new Employee[5];
		
		empl[0] = new Employee("Emp1", 2, 65);
		System.out.println(empl[0]);
		empl[1] = new Employee();
		empl[1].setName("Emp2");
		empl[1].inputDepartament(br);
		 empl[2] = new Employee("Emp3", 4, 77);
		 empl[3] = new Employee("Emp4");
		empl[3].inputDepartament(br);
		empl[3].setSalary((float)79.3);
		 empl[4] = new Employee("Emp5", 3, (float) 99.9);
		 
		 System.out.println();
		 Employee.checkDepartament(empl);
		 System.out.println();
		 Employee.sortSalary(empl);
		
		
	}

}
