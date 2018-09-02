package Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int c1 = 10;
		int c2 = 20;
		int c3 = 30;
		
		System.out.println("length of talk with the country 1" + " min:");
		int t1 = Integer.parseInt(br.readLine());
		System.out.println("length of talk with the country 2"+ " min:");
		int t2 = Integer.parseInt(br.readLine());
		System.out.println("length of talk with the country 3"+ " min:");
		int t3 = Integer.parseInt(br.readLine());
		
		
		System.out.println("cost of talking with the country 1" + (t1*c1) + " USD");
		System.out.println("cost of talking with the country 2" + (t2*c2) + " USD");
		System.out.println("cost of talking with the country 3" + (t3*c3) + " USD");
		
		System.out.println("total talk time - " + (t1+t2+t3)+ " min");

	}

}
