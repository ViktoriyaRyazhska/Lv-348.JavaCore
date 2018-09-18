import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfTen {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int [] myArray = new int [10];
		
		System.out.println("Let's create an array of ten numbers! Go ahead and enter any 10 integer numbers!");
		myArray[0] = input.nextInt();
		myArray[1] = input.nextInt();
		myArray[2] = input.nextInt();
		myArray[3] = input.nextInt();
		myArray[4] = input.nextInt();
		myArray[5] = input.nextInt();
		myArray[6] = input.nextInt();
		myArray[7] = input.nextInt();
		myArray[8] = input.nextInt();
		myArray[9] = input.nextInt();
		System.out.println("The numbers in your array are the following: " + Arrays.toString(myArray));
		
		calcSumOfPositive(myArray);
		calcProductOfNegative(myArray);
	}
	
	static void calcSumOfPositive(int [] myArray) {
		int sumOfFivePos = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > 0) {
				sumOfFivePos+=myArray[i];
			}
		}
		System.out.println("The sum of positive numbers within the first "
				+ "five elements of the array is " + sumOfFivePos);
	}
	
	static void calcProductOfNegative(int [] myArray) {
		int productOfNeg = 1;
		for (int i = 5; i < myArray.length; i++) {
			if (myArray[i] < 0) {
				productOfNeg *= myArray[i];
			} 
			}
		if (productOfNeg >= 0) {
			productOfNeg *= -1;
		}
		System.out.println("The product of negative numbers within the last "
				+ "five elements of the array is " + productOfNeg);
	}

}
