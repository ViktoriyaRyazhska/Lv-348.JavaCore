import java.util.Scanner;

public class DaysInMonth {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int [] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println("Enter the number of a month");
		int monthNumber = input.nextInt();
		
		for (int i = 0; i < monthDays.length; i++) {
			if (monthNumber == i && monthNumber != 0) {
				System.out.println("The number of days in this month is " + monthDays[i]);
			}
		}
	}
}