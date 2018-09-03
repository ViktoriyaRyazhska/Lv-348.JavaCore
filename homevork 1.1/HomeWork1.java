import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
public class HomeWork1 {
	
	  public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Set radius");
	float radius = Float.parseFloat(br.readLine());
	System.out.println(" P = " + (2*3.14*radius));  
	System.out.println(" S = " + (3.14*(radius*radius)) );
	  }
	}


