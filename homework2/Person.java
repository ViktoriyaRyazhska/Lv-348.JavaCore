import java.util.Scanner;
import java.time.LocalDate;

public class Person {
	
	public static Scanner input = new Scanner(System.in);
	public static LocalDate localDate = LocalDate.now();

	
	private String name;
	private int birthYear;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	
	//method for calculating a person's age;
	public int calcAge(int birthYear) {
		int age = localDate.getYear() - birthYear;
		return age;
	}
	
	//method to input info about a person
	public void input () {
		System.out.println("Enter the person's name");
		name = input.nextLine();
		System.out.println("Please, enter the person's year of birth");
		birthYear = input.nextInt();
	}
	
	//method to output info about a person
	public String output(int calcAge) {
		return "[Name: " + name + ", age: " + calcAge(birthYear) +"]";
	}
	//method for changing the person's name
	public void changeName(String name) {
		this.name = name;
	}
	
}
