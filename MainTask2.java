package fisrt_lesson.second_task;

import java.util.Scanner;

public class MainTask2 {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        String name;
        String address;

        System.out.println("What is your name?");
        name = in.nextLine();
        System.out.println("Where are you live, " + name + "?" );
        address = in.nextLine();
        System.out.println(name + " lives on " + address + " Street.");
    }

}