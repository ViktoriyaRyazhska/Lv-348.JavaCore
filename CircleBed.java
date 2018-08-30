package soft.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleBed {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double p = 3.14;
		System.out.println("Enter bed radius:");
		double r = Double.parseDouble(br.readLine());
		double c = 2*p*r;
		double s = Math.pow(p*r, 2);
		System.out.printf("Bed perimeter: %.2f\nBed area: %.2f", c, s);
	}
	
}
