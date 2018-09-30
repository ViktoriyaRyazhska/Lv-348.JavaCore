import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;

public class Person {
	private String name1;

	private int birthday = 0;
	private int year=0;
	
	public void input(BufferedReader br ) throws IOException {
		System.out.println("name?");
	    name1= br.readLine();
	    System.out.println("birthday?");
	    birthday=Integer.parseInt(br.readLine());
	}

	public Person() {
	}

	public Person(String name1, int birthday) {
		this.name1 = name1;
		this.birthday = birthday;

	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	
	
	

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void changeName(String name1) {
		this.name1 = name1;
	}

	public int year() {
		return LocalDate.now().getYear() - birthday;

	}
	
	
	
	
	

	@Override
	public String toString() {
		return "Person (name1=" + name1 + ", birthday=" + birthday + ", year=" + year() + ")" ;
	}

}