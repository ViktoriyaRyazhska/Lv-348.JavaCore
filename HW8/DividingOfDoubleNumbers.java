package homeWork8;

import java.util.Scanner;

public class DividingOfDoubleNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter two double numbers: ");
		try {
			System.out.println(div(sc));			
		} catch (ArithmeticException | NumberFormatException ex) {
			System.err.println("Wrongly entered data types! You must input two float-point numbers which != 0. ");
		}
		finally {
			sc.close();
		}
		
		System.out.println("The program is working. The end!");
		
	}
	
	public static double div(Scanner sc) throws ArithmeticException{
		double a = Double.parseDouble(sc.nextLine());
		double b = Double.parseDouble(sc.nextLine());
		
		double result = a / b;
		if (result == Double.NEGATIVE_INFINITY || result == Double.POSITIVE_INFINITY) {
			throw new ArithmeticException();
		}
		return result;
	}

}
