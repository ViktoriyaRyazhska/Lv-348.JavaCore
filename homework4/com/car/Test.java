package com.car;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		Car car1 = new Car("Electric", 1.4);
		Car car2 = new Car("Diezel", 2.0);
		Car car3 = new Car("Petrol", 2.4);
		Car car4 = new Car("Hybrid", 1.6);
		
		
		
		System.out.println("Enter the year of the car1");
		car1.setYearOfProduction(input.nextInt());
		car2.setYearOfProduction(input.nextInt());
		car3.setYearOfProduction(input.nextInt());
		car4.setYearOfProduction(input.nextInt());
		Car[] car = {car1, car2, car3, car4};
		System.out.println(Arrays.toString(car));

	}

}
