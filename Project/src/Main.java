import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int taskNum;
			Menu[] mainMenu = new Menu[14];
			mainMenu[0] = new factorial();
			mainMenu[5] = new PalindromeString();
			mainMenu[6] = new CalculateNumbersofWords();
			mainMenu[9] = new RandomValue();
			mainMenu[10] = new NumberOfSteps();
			
			for(int i = 0; i < mainMenu.length; i++) {
				System.out.println("Enter a task number or '0' if you wont to leave: ");
				taskNum = sc.nextInt();
				if(taskNum != 0) {
					mainMenu[taskNum-1].execute(sc);
				} else {
					System.out.println("Bye");
					break;
				}
			}
			
		}
		
}