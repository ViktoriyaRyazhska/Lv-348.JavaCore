
import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;


public class CallCalculator {
	
	String c1;
	String c2;
	String c3;
	private float t1;
	private float t2;
	private float t3;
    static float price = 6.3f;
    void go() throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	System.out.println("Price today: " + price + "$" );
    	System.out.println("Select firs country : ");
    	String c1 = br.readLine();
    	System.out.println("Enter the duration of the call " + c1);
    	t1 = Float.parseFloat(br.readLine());
    	
    	System.out.println("Select second country : ");
    	String c2 = br.readLine();
    	System.out.println("Enter the duration of the call " + c2);
    	t2 = Float.parseFloat(br.readLine());
    	
    	System.out.println("Select third country : ");
    	String c3 = br.readLine();
    	System.out.println("Enter the duration of the call " + c3);
    	t3 = Float.parseFloat(br.readLine());

    	System.out.println("Country:  " + c1 + ". Price of call is: " + (price*t1) + "$" );  
    	System.out.println("Country:  " + c2 + ". Price of call is: " + (price*t2)  + "$");  
    	System.out.println("Country:  " + c3 + ". Price of call is: " + (price*t3)  + "$");  
    	
    	System.out.println("Countries :  " + c1+ ", " + c2 + ", " + c3+ ". " + "the total cost: " + ((price*t1)+(price*t2)+(price*t3)) + "$" );  

    }
	  public static void main(String[] args) throws IOException {
		  CallCalculator one = new CallCalculator();
		  one.go();

	  }
	  }
