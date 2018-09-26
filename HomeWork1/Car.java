package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Car {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private String name;
	private int yearofProduce;
	private int enginePower;
	static int tmp;

	public Car(String name, int yearofproduce, int enginePower) {
		this.name = name;
		this.yearofProduce = yearofproduce;
		this.enginePower = enginePower;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearofProduce() {
		return yearofProduce;
	}

	public void setYearofProduce(int yearofProduce) {
		this.yearofProduce = yearofProduce;
	}

	public int getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}

	@Override
	public String toString() {
		return "Car [" + name + ",  " + yearofProduce + ", " + enginePower + "]";
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		Car car[] = new Car[4];

		car[0] = new Car("Mercedes", 1998, 205);
		car[1] = new Car("Opel", 2015, 350);
		car[2] = new Car("BMW", 2008, 420);
		car[3] = new Car("Audi", 2005, 380);

		Car temp1;
		for (int i = 0; i < car.length; i++) {

			for (int j = i + 1; j < car.length; j++) {

				if (car[i].getYearofProduce() < car[j].getYearofProduce()) {

					temp1 = car[i];

					car[i]=car[j];

					car[j]=temp1;
				}
			}

		}
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}

		System.out.println("insert year (1998,2005,2008,2015) ");

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < car.length; i++) {
			if (car[i].getYearofProduce() == n) {
				System.out.println(car[i]);

			}
		}
	}
}