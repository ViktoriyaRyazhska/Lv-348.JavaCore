package company.management.app;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		Writer writerOleg = new Writer(1, "Oleg");
		Writer writerJulia = new Writer(2, "Oleg");
		Writer writerLuke = new Writer(3, "Luke");
		
		List <Writer> writers = new ArrayList<>();
		writers.add(writerOleg);
		writers.add(writerJulia);
		writers.add(writerLuke);
		
		Client client1= new Client();
		Client client2 = new Client();
		Client client3 = new Client();
		
		List<Client> clients = new ArrayList<>();
		clients.add(client1);
		clients.add(client2);
		clients.add(client3);
		
		Company uaWriters = new Company(writers, clients);
		
		makingAnOrder(client1);
		makingAnOrder(client2);
		
//		uaWriters.updateTotalMoneySpent(client1.getPayment());
//		uaWriters.getTotalMoneyEarned();
		
		
	}
	
	//method for making an order
	
	static public void makingAnOrder(Client client1){
		client1.setName(input);
		client1.askForPagesOrdered(input);
		client1.calcPayment(input);
		System.out.println(client1);
		System.out.println("Next client");
		
	}

}
