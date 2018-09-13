import java.util.Scanner;

public class Circle {

	static Scanner input = new Scanner(System.in);
	static double radius;
	public static void main(String[] args) {
		
	System.out.println("Enter the radius of a circle");
	radius = input.nextDouble();
		if (radius <= 0) {
			System.out.println("Wrong radius, try again");
		} else {
	calcPerimeter(radius);
	calcArea(radius);
	}
	}
	
	
	public static void calcPerimeter(double radius) {
		double perimeter = 2 * 3.14 * radius;
		System.out.println("Perimeter of your circle is " + perimeter);
	}
	
	public static void calcArea(double radius) {
		double area = 3.14 * (radius * radius);
		System.out.println("Area of your circle is " + area);
	}
	
	
}
