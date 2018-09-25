import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_car_main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Array_car[] car = new Array_car[4];
		car[0] = new Array_car(450, 1998, "Audi");
		car[1] = new Array_car(250, 1999, "Gojf");
		car[2] = new Array_car(500, 2000, "Mersedes");
		car[3] = new Array_car(360, 2001, "BMW");

		for (int i = 0; i < car.length; i++) {
			car[i].inputYearOFproduction(br, car);
			

		}

	}

}
