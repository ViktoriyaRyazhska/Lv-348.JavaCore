package Persona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class howk2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("nomber a=");
		double a = Integer.parseInt(br.readLine());
		System.out.println("nomber b=");
		double b = Integer.parseInt(br.readLine());
		System.out.println("nomber c=");
		double c = Integer.parseInt(br.readLine());

		if (a < c && b < c) {
			System.out.println("c="+c);

		} else if (b < a) {
			System.out.println("a="+a);

		} else {
			System.out.println("b="+b);

		}
		
		
		
		if (a > c && b > c) {
			System.out.println("c="+c);


		} else if (b < a) {
			System.out.println("b="+b);

		} else {
			System.out.println("a="+a);

		}
	}
}