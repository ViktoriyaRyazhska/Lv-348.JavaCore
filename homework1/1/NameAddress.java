
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader; 
	
public class NameAddress {
	
	String name;
	String address;
	
	  public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("ѕрив≥т! як тебе звати?");
	String name = br.readLine();
	System.out.println("ƒе ти проживаЇш?");
	String address = br.readLine();

	System.out.println("ќтже, тебе звати  " + name + " ≥ ти проживаЇш " + address + ".");  
	  }
	}


