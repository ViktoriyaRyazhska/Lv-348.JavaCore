import java.util.Calendar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	
	Calendar cal = Calendar.getInstance();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private String name;
	private int birthYear;
	private int Year = cal.get(Calendar.YEAR);
	
	public Person() {
	}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public String getName() {
		return name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	
	int age() {
		return Year - birthYear;
	}
	
	void input () throws IOException {
		System.out.println("Please input person name:");
		name = br.readLine();
		System.out.println("Please input year of birth:");
		birthYear = Integer.parseInt(br.readLine());;
	}
	
	void changeName(String name) {
		this.name = name;
	}
}
