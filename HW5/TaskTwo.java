import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
	
	private int[] Nums = new int[10];
	private long sumPos = 0;
	private long prodNeg = 1;
	private int quant = 0;
	
	public void getSumProd() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("“епер перейдемо до роботи з масивами");
		
		for (int i = 0; i < Nums.length; i++) {
			System.out.println("Please enter " + (i+1) + " number");
			Nums[i] = sc.nextInt();
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Your massive is: " + Arrays.toString(Nums));
		
		for(int i = 0; i < Nums.length/2; i++) {
			if(Nums[i] < 0) {
				quant++;
			}
		}
		
		if(quant == 0) {
			for(int i = 0; i < Nums.length/2; i++) {
				sumPos += Nums[i];
			}
		} else {
			for(int i = Nums.length - 1; i >= Nums.length/2; i--) {
				prodNeg *= Nums[i];
			}
		}
		
		if(sumPos != 0) {
			System.out.println("The sum of the first five positive numbers: " + sumPos);
			System.out.println("-------------------------------------------------");
		} else {
			System.out.println("The product of the last five negative numbers: " + prodNeg);
			System.out.println("-------------------------------------------------");
		}
		
	}
	
}

	
