import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		TaskOne t1 = new TaskOne();
		TaskTwo t2 = new TaskTwo();
		TaskThree t3 = new TaskThree();
		CarFinder cf = new CarFinder();
		CarOrderer co = new CarOrderer();
		Car car1 = new Car("Truck", 2010, 70);
		Car car2 = new Car("Crossover", 2001, 25);
		Car car3 = new Car("Diesel", 1987, 30);
		Car car4 = new Car("Sports Car", 2018, 50);
		Car car5 = new Car("Sedan", 2005, 20);
		
		Car[] carDigest = {car1, car2, car3, car4, car5};
		
		System.out.println("====================================================================");
		t1.getMonthNum();
		System.out.println("====================================================================");
		t2.getSumProd();
		System.out.println("====================================================================");
		t3.getThirdTask();
		System.out.println("====================================================================");
		car1.getInfo();
		car2.getInfo();
		car3.getInfo();
		car4.getInfo();
		car5.getInfo();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		cf.findCarModel(carDigest);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		co.orderByYear(carDigest);
		System.out.println("====================================================================");
	}

}
