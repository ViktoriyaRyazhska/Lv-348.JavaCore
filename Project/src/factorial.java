import java.util.Scanner;

public class factorial extends Menu{

	@Override
	void execute(Scanner sc) {
		System.out.println("Input N: ");
		int n = sc.nextInt();
		
		int factN = 1;
		int[] numbers = new int[n];
		
		try {
		for(int i = 0; i < n; i++) {
			numbers[i] = i+1;
		}
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < numbers.length; i++) {
			factN *= numbers[i];
		}
		
		System.out.println(factN);
	}
	
	

}
