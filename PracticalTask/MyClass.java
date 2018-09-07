package third_lesson;

import java.util.Scanner;

public class MyClass {

    public static void getOdd(int aNumber) {
        int number = aNumber;
        if ((number % 2) == 0) {
            System.out.println("Number isn`t odd.");
        } else {
            System.out.println("Number is odd.");
        }
    }

    public static void main(String[] arg) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = in.nextInt();
        getOdd(number);
        day(4);

        continents country;

        System.out.println("Please enter country (Ukraine, Japan,USA, Brasil, Nigeria, New Zealand): ");
        switch (in.nextLine()) {
            case "Ukraine":
                System.out.println(country = continents.EUROPE);
                break;
            case "Japan":
                System.out.println(country = continents.ASIA);
                break;

            case "USA":
                System.out.println(country = continents.NORTH_AMERICA);
                break;
            case "Brasil":
                System.out.println(country = continents.SOUTH_AMERICA);
                break;
            case "Nigeria":
                System.out.println(country = continents.AFRICA);
                break;
            case "New Zealand":
                System.out.println(country = continents.AUSTRALIA);
                break;
            default:
                System.out.println("No such country in the list.");
                break;
        }

    }

    public static void day(int num) {
        switch (num) {
            case 1:
                System.out.println("Monday, Понеділок.");
                break;
            case 2:
                System.out.println("Tuesday, Вівторок.");
                break;
            case 3:
                System.out.println("Wednesday, Середа.");
                break;
            case 4:
                System.out.println("Thursday, Четвер.");
                break;
            case 5:
                System.out.println("Friday, П'ятниця.");
                break;
            case 6:
                System.out.println("Saturday, Субота.");
                break;
            case 7:
                System.out.println("Sunday, Неділя.");
                break;
            default:
                System.out.println("Error.");
                break;
        }
    }

    public enum continents {
        ASIA, AFRICA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA
    }
}
