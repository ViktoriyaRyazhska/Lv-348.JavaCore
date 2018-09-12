package fifth_lesson.HW5;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Product of even positive numbers: " + getProduct(sc));
    }

    public static int getProduct(Scanner sc) {
        int number = 0;
        int product = 1;
        while (true) {
            System.out.print("Enter positive number: ");
            number = sc.nextInt();
            if (number <= 0) {
                break;
            }
            if (number % 2 == 0) {
                product *= number;
            }
        }
        return product;
    }
}
/*Organize entering integers until the first negative number.
 Count the product of all entered even numbers.
*/