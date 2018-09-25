import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_hw3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("10 nombers");
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;

		n1 = Integer.parseInt(br.readLine());
		n2 = Integer.parseInt(br.readLine());
		n3 = Integer.parseInt(br.readLine());
		n4 = Integer.parseInt(br.readLine());
		n5 = Integer.parseInt(br.readLine());
		n6 = Integer.parseInt(br.readLine());
		n7 = Integer.parseInt(br.readLine());
		n8 = Integer.parseInt(br.readLine());
		n9 = Integer.parseInt(br.readLine());
		n10 = Integer.parseInt(br.readLine());

		int[] nombers = new int[10];
		nombers[0] = n1;
		nombers[1] = n2;
		nombers[2] = n3;
		nombers[3] = n4;
		nombers[4] = n5;
		nombers[5] = n6;
		nombers[6] = n7;
		nombers[7] = n8;
		nombers[8] = n9;
		nombers[9] = n10;

		int sum = 0;
		for (int i = 0; i < nombers.length/2; i++) {
			sum += nombers[i];
			if (nombers[i] < 0) {
				sum = 0;
				break;
			}
		}
		if (sum != 0) {
			System.out.println("summ" + sum);
		} else {
			
		int sum1 = 0;
		for (int J = 5; J < nombers.length; J++) {
			sum1 += nombers[J];

		}
			System.out.println("summ" + sum1);
		}
	}
}
