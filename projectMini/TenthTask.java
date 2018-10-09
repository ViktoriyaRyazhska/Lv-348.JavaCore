import java.util.Scanner;

public class TenthTask implements Execute {
    Scanner sc = new Scanner(System.in);
    public static void getTenthTask(Scanner sc){
        System.out.println("Task №10");
        System.out.print("Enter number: ");
        int number  = sc.nextInt();
        int count = 0;
        if(number <= 1){
            System.out.println("Wrong data.");
        }
        else{
            while(true){
                if(number %2 == 0){
                    number /= 2;
                    count++;
                }
                else{
                    number = number * 3  + 1;
                    count++;
                }
                if(number == 1){
                    break;
                }
            }
        }
        System.out.println("Steps: " + count);
    }

    @Override
    public void exec() {
        getTenthTask(sc);
    }
}
/*
* 10.	Find the number of steps for which you get 1,
* using the following process: we take any
the natural number n is greater than one.
If it is even, then divide it by 2, and if it is odd, then
multiply by 3 and add 1
*/