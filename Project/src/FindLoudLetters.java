import java.util.Scanner;

public class FindLoudLetters extends Menu {
	
	@Override
	void execute(Scanner sc){
		System.out.println("Type anything");
		String mySentence = sc.nextLine().toLowerCase();
		int count = 0;
		for (int i = 0; i < mySentence.length(); i++) {
			if (mySentence.charAt(i) == 'a' || mySentence.charAt(i) == 'e' || mySentence.charAt(i) == 'i'
                    || mySentence.charAt(i) == 'o' || mySentence.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("The number of vowels in your sentence is: " + count);
	}
	
	
}
