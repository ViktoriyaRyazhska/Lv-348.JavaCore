package Java_Tasks;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		int fib1=1;
		int fib2=1;
		int t;
		int n = new Scanner(System.in).nextInt();
		System.out.print(fib1 + " " + fib2);
		for (int i=2; i < n; i++) {
			t = fib2;
			fib2 = fib1 + fib2;
			fib1 = t;
			System.out.print(" " + fib2);
		}
		
		

	}
}
