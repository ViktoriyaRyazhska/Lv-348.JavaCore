package homeWork5;

public class MainEmployee {

	public static void main(String[] args) {
		
		Employee[] instEmployee = createEmployees();
		Employee count;
		
		for(int i = 0; i < instEmployee.length - 1; i++) {
			for(int j = i + 1; j < instEmployee.length; j++) {
				if(instEmployee[i] instanceof Payment) {
					if(((Payment)instEmployee[i]).calculatePay() < ((Payment)instEmployee[j]).calculatePay()) {
						count = instEmployee[i];
						instEmployee[i] = instEmployee[j];
						instEmployee[j] = count;
					}
				}
			}
		}
		for (int i = 0; i < instEmployee.length; i++) {
			System.out.println(instEmployee[i]);
			System.out.println();
		}
	}

	public static Employee[] createEmployees() {
		Employee[] empl = new Employee[4];

		empl[0] = new SalariedEmployee("775", 150, 74.55f, "1", "Salaried employee #1");
		empl[1] = new ContractEmployee("96", 16300.68f, "2", "Contract employee #2");
		empl[2] = new SalariedEmployee("396", 240, 78.45f, "3", "Salaried employee #3");
		empl[3] = new ContractEmployee("87", 14250.34f, "4", "Contract employee #4");
		return empl;
	}
}
