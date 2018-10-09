package Task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial7 implements Execute {
	public static void getFive() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the namber:");

		int n = Integer.parseInt(br.readLine());
		int a = 1;

		for (int i = 1; i <= n; i++) {

			a = a * i;

		}
		System.out.println(a);
	}

	@Override
	public void exec() {
		try {
			getFive();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
