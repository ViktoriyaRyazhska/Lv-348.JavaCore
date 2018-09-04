package java_core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeToPayYourBills {

	public static void main(String[] args) throws IOException {
		String c1, c2, c3;
		int t1, t2, t3;
		int totalSum, sum1, sum2, sum3;
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What is the first country you were calling from?");
		c1 = input.readLine();
		System.out.println("How long did the call last in minutes?");
		t1 = Integer.parseInt(input.readLine());
		//let's assume that the rate is even for all countries
		sum1 = 3*t1;
		System.out.println("For this call you will pay " + sum1 + " dollars.");
		
		System.out.println("What is the second country you were calling from?");
		c2 = input.readLine();
		System.out.println("How long did the call last in minutes?");
		t2 = Integer.parseInt(input.readLine());
		//let's assume the rate is even for all countries
		sum2 = 3*t2;
		System.out.println("For this call you will pay " + sum2 + " dollars.");
		
		System.out.println("What is the third country you were calling from?");
		c3 = input.readLine();
		System.out.println("How long did the call last in minutes?");
		t3 = Integer.parseInt(input.readLine());
		//let's assume that the rate is even for all countries
		sum3 = 3*t3;
		System.out.println("For this call you will pay " + sum3 + " dollars.");
		
		totalSum = sum1 + sum2 + sum3;
		System.out.println("In total, you will pay " + totalSum + " dollars.");
		
	}

}
