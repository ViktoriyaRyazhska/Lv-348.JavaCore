package homework2;

import java.time.LocalDate;
import java.util.Scanner;
public class Person {
	private String name;
	private int birthYear;
	
	Scanner console = new Scanner(System.in);
	LocalDate year = LocalDate.now();
	
	
	//getter and setter for a variable name
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//getter and setter for a variable birthYear
	public int getBirthYear() {
		return this.birthYear;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	//default constructor
	
	public Person() {}
	
	//constructor with 2 parameters
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	//method to calculate the age of a person
	public int calcAge(int birthYear) {
		return 2018 - birthYear;
	}
	
	//method to input information about a person
	
	public String inputName () {
		System.out.println("Enter your name, please");
		return name = console.nextLine();
	//asking the user to enter his/her year of birth
	}
		public int inputBirthYear () {
		System.out.println("Enter the year you were born in");
		return birthYear = console.nextInt();
	}
	
	//method to output information about a person
	
	public String toString() {
		return "Person's name: " + this.name + ". "
				+ "Age:" + this.calcAge(birthYear);
	}
	//method to change name of the person
	public void changeName(String name) {
		this.name = name;
	}
	
}
