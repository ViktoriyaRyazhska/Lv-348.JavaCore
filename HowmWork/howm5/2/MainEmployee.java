package Howm1;
public class MainEmployee {

	public static void main(String[] args) {
		
		Employee[] instEmployee = createEmployees();
		Employee count;
		
		for(int i = 0; i < instEmployee.length - 1; i++) {
			for(int j = i + 1; j < instEmployee.length; j++) {
				if(instEmployee[i] instanceof Howm_culc1) {
					if(((Howm_culc1)instEmployee[i]).calculatePay() < ((Howm_culc1)instEmployee[j]).calculatePay()) {
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

		empl[0] = new SalariedEmployee("678", 145, 74.55f, "1", "Vasa");
		empl[1] = new ContractEmployee("98", 16350.68f, "2", "Nazar");
		empl[2] = new SalariedEmployee("402", 340, 70.45f, "3", "Oleg");
		empl[3] = new ContractEmployee("78", 15000.50f, "4", "Andria");
		return empl;
	}
}