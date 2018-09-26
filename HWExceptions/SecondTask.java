import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondTask {

	public static int readNumber(int start, int end) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your numbers:");
		int a = sc.nextInt();
		if(a >= start && a <= end) {
			return a;
		} else {
			throw new IOException("No!");
		}
	}
	
	public static void main(String[] args) {
	
		int[] nums = new int[10];
		
		try {
			for(int i = 0; i < nums.length; i++) {
				nums[i] = readNumber(1, 100);
				System.out.println(nums[i]);
			}
			
			int tmp;
			for(int i = 0; i < nums.length - 1; i++) {
				for(int j = i + 1; j < nums.length; j++) {
					if(nums[i] > nums[j]) {
						tmp = nums[i];
						nums[i] = nums[j];
						nums[j] = tmp;
					}
				}
			}
			for(int i = 0; i < nums.length; i++) {
				System.out.print(nums[i] + " ");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("No!");
		}
		
		System.out.println("\nHi");
		
	}
	
}
