import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Integer,Object> menu = new HashMap<>();
        menu.put(3,new ThirdTask(sc));

//        ThirdTask tt = new ThirdTask(sc);
        //ThirdTask.canDollarsBuy(sc);
        while(true){
            System.out.println("Choose Task [1..14]:");
            int choice = sc.nextInt();
            for(Map.Entry<Integer, Object> entry : menu.entrySet()) {
                if(entry.getKey() == choice){
                    menu.get(choice);
                }
            }
        }
    }
}
