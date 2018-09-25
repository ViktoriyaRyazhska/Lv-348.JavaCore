import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_hw2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("n");

		int n = 0;
		n = Integer.parseInt(br.readLine());

		

		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };


		System.out.println(month[n-1]);
	}
}
