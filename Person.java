package second_lesson;

//import java.io.BufferedReader;
//import java.io.IOException;

import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String name;
    private int birthYear;
    private static int count = 0;
    private int id = 0;

    LocalDate currentlyDate = LocalDate.now();
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner in = new Scanner(System.in);

    public Person() {
        count++;
        id = count;
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        count++;
        id = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getbirthYear() {
        return birthYear;
    }

    public void setbirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int age(int birthYear) {
        return currentlyDate.getYear() - birthYear;
    }

    public void input() /*throws IOException */ {
        System.out.print("Please enter your name: ");
        //this.name = br.readLine();
        this.name = in.nextLine();

        System.out.print("Please enter your birthday year: ");
        //this.birthYear = Integer.parseInt(br.readLine());
        this.birthYear = in.nextInt();
    }

    @Override
    public String toString() {
        return id + ".Name: " + name + ", Birthday Year: " + birthYear +
                ", Curenntly age: " + age(birthYear);
    }

    public void changeName(String name) {
        this.setName(name);
    }

    public static void main(String[] arg) {

        Person firstPerson = new Person("Vitalii", 2000);
        Person secondPerson = new Person("Oleksii", 2000);
        Person thirdPerson = new Person();
        Person fourthPerson = new Person();
        Person fifthPerson = new Person();

        thirdPerson.input();

        fourthPerson.setName("Alexander");
        fourthPerson.setbirthYear(1995);

        fifthPerson.setName("Natalia");
        fifthPerson.setbirthYear(2000);

        System.out.println(firstPerson);
        System.out.println(secondPerson);
        System.out.println(thirdPerson);
        System.out.println(fourthPerson);
        System.out.println(fifthPerson);

        secondPerson.changeName("Kolya");

        System.out.println(secondPerson);
    }

}
