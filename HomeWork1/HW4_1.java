package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW4_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		
		System.out.println("Enter please a double number");
		
		
		Double a = Double.parseDouble(br.readLine());
		Double b = Double.parseDouble(br.readLine());
		Double c = Double.parseDouble(br.readLine());
		
         checkdoubleNumber (a);
         checkdoubleNumber (b);
         checkdoubleNumber (c);
		
		 	}

	
		public static void checkdoubleNumber(double t) throws IOException {

			if (t > -5 && t < 5) {
				System.out.println("This number are belongs to the range ");
			} else {
				System.out.println("This number is not belong to the range");
	}


}
}
