
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Person pm1 = new Person();
		pm1.input(br);
		Person pm2 = new Person();
		pm2.input(br);
		Person pm3 = new Person();
		pm3.input(br);
		Person pm4 = new Person();
		pm4.input(br);
		Person pm5 = new Person();
		pm5.input(br);
		


		
		
		System.out.println(pm1);
		System.out.println(pm2);
		System.out.println(pm3);
		System.out.println(pm4);
		System.out.println(pm5);
		

	}

}
