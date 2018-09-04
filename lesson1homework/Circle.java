package java_core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		double perimeter;
		double area;
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a radius of a circle");
		
		int radius =  Integer.parseInt(input.readLine());
		
		perimeter = radius * 3.14 * 2;
		area = radius * radius * 3.14;
		
		System.out.println("The perimeter of your circle is " + perimeter);
		System.out.println("The area of your circle is " + area);
		
		
	}

}
