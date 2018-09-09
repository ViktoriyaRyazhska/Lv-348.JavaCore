package Lesson3;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	

	private String name;
	private int birthYear;
	private String info;

	public void input(Scanner sc) {
		System.out.println("input information about " + name);
		info = sc.next();
	}
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public Person() {
	}

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
	
	

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Person " + name ;
	}

	
	private int age() {
		return LocalDate.now().getYear()  - birthYear;
	}
	
		void information() {
			System.out.println(name);
			System.out.println(name +" " + age());
			System.out.println(name +" " + info);
		}

	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		Person p1 = new Person();
		p1.setBirthYear(1995);
		p1.setName("Vova");
		
		Person p2 = new Person();
		p2.setBirthYear(1983);
		p2.setName("Vasya");
		
		Person p3 = new Person();
		p3.setBirthYear(2003);
		p3.setName("Oksana");
		
		Person p4 = new Person();
		p4.setBirthYear(1975);
		p4.setName("Stepan");
		
		Person p5 = new Person();
		p5.setBirthYear(2010);
		p5.setName("Olya");
		
		
		p1.input(sc);
		p2.input(sc);
		p3.input(sc);
		p4.input(sc);
		p5.input(sc);
		
		p1.information();
		p2.information();
		p3.information();
		p4.information();
		p5.information();

	}
}
