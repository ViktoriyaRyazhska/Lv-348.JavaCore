package java_core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework1 {
	// Calculate the perimeter and area of the circle.
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		double perimeter, area, radius;
		
		BufferedReader rad = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius of the circle: ");
		radius =  Double.parseDouble(rad.readLine());
		
		perimeter = radius*2*3.14;
		area = 3.14*(radius*radius);
		
		System.out.println("Perimeter of your circle is " + perimeter);
		System.out.println("Area of your cirecle is " + area);
	}

}
