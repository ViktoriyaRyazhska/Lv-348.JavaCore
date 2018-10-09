package Task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiples12 implements Execute {

	
		
		public static void getTwelve() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the namber:");

		int n = Integer.parseInt(br.readLine());
		int a = 0;
		for (int i = 3; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {

				a = a + i;

			}

		}
		System.out.println(a);

	}

		@Override
		public void exec() {
			try {
				getTwelve();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
}
