package homeWork7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyUS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("US currency - ");
		String text = sc.nextLine();
		sc.close();
		
		
		Pattern p = Pattern.compile("\\$(\\d+)(\\.\\d{2})");
		Matcher m = p.matcher(text);
		if (m.matches()) {
			System.out.println("Matches the a pattern for US currency");
		}else {
			System.out.println("Incorrectly entered data types");
		}
		
		m.reset();
		while(m.find()) {
			System.out.println(text.substring(m.start(), m.end()));
		}
	}

}
