import java.util.Scanner;

public class Task4 implements Execute {
	@Override
	public void exec() {
		checkLoudLetters();
	}
	
	public static void checkLoudLetters() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		String str = sc.nextLine().toLowerCase();
		
		char[] loud = {'a', 'o', 'e', 'i', 'y', 'u'};
		char[] ch = str.toCharArray();
		
		int count = 0;
		
		
		for(int j = 0; j < loud.length; j++) {
		for(int i = 0; i < ch.length; i++) {
				if(ch[i] == loud[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
