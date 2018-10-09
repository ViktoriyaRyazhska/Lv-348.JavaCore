import java.util.Scanner;

public class USDToHrn extends Menu{
	
	@Override
	void execute(Scanner sc){
		
		double dollarExchangeRateChange = 28.00; // cost for those willing to sell dollars
		double dollarExchangeRateBuy = 28.20; // cost for those willing to buy dollars
		System.out.println("What sum of hryvnias do you want to buy/change?");
		double sumOfHryvnias = sc.nextDouble();
		
		
		System.out.println("You can buy $" + (sumOfHryvnias/dollarExchangeRateBuy));
		System.out.println("You can change $" + (sumOfHryvnias/dollarExchangeRateChange));
	}
	
	
	
}
