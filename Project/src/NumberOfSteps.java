import java.util.Scanner;

public class NumberOfSteps extends Menu {

	@Override
	void execute(Scanner sc) {

		int a = 0;
		int count = 0;

		if (a > 1) {

			if (a % 2 == 0) {

				a = a / 2;

				count++;

			} else if (a % 2 > 0) {

				a = a * 3 + 1;

				count++;
			}

		} else if (a == 1) {

			System.out.println("Your need " + count + "steps for 1");

		} else {
			System.out.println("Input number greater that 1!!!");

			execute(sc);

		}

	}

}
