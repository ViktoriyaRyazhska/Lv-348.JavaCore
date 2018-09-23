import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ThirdTask {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		String pat = "\\$(\\d*)(\\.\\d{2})?";
		
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(s);
	
		while(m.find()) {
			System.out.println("This is dollars: " + s.substring(m.start(), m.end()));
		}
	}
}
