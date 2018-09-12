import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Car {
	private String type;
	private int year;
	private int engineCapacity;

	public Car(String type, int year, int engineCapacity) {

		this.type = type;
		this.year = year;
		this.engineCapacity = engineCapacity;
	}

	public Car(String type, int engineCapacity) {

		this.type = type;
		this.engineCapacity = engineCapacity;
	}

	public Car(int engineCapacity) {

		this.engineCapacity = engineCapacity;
	}

	public Car() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public void SetCar(BufferedReader reader) {

		System.out.println("Set type of car");
		try {
			this.type = reader.readLine();

			System.out.println("Set year of your car");

			this.year = Integer.parseInt(reader.readLine());

			System.out.println("Set engine  Capacity");

			this.engineCapacity = Integer.parseInt(reader.readLine());

		} catch (NumberFormatException | IOException e) {

			System.out.println(" Wrong data! " + e + " Input write data!");

			e.printStackTrace();
		}

	}
	
	public void SetModelYear(BufferedReader reader) {
		
		System.out.println("Set model  year of your car");

		try {
			this.year = Integer.parseInt(reader.readLine());
			
		} catch (NumberFormatException | IOException e) {
			
			System.out.println(" Wrong data! " + e + " Input write data!");
			
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		
		return "Car [type= " + type + ", year= " + year + ", engineCapacity=  " + engineCapacity + "]";
	}
	

	public  void orderByYear(Car[] cars){
		
		int order;
		for (int i = 0; i < cars.length - 1; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].year < cars[j].year) {
					order = cars[i].year;
					cars[i].year = cars[j].year;
					cars[j].year = order;
				}
			}
		}
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		
	}

	public static void main(String[] args) {
BufferedReader reader = new BufferedReader ( new InputStreamReader(System.in));
		Car[] cars = new Car[4];
		cars[0] =new Car();
		cars[1] = new Car();
		cars[2] = new Car();
		cars[3] = new Car();
		cars[0].SetCar(reader);
		cars[1].SetCar(reader);
		cars[2].SetCar(reader);
		cars[3].SetCar(reader);
		cars[0].orderByYear(cars);
	}

}
