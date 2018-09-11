
public class HW2 {

	public static void main(String[] args) {
		Person per = new Person();
		per.personName();
		per.personAge();
System.out.println(per.toString());	
		
		Person per1 = new Person ("Marta ", 1994);
		Person per2 = new Person("Vlad	" , 1995);
		Person per3 = new Person("Liubko	" , 1993);	
		Person per4 = new Person("Ira	" , 1995);
		Person per5 = new Person("Orest	" , 1994);
		
		System.out.println(per1.toString());
		System.out.println(per2.toString());
		System.out.println(per3.toString());
		System.out.println(per4.toString());
		System.out.println(per5.toString());
		

	}

}
