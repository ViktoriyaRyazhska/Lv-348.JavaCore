package company.management.app;

import java.util.Scanner;

/**
 * This class will contain methods and fields necessary to calculate writer's
 * salary, his/her current rate etc.
 * 
 * @author lubkoVirt
 *
 */
public class Writer {
	
	private Scanner input;
	private int id;
	private String name;
	private double salary;
	private int pagesWritten;
	private double costPerPage;
	private int nightShifts;
	private int costPerNightShift;

	public Writer(int id, String name) {
		this.id = id;
		this.name = name;
		this.costPerPage = 3.5;
		nightShifts = 0;
		pagesWritten = 0;
		costPerNightShift = 1;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return salary;
	}

	public int getNightShifts() {
		return this.nightShifts;
	}

	public int getPagesWritten() {
		return this.pagesWritten;
	}

	public double getCostPerPage() {
		return this.costPerPage;
	}

	public double getCostPerNightShift() {
		return this.costPerNightShift;
	}

	// method for setting the number of night shifts
	public int askForNumOfNightShifts() {
		System.out.println("How many night shifts did you have this month?");
		return nightShifts = input.nextInt();
	}

	// method for setting the number of pages
	public void askForNumOfPages() {
		System.out.println("How many pages did you write this month?");
		pagesWritten = input.nextInt();
	}

	// method for calculating the writer's salary
	public void calcSalary() {
		salary = (costPerPage * pagesWritten) + (nightShifts * costPerNightShift);
		Company.updateTotalMoneySpent(salary);
	}
	
	@Override
	public String toString() {
		return "ID: " + id + "; Name: " + name + "; Salary: " + salary;
	}
}
