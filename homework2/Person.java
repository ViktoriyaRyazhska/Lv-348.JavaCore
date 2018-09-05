package homework2;

import java.util.Scanner;
public class Person {
	private String name;
	private int birthYear;
	
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
	
	public String input () {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println("What is your name? ");
		String personInfo = console.nextLine();
		System.out.println(personInfo);
		return personInfo;
	}
	
	//method to output information about a person
	
	public String toString() {
		return "Name of the person: " + this.name + ". "
				+ "Age:" + this.calcAge(birthYear);
	}
	//method to change name of the person
	public void changeName(String name) {
		this.name = name;
	}
	
}
