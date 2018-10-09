package Task1;
import java.util.*;

public class Fib extends Menu{
		
	@Override
	void execute(Scanner sc) {
		 int n1=1;
		 int n2=1;
		 int n;
		 int sum;
	
System.out.println("Enter your number");
		
		n = sc.nextInt();
		
		for (int i = 0 ; i<n ; i++) {
			sum = n1+n2;
			n1 = n2;
			n2 = sum;
		System.out.println(sum);
		
	}
	}
}

