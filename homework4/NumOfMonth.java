import java.util.Scanner;

public class NumOfMonth {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int [] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		defineDaysInMonth(daysOfMonth);
		
	}
	
	public static void defineDaysInMonth(int [] daysOfMonth) {
		System.out.println("Enter the number of the month");
		int monthNumber = input.nextInt();
		for (int i = 1; i <= daysOfMonth.length; i++) {
			if (monthNumber == i) {
				System.out.println("Number of days in this month is equal to " + daysOfMonth[i]);
			} 
			
			else if (monthNumber > 12) {
				System.out.println("Wrong month, try again!");
				break;
			}
		}
		
	}

}
