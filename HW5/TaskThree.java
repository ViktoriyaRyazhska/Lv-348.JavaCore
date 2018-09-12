import java.util.Arrays;
import java.util.Scanner;

public class TaskThree {
	
    public void getThirdTask() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " element of massive: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Your massive is: " + Arrays.toString(arr));
        System.out.println(".........................................");
        System.out.println("Second positive number is on " + getSecondPositive(sc, arr) + " position.");
        System.out.println("Minimum: " + arr[getMin(arr)] + ", is in " + (getMin(arr)+1) + " place.");
        System.out.println(".........................................");
        System.out.println("-----------------------------------------");
    }

    public static int getSecondPositive(Scanner sc, int[] arr) {
        int index = 0;
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                index++;
                if (index == 2) {
                    pos = i + 1;
                    break;
                }
            }
        }
        return pos;
    }
    public static int getMin(int[] arr){
        int numMin = arr[0];
        int numIMin = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < numMin) {
            	numMin = arr[i];
            	numIMin = i;
            }
        }
        return numIMin;
    }
}
