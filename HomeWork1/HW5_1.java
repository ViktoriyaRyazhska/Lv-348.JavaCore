package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW5_1 {

	public static void main(String[] args)  throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int month_days [] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;

		System.out.println("Please enter a nuber of month?");
		
		int nbr = Integer.parseInt(br.readLine());
		
		
		
		if (nbr > 12) { 
			System.out.println("Enter current number");
		}
		
		System.out.println(month_days [nbr]);
		

		
		
	}

}
