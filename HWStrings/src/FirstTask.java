import java.util.*;


public class FirstTask {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		String[] s1 = s.split("\\s");
		
		String maxLenght = s1[0];
		
		for(int i = 0; i < s1.length; i++) {
			if(maxLenght.length() < s1[i].length()) {
				maxLenght = s1[i];
			}
		}
		
		System.out.println(maxLenght);
		
		char[] charQuant = maxLenght.toCharArray();
		System.out.println(charQuant.length);
				
		System.out.println(new StringBuilder(s1[1]).reverse().toString());
	}
	
}
