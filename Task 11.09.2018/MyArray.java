public class MyArray {

	static int[] myArray = { 8, 16, -3, -20, 90, 160, 3, 2, 14, -6 };

	public static void main(String[] args) {
		checkBiggest();
		checkSumPositive(myArray);
		checkPositive(myArray);
	}

	public static void checkBiggest() {
		int max = myArray[0];
		for(int i = 0; i < myArray.length; i++ ) {
			if(myArray[i] > max) {
				max = myArray[i];
			}
		}
		System.out.println("Max number in my array equels - " + max);
	}

	public static int checkSumPositive(int[] myArray) {
		int sum = 0;
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] > 0) {
				sum += myArray[i];
			}
		}
		System.out.println("Sum pozitive numbers = " + sum);
		return sum;
	}
	
	public static int checkNegative(int[] myArray) {
		int countNegat = 0;
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] < 0) {
				countNegat++;
			}
		}
		System.out.println("Amount negative numbers = " + countNegat);
		return countNegat;
	}
	
	public static int checkPositive(int[] myArray) {
		int countPozit = 0;
		countPozit = myArray.length - checkNegative(myArray);
		System.out.println("Amount pozitive numbers = " + countPozit);
		return countPozit;
	}
}