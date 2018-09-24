package homeWork7;

import java.util.Scanner;

public class SentenceOfFiveWords {

	public static void main(String[] args) {

		System.out.println("Please, enter in the console sentence of the five words: ");
		String[] arrStr = splitSentence();
		
		System.out.println("The longest word in the sentence - " + maxWord(arrStr));
		System.out.println("The number of its letters = " + maxWord(arrStr).length());
		System.out.println("The second word in reverse order - " + reverseOrder(arrStr));
		
	}
	
	public static String[] splitSentence() {
		Scanner sc = new Scanner(System.in);
		String[] arrStr = sc.nextLine().split(" ");
		sc.close();
		return arrStr;
	}
	
	public static String maxWord(String[] arrStr) {
		String max = arrStr[0];
		for (int i = 0; i < arrStr.length; i++) {
			if (arrStr[i].length() > max.length()) {
				max = arrStr[i];
			}
		}
		return max;
	}
	
	public static String reverseOrder(String[] arrStr) {
		StringBuilder sb = new StringBuilder(arrStr[1]);
		sb.reverse();
		String str = sb.toString();
		return str;
	}
	
	

}
