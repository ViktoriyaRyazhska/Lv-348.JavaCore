package SecondTask;

public class Main {

	public static void main(String[] args) {
		
		Employee em1 = new ContractEmployee("Franklin", 5, 20000, "id1");
		Employee em2 = new SalariedEmployee("Trevor", 3892, 30, 200, "id2");
		Employee em3 = new ContractEmployee("Tommy", 7, 25000, "id3");
		Employee em4 = new SalariedEmployee("Carl", 3854, 20, 230, "id4");
		
		Employee[] emArr = {em1, em2, em3, em4};

		Employee tmp;
		for(int i = 0; i < emArr.length - 1; i++) {
			for(int j = i +1; j < emArr.length; j++) {
				if(emArr[i].calculatePay() < emArr[j].calculatePay()) {
					tmp = emArr[i];
					emArr[i] = emArr[j];
					emArr[j] = tmp;
				}
			}
		}
		for(int i = 0; i < emArr.length; i++) {
			System.out.println(emArr[i]);
		}
	}

}
