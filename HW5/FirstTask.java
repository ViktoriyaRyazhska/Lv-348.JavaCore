package fifth_lesson.HW5;

import java.io.InputStreamReader;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Month you entered has " + getDaysInMontth(sc) + " days.");
    }

    public static int getDaysInMontth(Scanner sc) {
        int iMonth = 0;
        int[] arrDays = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        System.out.print("Please enter number of month: ");
        int needMonth = sc.nextInt();
        for (int i = 1; i < arrDays.length + 1; i++) {
            if (needMonth == i) {
                iMonth = arrDays[i - 1];
                break;
            }
        }
        return iMonth;
    }

}
