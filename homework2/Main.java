
public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		
		p1.input();
		p2.input();
		p3.input();
		p4.input();
		p5.input();
		
		System.out.println(p1.output(p1.calcAge(p1.getBirthYear())));
		System.out.print("");
		System.out.println(p2.output(p2.calcAge(p2.getBirthYear())));
		System.out.print("");
		System.out.println(p3.output(p3.calcAge(p3.getBirthYear())));
		System.out.print("");
		System.out.println(p4.output(p4.calcAge(p4.getBirthYear())));
		System.out.print("");
		System.out.println(p5.output(p5.calcAge(p5.getBirthYear())));
	}

}
