
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader; 
	
public class NameAddress {
	
	  public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Hi! What is your name?");
	String name = br.readLine();
	System.out.println("Where do you live?");
	String address = br.readLine();

	System.out.println("So, your name is  " + name + " and you live  " + address + ".");  
	  }
	}


