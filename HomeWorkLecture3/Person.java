	import java.util.Scanner;
import java.io.Console;
import java.time.*;
	
public class Person {
private String name;
private int birthYear;

	Scanner sc = new Scanner(System.in);
	LocalDate date = LocalDate.now();
	
	
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
public Person() {}

public Person(String name, int birthYear) {
	this.name = name;
	this.birthYear = birthYear;
}

public int CalcDate(int birthYear) {
	return LocalDate.now().getYear() - birthYear; 
}
public String  personName () {
	System.out.println("Enter name: ");
	return name = sc.nextLine();
}
public int personAge () {
	System.out.println("Enter year when you born ");
	return birthYear = sc.nextInt();
}

public void changeName(String name){
	this.name = name;
	}

@Override
public String toString() {
	return "Person name: " + this.name + ". "
			+ "Age:" + this.CalcDate(birthYear);
}
	

}

