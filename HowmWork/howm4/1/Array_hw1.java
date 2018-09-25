import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_hw1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("5 nomber");

		int[] nombers = new int[5];
		int a = 0;
		int p = 0;
		for (int i = 0; i < 5; i++) {
			nombers[i] = Integer.parseInt(br.readLine());
			if (nombers[i] > 0) {

			} else {
				break;

			}
			if (nombers[i] > 0) {
				a++;
				if (a == 2) {
					System.out.println("Pozichan two nomber:" + (i + 1));

				}
				if (nombers[i]>0) {
					p++;
				}

			}

		}
		int min = nombers[0];
		int imin = 0;
		int i = 0;
		while (i < nombers.length) {
			if (nombers[i] < min) {
				min = nombers[i];
				imin = i;
			}
			i++;
		}
		System.out.print("Maximum = " + min);
		System.out.println(" is in " + (imin + 1) + " place");
System.out.println("Product of all entered even numbers:"+ p);
		
		
		}
	}

