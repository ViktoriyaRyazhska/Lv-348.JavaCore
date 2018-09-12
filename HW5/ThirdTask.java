package fifth_lesson.HW5;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Second positive number has " + getSecondPositive(sc, arr) + " position.");
        System.out.println("Minimum: " + arr[getMin(arr)] + ", is in " + (getMin(arr)+1) + " place.");
    }

    public static int getSecondPositive(Scanner sc, int[] arr) {
        int index = 0;
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                index++;
                if (index == 2) {
                    position = i + 1;
                    break;
                }
            }
        }
        return position;
    }
    public static int getMin(int[] arr){
        int min = arr[0];
        int imin = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min ){
                min = arr[i];
                imin = i;
            }
        }
        return imin;
    }
}

