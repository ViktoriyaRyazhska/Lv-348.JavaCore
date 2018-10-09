
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task9 implements Execute {

	public static void getNinth(){
		int a = 0;
		int b = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			b = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 1; i <= b; i++) {
			if (r1())
				a++;
		}
		System.out.println("Random number is : " + a);
	}

	public static boolean r1() {
		return new Random().nextBoolean();
	}

	@Override
	public void exec() {
		getNinth();
	}
}
