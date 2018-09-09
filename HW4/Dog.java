package third_lesson;

import java.util.Objects;
import java.util.Scanner;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed.toString();
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        Dog firstDog = new Dog("Chopper", 3, Breed.DACHSHUND);
        Dog secondDog = new Dog("Lara", 2, Breed.LABRADOR);
        Dog thirdDog = new Dog("King", 5, Breed.ROTTWEILER);

        if (firstDog.name.equals(secondDog.name)) {
            if (firstDog.name.equals(thirdDog.name)) {
                System.out.println(Breed.valueOf(firstDog.breed) + "and" + Breed.valueOf(secondDog.breed) + "and" + Breed.valueOf(thirdDog.breed) + "have the same name.");
            } else {
                System.out.println(Breed.valueOf(firstDog.breed) + " and " + Breed.valueOf(secondDog.breed) + " have the same name.");
            }
        } else if (firstDog.name.equals(thirdDog.name)) {
            System.out.println(Breed.valueOf(firstDog.breed) + " and " + Breed.valueOf(thirdDog.breed) + " have the same name.");
        } else if (secondDog.name.equals(thirdDog.name)) {
            System.out.println(Breed.valueOf(secondDog.breed) + " and " + Breed.valueOf(thirdDog.breed) + " have the same name.");
        } else {
            System.out.println("All dogs have different names.");
        }

        System.out.println(firstDog);
        System.out.println(secondDog);
        System.out.println(thirdDog);

        getOldestDog(firstDog, secondDog, thirdDog);

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public enum Breed {
        DACHSHUND,
        LABRADOR,
        ROTTWEILER
    }

    public static void getOldestDog(Dog firstDog, Dog secondDog, Dog thirdDog) {
        if (firstDog.getAge() > secondDog.getAge() && firstDog.getAge() > thirdDog.getAge()) {
            System.out.println(firstDog.name + ", " + firstDog.getBreed() + " is the oldest dog.");
        } else if (secondDog.getAge() > thirdDog.getAge() && secondDog.getAge() > firstDog.getAge()) {
            System.out.println(secondDog.name + ", " + secondDog.getBreed() + " is the oldest dog.");
        } else {
            System.out.println(thirdDog.name + ", " + thirdDog.getBreed() + " is the oldest dog.");
        }
    }
}
