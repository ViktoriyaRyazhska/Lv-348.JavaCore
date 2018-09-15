package homework4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmountDayOfEachMonth {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.print("Input day of the month: ");
		checkDay(br);
		
		
	}
	
	public static void checkDay(BufferedReader br) throws NumberFormatException, IOException {
		int[] dayOfEachMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int number = Integer.parseInt(br.readLine());
		if(number >= 1 && number <=12) {
			System.out.println(dayOfEachMonth[number -1]);
		}else {
			System.out.println("It isn't a day of the month.");
		}
	}

}
