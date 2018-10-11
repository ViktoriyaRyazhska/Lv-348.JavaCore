package company.management.app;

import java.util.List;

public class Company {
	private List <Writer> writers;
	private List <Client> clients;
	private static int totalMoneySpent;
	private static int totalMoneyEarned;
	
	public Company(List<Writer>writers, List<Client>clients) {
		this.writers = writers;
		this.clients = clients;
		totalMoneySpent = 0;
		totalMoneyEarned = 0;
	}
	
	public List<Writer> getWriters(){
		return writers;
	}
	public List<Client> getClients(){
		return clients;
	}
	
	//method for adding writers to the company
	public void addWriters(Writer writer) {
		writers.add(writer);
	}
	//method for adding clients to the company
	public void addClients(Client client) {
		clients.add(client);
	}
	//return total money spent by the company
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	//adding total money earned by the company
	public static void updateTotalMoneyEarned(Client client) {
		totalMoneyEarned += client.getPayment();
		System.out.println("Currently, the company earned $" + totalMoneyEarned);
	}
	/**
	 * @return total money spent by the school.
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	// updates the money spent on writers' salary
	public static void updateTotalMoneySpent(double salary) {
		totalMoneyEarned -= salary;
		System.out.println("The company must pay its writers: $" + totalMoneyEarned);
	}
	
}
