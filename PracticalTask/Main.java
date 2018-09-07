package third_lesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        Product games = new Product("Games", 72, 62);
        Product notebook = new Product("Notebook", 17200, 1);

        Product mouse = new Product("Mouse",200);
        mouse.setQuantity(45);

        Product keyboard= new Product("Keyboard");
        keyboard.setPrice(720);
        keyboard.setQuantity(32);

        Product desk = new Product();
        desk.setName("Desk");
        desk.setPrice(2350);
        desk.setQuantity(2);

        System.out.println("The most expensive product is : ");
        Product.getMostExpensive(games, notebook,mouse,keyboard,desk);
        System.out.println("The biggest quantity have(has): ");
        Product.getMostQuantity(games, notebook,mouse,keyboard,desk);


    }
}
