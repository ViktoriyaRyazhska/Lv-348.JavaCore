import java.io.IOException;

public class DisplayInfoOfPerson {

	public static void main(String[] args) throws IOException {
		
		Person person1 = new Person("Vitalii", (short)1996);
		Person person2 = new Person("Taras", (short)1986);
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		
		person3.setName("Olga");
		person3.setBirthYear((short)2006);
		
		person4.setName("Svitlana");
		person4.setBirthYear((short)1957);
		
		person3.changeName("Maria");
		
		System.out.println(person1);
		System.out.println("");
		System.out.println(person2);
		System.out.println("");
		System.out.println(person3);
		System.out.println("");
		System.out.println(person4);
		System.out.println("");
		
		person5.input();
		
		System.out.println("");
		System.out.println(person5);
		
	}

}
