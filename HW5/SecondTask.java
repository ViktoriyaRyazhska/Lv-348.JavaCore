package fifth_lesson.HW5;

import java.util.Arrays;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Result: " + getSumOrProduct(sc));
    }

    public static int getSumOrProduct(Scanner sc) {
        int[] arr = new int[10];
        int sum = 0;
        int product = 1;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter " + (i + 1) + " number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        if (count == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                sum += arr[i];
            }
        } else {
            for (int i = arr.length - 1; i >= arr.length / 2; i--) {
                product *= arr[i];
            }
        }
        if (sum != 0) {
            return sum;
        } else {
            return product;
        }
    }
}
