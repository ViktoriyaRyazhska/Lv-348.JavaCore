package homework3;

import java.util.Scanner;

public class ThreeFloats {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		float num1, num2, num3;
		
		System.out.println("Enter a float number");
		num1 = input.nextFloat();
		
		System.out.println("Enter a float number");
		num2 = input.nextFloat();
		
		System.out.println("Enter a float number");
		num3 = input.nextFloat();
		
		
		checkForRange(num1, num2, num3);
	}
	
	
	
	
	public static void checkForRange(float num1, float num2, float num3) {
		if (num1 >= -5 && num1 <= 5) {
			System.out.println("First number you have entered, namely " + num1 + ", belongs to the range [-5;5]");
		} else {
			System.out.println(num1 + " doesn't belong to the range [-5;5]");
	}	if (num2 >= -5 && num2 <= 5) {
		System.out.println("Second number you have entered, namely " + num2 + ", belongs to the range [-5;5]");
	} else {
		System.out.println(num2 + " doesn't belong to the range [-5;5]");
	}
	if (num3 >= -5 && num3 <= 5) {
		System.out.println("Third number you have entered, namely " + num3 + ", belongs to the range [-5;5]");
	} else {
		System.out.println(num3 + " doesn't belong to the range [-5;5]");
	}
	
	
	}
	

}
