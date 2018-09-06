
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class HomeWork2 {

	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println(name + " " + "where are you live?");
		String address = br.readLine();
		System.out.println(name +" "+"live in" + " " + address);
	}

}
