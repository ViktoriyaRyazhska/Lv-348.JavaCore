import java.util.Scanner;

public class ThreeIntegers {

private static Scanner input = new Scanner(System.in);
private static int num1, num2, num3;

	public static void main(String[] args) {
		
		System.out.println("Enter three integer numbers");
		num1 = Integer.parseInt(input.nextLine());
		num2 = Integer.parseInt(input.nextLine());
		num3 = Integer.parseInt(input.nextLine());
		
		findMax(num1, num2, num3);
		findMin(num1, num2, num3);
	}
	
	static void findMax(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the largest number");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the largest number");
		} else {
			System.out.println(num3 + " is the largest number");
		}
	}
	
	static void findMin(int num1, int num2, int num3) {
		if (num1 < num2 && num1 < num3) {
			System.out.println(num1 + " is the minimum number");
		} else if (num2 < num1 && num2 < num3) {
			System.out.println(num2 + " is the minimum number");
		} else {
			System.out.println(num3 + " is the minimum number");
		}
	}
	

	
}
