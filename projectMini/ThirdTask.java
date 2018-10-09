import java.util.Scanner;

public class ThirdTask implements execute{
    Scanner sc = new Scanner(System.in);
    @Override
    public void exec() {
        getThirdTask(sc);
    }

    public static void getThirdTask (Scanner sc){
        System.out.print("Enter cost of dollar: ");
        double cost = sc.nextDouble();
        System.out.print("Enter sum of gryvnas: ");
        double sum = sc.nextDouble();
        double result;
        result = sum / cost;
        System.out.printf("You can buy %.2f dollars.", result);
    }
    public ThirdTask(Scanner sc){

    }
}

/*
* 3.	Input cost of dollar and sum of money in gryvna.
* Calculate how many dollars user can buy and change.
* */