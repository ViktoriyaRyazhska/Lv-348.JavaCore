import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Person {
	
	private String name;
	private short birthYear;
	
	public Person(String name, short birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public Person() {
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public short getBirthYear() {
		return this.birthYear;
	}
	
	public void setBirthYear(short birthYear) {
		this.birthYear = birthYear;
	}
	
	public void changeName(String name) {
		this.setName(name);
	}
	
	public short age() {
		return (short)(2018 - this.birthYear);
	}

	@Override
	public String toString() {
		return "Person: name - " + name + ", birthYear - " + birthYear + ", age - " + age() + ".";
	}
	
	public void input() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("What is your name? - ");
		String name = bf.readLine();
		this.name = name;
		
		System.out.print("What year was you born? - ");
		short birthYear = Short.parseShort(bf.readLine());
		this.birthYear = birthYear;
		
	}
	
}
