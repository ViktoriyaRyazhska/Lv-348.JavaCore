import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calls {
	
	public static void main(String[] args) throws IOException {
		BufferedReader calls = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Phone calls from three countries.");
		System.out.print("How much did a call from Ukraine cost? - ");
		int c1 = Integer.parseInt(calls.readLine());
		
		System.out.print("How much did a call from USA cost? - ");
		int c2 = Integer.parseInt(calls.readLine());
		
		System.out.print("How much did a call from Australia cost? - ");
		int c3 = Integer.parseInt(calls.readLine());
		
		System.out.print("How many minutes did continue talking with Ukraine? - ");
		int t1 =  Integer.parseInt(calls.readLine());
		
		System.out.print("How many minutes did continue talking with USA? - ");
		int t2 =  Integer.parseInt(calls.readLine());
		
		System.out.print("How many minutes did continue talk with Australia? - ");
		int t3 =  Integer.parseInt(calls.readLine());
		
		int time = t1 + t2 + t3;
		int price = c1 + c2 + c3;
		
		System.out.println("Price three calls equals - " + price + " standart units!");
		System.out.println("All talks together continued - " + time + " minutes!");
		
	}
}