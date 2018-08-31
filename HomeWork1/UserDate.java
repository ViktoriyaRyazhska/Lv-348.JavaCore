import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserDate {

	public static void main(String[] args) throws IOException {
		BufferedReader userDate = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What is your name?");
		String name = userDate.readLine();
		System.out.println("Where are you live, " + name + "?");
		String address = userDate.readLine();
		System.out.println("I live in " + address);

	}

}
