package java_core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GettingAcquainted {

	public static void main(String[] args) throws IOException {
		
		String name, address;
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name?");
		name = input.readLine();
		
		System.out.println("Where do you live, " + name + "?");
		address = input.readLine();
		
		System.out.println("I feel sorry for you, " + name + " from " + address);
	}

}
