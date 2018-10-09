import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Integer,Execute> menu = new HashMap<>();
        menu.put(3, new ThirdTask());
        menu.put(10, new TenthTask());

        while(true){
            System.out.print("Choose Task [1..14]: ");
            int choice = sc.nextInt();
            menu.get(choice).exec();
            if(choice == 0){
                System.exit(0);
            }
        }
    }
}
