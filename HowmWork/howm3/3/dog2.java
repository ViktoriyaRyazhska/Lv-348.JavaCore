
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dog2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Breed: BULLDOG, BULL_TERRIER, DALMATIAN, ROTTWEILER");
		Dog1 dg1 = new Dog1();
		dg1.input2(br);
		Dog1 dg2 = new Dog1();
		dg2.input2(br);
		Dog1 dg3 = new Dog1();
		dg3.input2(br);

		System.out.println(dg1);
		System.out.println(dg2);
		System.out.println(dg3);

		if (dg1.getAge() > dg2.getAge() && dg1.getAge() > dg3.getAge()) {
			System.out.println("old dog: " + dg1.getName_dog());

		}
		if (dg2.getAge() > dg3.getAge() && dg2.getAge() > dg1.getAge()) {
			System.out.println("old dog: " + dg2.getName_dog());

		}
		if (dg3.getAge() > dg1.getAge() && dg3.getAge() > dg2.getAge()) {
			System.out.println("old dog: " + dg3.getName_dog());

		}
		System.out.println("Dog1name=Dog2name?"+dg1.getName_dog().equals(dg2.getName_dog()));
		System.out.println("Dog1name=Dog3name?"+dg1.getName_dog().equals(dg3.getName_dog()));
		System.out.println("Dog2name=Dog3name?"+dg2.getName_dog().equals(dg3.getName_dog()));

	}

}
