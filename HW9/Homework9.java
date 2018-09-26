
package h_ninth_lesson.HW9;

import java.util.Scanner;

public class Homework9 {

    public static void main(String[] args) {
        double num1;
        double num2;
        int start;
        int end;
        int number;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 num: ");
        num1 = sc.nextDouble();
        System.out.print("Enter 2 num: ");
        num2 = sc.nextDouble();
        try {
            double result = div(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.print("Enter START: ");
        start = sc.nextInt();
        System.out.print("Enter END: ");
        end = sc.nextInt();

        int[] arr = new int[10];
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter " + (i + 1) + " Number: ");
                arr[i] = sc.nextInt();
                System.out.println(readNumber(arr[i], start, end));
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    public static double div(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("/0");
        }
        return a / b;
    }

    public static int readNumber(int number, int start, int end) throws NumberFormatException {
        if (number >= start && number <= end) {
            return number;
        } else
            throw new NumberFormatException("Number is out of range.");
    }
}
