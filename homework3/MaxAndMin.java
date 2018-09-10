package homework3;

import java.util.Scanner;

public class MaxAndMin {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		System.out.println("Enter a number");
		num1 = input.nextInt();
		
		System.out.println("Enter a number");
		num2 = input.nextInt();
		
		System.out.println("Enter a number");
		num3 = input.nextInt();
		
		defineMax(num1, num2, num3);
		defineMin(num1, num2, num3);
	}
	
	
	public static void defineMax(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the maximum nunmber");
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the maximum nunmber");
		}
		else {
			System.out.println(num3 + " is the maximum number");
		}
		
	}
	
	public static void defineMin(int num1, int num2, int num3) {
		if (num1 < num2 && num1 < num3) {
			System.out.println(num1 + " is the minimum number");
		} 
		else if (num2 < num1 && num2 < num3) {
			System.out.println(num2 + " is the minimum number");
		}
		else {
			System.out.println(num3 + " is the minimum number");
		}
		
	}

}
