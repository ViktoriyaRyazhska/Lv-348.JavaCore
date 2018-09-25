import java.io.BufferedReader;
import java.io.IOException;

public class Array_car {

	private String carBrand;

	private int enginePower = 0;
	private int yearOFproduction = 0;

	public void inputYearOFproduction(BufferedReader br, Array_car[] car) throws IOException {
		int yearOFproduction1 = 0;

		System.out.println("Year of production ?");
		yearOFproduction1 = Integer.parseInt(br.readLine());
		for (int i = 0; i < car.length; i++)
			if (yearOFproduction1 == car[i].getYearOFproduction()) {
				System.out.println(car[i]);
			}
	}

	public Array_car() {
	}

	public Array_car(int enginePower, int yearOFproduction, String carBrand) {
		this.enginePower = enginePower;
		this.yearOFproduction = yearOFproduction;
		this.carBrand = carBrand;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public int getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}

	public int getYearOFproduction() {
		return yearOFproduction;
	}

	public void setYearOFproduction(int yearOFproduction) {
		this.yearOFproduction = yearOFproduction;
	}

	@Override
	public String toString() {
		return "Array_car [carBrand=" + carBrand + ", enginePower=" + enginePower + ", yearOFproduction="
				+ yearOFproduction + "]";
	}

}
