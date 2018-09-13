import java.util.Scanner;

public class PhoneCalls {
	
	static Scanner input = new Scanner(System.in);
	static String country;
	static int time;
	static int costPerMin;
	static double totalSum = 0;
	static double callCost;
	public static void main(String[] args) {

	System.out.println("What is the first country you were calling from?");
	country = input.nextLine();
	gettingInfo(country);
	calcPayPerCall(costPerMin, time);
	
	System.out.println("What is the second country you were calling from?");
	country = input.nextLine();
	gettingInfo(country);
	calcPayPerCall(costPerMin, time);
	
	System.out.println("What is the third country you were calling from?");
	country = input.nextLine();
	gettingInfo(country);
	calcPayPerCall(costPerMin, time);
	
	System.out.println("Total Sum for all three calls = " + totalSum);
	}
	
	
	public static void gettingInfo(String country) {
		System.out.println("How much cents do you pay for the minute from " + country + "?");
		costPerMin = input.nextInt();
		System.out.println("How long did the call last in minutes?");
		time = input.nextInt();
	}
	
	public static double calcPayPerCall(int costPerMin, int time){
		
		callCost = costPerMin * time;
		System.out.println("For this call you will pay " + callCost + " cents");
		System.out.println("");
		return totalSum += callCost;
		
	}

}
