
public class MainPr {

	public static void main(String[] args) {

		Product pr1 = new Product("P1", 2, 13);
		Product pr2 = new Product("P2", 9, 3);
		Product pr3 = new Product("P2", 12, 3);
		
		
		theMostExpencinciveProduduct(pr1, pr2, pr3);
		theMostExpencinciveProduduct(pr2, pr1, pr3);
		theMostExpencinciveProduduct(pr3, pr2, pr1);
		
		System.out.println("Hello");
	}
	
	static void theMostExpencinciveProduduct(Product pr1, Product pr2, Product pr3) {
		if (pr1.getPrice() >= pr2.getPrice() && pr1.getPrice() >= pr3.getPrice()) {
			System.out.println(pr1.getName());
		}
		
	}

}
