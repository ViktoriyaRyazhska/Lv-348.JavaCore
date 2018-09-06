import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Person pr1 = new Person();
		Person pr2 = new Person();
		Person pr3 = new Person();
		Person pr4 = new Person();
		Person pr5 = new Person();
		
		pr1.input();
		pr2.input();
		pr3.input();
		pr4.input();
		pr5.input();
		
		System.out.println(pr1.getName() + " "+ pr1.getBirthYear() + " " + pr1.age());
		System.out.println(pr2.getName() + " "+ pr2.getBirthYear() + " " + pr2.age());
		System.out.println(pr3.getName() + " "+ pr3.getBirthYear() + " " + pr3.age());
		System.out.println(pr4.getName() + " "+ pr4.getBirthYear() + " " + pr4.age());
		System.out.println(pr5.getName() + " "+ pr5.getBirthYear() + " " + pr5.age());
	}
}
