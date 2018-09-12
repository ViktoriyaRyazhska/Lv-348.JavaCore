import java.util.Scanner;

class TenNum {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int [] listOfNumbs = {-3, 14, 0, -12, 8, 2, -9, 6, 5, 1,};
		
		calcSumOfPositive(listOfNumbs);
		calcProductOfNegative(listOfNumbs);
	}
	
	public static void calcSumOfPositive(int [] listOfNumbs) {
		int sumOfPosNumbs = 0;
		for (int i=0; i <= 4; i++) {
			if (listOfNumbs[i] > 0) {
				sumOfPosNumbs+=listOfNumbs[i];
			}
		}
		System.out.println("The sum of positive numbers within the first five elements of an array is equal to " + sumOfPosNumbs);
	}
	
	public static void calcProductOfNegative(int [] listOfNubs) {
		int productOfNegNubs = 1;
		for (int i=5; i <= listOfNubs.length; i++) {
			if (listOfNubs[i] < 0) {
				productOfNegNubs= productOfNegNubs * listOfNubs[i];
			}
		}
		System.out.println("The product of negative numbers withing the last five elements of an array is equal to " + productOfNegNubs);
	}
	

}
