import java.util.Arrays;
import java.util.Scanner;
public class ArrayOfFive {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int [] theArray = new int [5];
		
		System.out.println("Let's create a five-number integer array, go ahead and enter some numbers");
		theArray[0] = input.nextInt();
		theArray[1] = input.nextInt();
		theArray[2] = input.nextInt();
		theArray[3] = input.nextInt();
		theArray[4] = input.nextInt();
		
		System.out.println("Your array looks like this " + Arrays.toString(theArray));
		definePosition(theArray);
		findMinNum(theArray);
	}
	
		static void definePosition(int [] theArray) {
			int tempNum = 0;
			int secondPositive = 0;
			for (int i = 0; i <= theArray.length; i++) {
				if (theArray[i] > 0) {
						tempNum++;
						if (tempNum == 2) {
							tempNum = i;
							secondPositive = theArray[i];
							break;
						}
					}
			}
			System.out.println("Position of the second positive number " + secondPositive + " is " + (tempNum+1));
			
		}
		
		static void findMinNum(int [] theArray) {
			int minNum = theArray[0];
			for (int j = 0; j < theArray.length; j++) {
				if (theArray[j] < minNum) {
					minNum = theArray[j];
				}
			}
			System.out.println("Minimum number is " + minNum);
			
		}
}
