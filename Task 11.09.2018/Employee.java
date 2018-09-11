import java.io.BufferedReader;
import java.io.IOException;

public class Employee {
	
	private String name;
	private int department;
	private float salary;
	
	public Employee(String name, int department, float salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public Employee(String name, int department) {
		this.name = name;
		this.department = department;
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void inputDepartament(BufferedReader br) throws NumberFormatException, IOException {
		System.out.print("Input your departament - ");
		this.department = Integer.parseInt(br.readLine());
	}

	@Override
	public String toString() {
		return "Employee: name - " + name + ", department - " + department + ", salary - " + salary;
	}
	
	public static void checkDepartament(Employee[] empl) {
		for(int i = 0; i < empl.length; i++) {
			if(empl[i].department == 2) {
				System.out.println(empl[i]);
			}
		}
	}
	
	public static void sortSalary(Employee[] empl) {
		Employee tmp;
		for(int i = 0; i < empl.length - 1; i++) {
			for(int j = i+ 1; j < empl.length; j++) {
				if(empl[i].salary < empl[j].salary) {
					tmp = empl[i];
					empl[i]=empl[j];
					empl[j]=tmp;
				}
			}
		}
		for (int i = 0; i < empl.length; i++) {
			System.out.println(empl[i]);
		}
	}
	
	
	
}
