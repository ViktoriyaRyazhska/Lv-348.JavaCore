package homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCar {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Car[] inst = createOfTheCars();
		System.out.print("Please, input cars ceratain model year: ");
		short year = Short.parseShort(br.readLine());
		for(int i = 0; i < inst.length; i++) {
			if(year == inst[i].getYearProduction()) {
				System.out.println(inst[i] + " kVt");
			}
		}
		System.out.println();
		Car.sortYearOfProduction(inst);
		
	}
	
	public static Car[] createOfTheCars() {
		Car[] car = new Car[4];
		car[0] = new Car(TypeCar.MERCEDES, (short) 2018, (short) 150);
		car[1] = new Car(TypeCar.AUDI, (short) 2013, (short) 140);
		car[2] = new Car(TypeCar.BMW, (short) 2016, (short) 130);
		car[3] = new Car(TypeCar.HUMMER_H2, (short) 2009, (short) 340);
		return car;
	}
	
	
	
}
	
	