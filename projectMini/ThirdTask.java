import java.util.Scanner;

public class ThirdTask implements Execute{
    Scanner sc = new Scanner(System.in);
    @Override
    public void exec() {
        getThirdTask(sc);
    }

    public static void getThirdTask (Scanner sc){
        System.out.println("Task №3");
        System.out.print("Enter cost of dollar: ");
        double cost = sc.nextDouble();
        System.out.print("Enter sum of gryvnas: ");
        double sum = sc.nextDouble();
        double result;
        result = sum / cost;
        System.out.printf("You can buy %.2f dollars.\n", result);
    }
    public ThirdTask(){
    }
}

/*
* 3.	Input cost of dollar and sum of money in gryvna.
* Calculate how many dollars user can buy and change.
* */