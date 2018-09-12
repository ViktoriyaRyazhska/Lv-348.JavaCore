package fifth_lesson.HW5;

import java.util.Objects;
import java.util.Scanner;

public class Car {
    private typeCar type;
    private int yearOfProduction;
    private int engineCapacity;

    public Car(typeCar type, int yearOfProduction, int engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public Car() {

    }

    public typeCar getType() {
        return type;
    }

    public void setType(typeCar type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        Car firstCar = new Car(typeCar.CROSSOVER, 2016, 800);
        Car secondCar = new Car(typeCar.SEDAN, 2017, 620);
        Car thirdCar = new Car(typeCar.COUPE, 2015, 640);
        Car fourthCar = new Car(typeCar.SUV, 2018, 640);

        Car[] cars = {firstCar, secondCar, thirdCar, fourthCar};
        getCarByYear(cars, sc);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        getCarSortedByYear(cars, sc);


    }

    public static void getCarByYear(Car[] cars, Scanner sc) {
        int year;
        System.out.print("Enter year of car you want to see: ");
        year = sc.nextInt();

        for (int i = 0; i < cars.length; i++) {
            if (year == cars[i].yearOfProduction) {
                System.out.println(cars[i]);
            }
        }
    }

    public static void getCarSortedByYear(Car[] cars, Scanner sc) {
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].yearOfProduction < cars[j].yearOfProduction) {
                    Car temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
            System.out.println(cars[i]);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction &&
                type == car.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, yearOfProduction);
    }

    public enum typeCar {
        SUV,
        TRUCK,
        SEDAN,
        VAN,
        COUPE,
        CROSSOVER
    }
}

/*Create class Car with fields type, year of production and engine capacity.
 Create and initialize four instances of class Car.
  Display cars certain model year  (enter year in the console);
ordered by the field year.
*/