package java_core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String c1;
		String c2; 
		String c3;
		
		int t1, t2, t3;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What is the first country you have been calling from?");
		c1 = br.readLine();
		
		System.out.println("What is the second country you have been calling from?");
		c2 = br.readLine();

		System.out.println("What is the third country you have been calling from?");
		c3 = br.readLine();
		
		System.out.println("How long did your first call last in minuntes?");
		t1 = Integer.parseInt(br.readLine());
		
		System.out.println("How long did your second call last in minuntes?");
		t2 = Integer.parseInt(br.readLine());
		
		System.out.println("How long did your third call last in minuntes?");
		t3 = Integer.parseInt(br.readLine());
			
			// Let's assume the price for a minute of a call is even for all the countries and 
		// it is equal to 20 cents;
		int firstCall = 20*t1;
		int secondCall = 20*t2;
		int thirdCall = 20*t3;
		
		int totalCost =  firstCall + secondCall + thirdCall;
		
		System.out.println("Your first call from " + c1 + " will cost you " + firstCall + " cents");
		System.out.println("Your second call from " + c2 + " will cost you " + secondCall + " cents");
		System.out.println("Your third call from" + c3 + " will cost you " + thirdCall + " cents");
		System.out.println("In total, you have been charged with " + totalCost + " cents!");
	}

}
