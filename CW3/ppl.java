
public class ppl {

	public static void main(String[] args) {

		Employee em1 = new Employee("Ira", 10);
		em1.setHours(20);

		System.out.println(em1);
		System.out.println(em1.salary());
		
		Employee em2 = new Employee ("Max", 13);
		em2.setHours(15);
		
		System.out.println(em2);
		System.out.println(em2.bonuses());
		

	}

}
