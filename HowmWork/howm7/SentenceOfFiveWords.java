package s³tging.howm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SentenceOfFiveWords {

	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please, enter in the console sentence of the five words: ");
		String[] arrStr = splitSentence();
		
		System.out.println("The longest word in the sentence - " + maxWord(arrStr));
		System.out.println("The number of its letters = " + maxWord(arrStr).length());
		System.out.println("The second word in reverse order - " + reverseOrder(arrStr));
		
	}
	
	public static String[] splitSentence() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arrStr = br.readLine().split(" ");
		br.close();
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