package Persona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class howk1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("nomber1=");
		double a = Integer.parseInt(br.readLine());
		System.out.println("nomber2=");
		double b = Integer.parseInt(br.readLine());
		System.out.println("nomber3=");
		double c = Integer.parseInt(br.readLine());
		
		if (a <= 5 && a >= -5) { 
		  System.out.println("+");
		 } else { 
			 System.out.println("-");
		 } 
		if (b <= 5 && b >= -5) { 
			  System.out.println("+");
			 } else { 
				 System.out.println("-");
			 } 
		if (c <= 5 && c >= -5) { 
			  System.out.println("+");
			 } else { 
				 System.out.println("-");
			 } 
		
		
		
		
		
	}
}