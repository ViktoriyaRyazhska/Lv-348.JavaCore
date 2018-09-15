package homework4;

public class Car {

	private TypeCar type = null;
	private int yearProduction = 0;
	private short engineCepacity = 0;
	
	public Car(TypeCar type, short yearProduction, short engineCepacity) {
		this.type = type;
		this.yearProduction = yearProduction;
		this.engineCepacity = engineCepacity;
	}
	
	public TypeCar getType() {
		return type;
	}
	
	public void setType(TypeCar type) {
		this.type = type;
	}
	
	public int getYearProduction() {
		return yearProduction;
	}
	
	public void setYearProduction(int yearProduction) {
		this.yearProduction = yearProduction;
	}
	
	public short getEngineCepacity() {
		return engineCepacity;
	}
	
	public void setEngineCapacity(short engineCepacity) {
		this.engineCepacity = engineCepacity;
	}
	
	public static void sortYearOfProduction(Car[] car) {
		Car count;
		for(int i = 0; i < car.length - 1; i++) {
			for(int j = i + 1; j < car.length; j++) {
				if(car[i].yearProduction < car[j].yearProduction) {
					count = car[i];
					car[i] = car[j];
					car[j] = count;
				}
			}
		}
		for(int i = 0; i < car.length; i++) {
			System.out.println(car[i] + " kVt");
		}
	}


	@Override
	public String toString() {
		return "Car type: " + type + ", year production - " + yearProduction + ", engine cepacity - " + engineCepacity;
	}
	
	
	
}
