import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondTask {

	public int readNumber(int start, int end) throws IOException{
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
		
		SecondTask s1 = new SecondTask();
		SecondTask s2 = new SecondTask();
		SecondTask s3 = new SecondTask();
		SecondTask s4 = new SecondTask();
		SecondTask s5 = new SecondTask();
		SecondTask s6 = new SecondTask();
		SecondTask s7 = new SecondTask();
		SecondTask s8 = new SecondTask();
		SecondTask s9 = new SecondTask();
		SecondTask s10 = new SecondTask();
		
		SecondTask[] nums = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
		
		try {
			for(int i = 0; i < nums.length; i++) {
				System.out.println(nums[i].readNumber(1, 100));
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("No!");
		}
		
		System.out.println("Hi");
		
	}
	
}
