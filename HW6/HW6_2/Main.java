package Lesson6.HW6.HW6_2;

public class Main {

	public static void main(String[] args) {

		Employee emp1 = new SalariedEmployee("Vasya", "ABC1234", "987654", 240, 45.8);
		Employee emp2 = new SalariedEmployee("Olya", "ABC1235", "987655", 258, 52.3);
		Employee emp3 = new ContractEmployee("Petro", "ABC1236", "FTI2545", 14000);
		Employee emp4 = new ContractEmployee("Petro", "ABC1237", "FTI2546", 10000);

		Employee[] empArr = { emp1, emp2, emp3, emp4 };

		Employee tmp;
		for (int i = 0; i < empArr.length; i++) {
			for (int j = 0; j < empArr.length; j++) {
				if (((Pay) empArr[i]).calculatePay() > ((Pay) empArr[j]).calculatePay()) {
					tmp = empArr[i];
					empArr[i] = empArr[j];
					empArr[j] = tmp;
				}
			}
		}
		for (int j = 0; j < empArr.length; j++) {
			System.out.println(empArr[j]);
		}
	}

}
