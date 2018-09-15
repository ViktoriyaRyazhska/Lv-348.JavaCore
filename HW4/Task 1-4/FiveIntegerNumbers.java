package homework4;

import java.util.Scanner;

public class FiveIntegerNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] fiveIntegers = new int[5];
		for(int i = 0; i < fiveIntegers.length; i++) {
			System.out.print("Enter " + (i + 1) + " integer: ");
			fiveIntegers[i] = sc.nextInt();
		}
		
		int minIndex = getMinIndex(fiveIntegers);
		int minValue = fiveIntegers[minIndex];
		
		
		System.out.println(positionOfPositiveNumbers(fiveIntegers));
		System.out.print("Minimum number in the array " + minValue);
		System.out.println(" is in " + (minIndex + 1) + " place");
		sc.close();
	}
	
	public static int positionOfPositiveNumbers(int[] fiveIntegers) {
		
		int indexOfSecondpositive = 0;
		int count = 0;
		
		for(int i = 0; i < fiveIntegers.length; i++) {
			if(fiveIntegers[i] > 0) {
				count++ ;
			}if(count == 2) {
				indexOfSecondpositive = i + 1;
				break;
			}
		}
		return indexOfSecondpositive;
	}
	
	public static int getMinIndex(int[] fiveIntegers) {
		int min = fiveIntegers[0];
		int imin = 0;
		
		for(int i = 1; i < fiveIntegers.length; i++) {
			if(min > fiveIntegers[i]) {
				min = fiveIntegers[i];
				imin = i;
			}
		}
		return imin;
	}	
}
