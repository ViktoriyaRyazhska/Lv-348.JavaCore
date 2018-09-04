import java.util.Calendar;

public class Person {

	private String name;
	private int birthYear;

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public Person() {

	}

	public int age() {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int age = year - this.birthYear;
		return age;
	}

	public void inputName(String name) {
		this.name = name;
	}

	public void inputYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int outputYear() {
		return this.birthYear;
	}

	public String outputName() {
		return this.name;
	}

	public String changeName(String newName) {
		return this.name = newName;
	}

	public static void main(String[] args) {
		Person Vitaliy = new Person("Vitaliy", 1994);
		Person Taras = new Person("Taras", 1993);
		Person Maryana = new Person();
		Person Valera = new Person();
		Person Huan = new Person();
		Maryana.inputName("Maryana");
		Maryana.inputYear(1990);
		Valera.inputName("Valera");
		Valera.inputYear(1988);
		Huan.inputName("Huan");
		Huan.inputYear(1999);
		System.out.println(Valera.outputName());
		System.out.println(Valera.age());
		Valera.changeName("Superman");
		System.out.println(Valera.outputName());
	}
}
