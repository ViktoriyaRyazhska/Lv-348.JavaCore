import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SmallestDivisible extends Menu {
	
	@Override
	void execute(Scanner sc){
		
	long result = 1;
	int ourLim = 20;
	Set <Integer> numbs = new HashSet<>();
	
	for (int i = 1; i <= ourLim; i++) {
		if (result % i != 0) {
			numbs.add(i);
			result *= i;
			for (int j = 2; j < i; j++) {
				if (i % j == 0 && result % j == 0) {
					if (numbs.contains(j)) {
						result /= j;
						numbs.remove(j);
					}
				}
			}
		}
	}
	System.out.println(result);
        
	}
	

}
