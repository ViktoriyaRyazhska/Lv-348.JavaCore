package homeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainDog {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Dog dog1 = new Dog("Rex", BreedOfDogs.BULLDOG, (byte) 8);

		Dog dog2 = new Dog();
		dog2.setBreed("DALMATIAN");
		dog2.setName("Arnold");
		dog2.setAge((byte) 16);

		System.out.println(dog1);
		System.out.println(dog2);

		System.out.println("");
		System.out.println("If there is no two dogs with the same name - " + dog1.equals(dog2));
		System.out.println("");

		Dog dog3 = new Dog();
		dog3.inputNameAndAge(br);
		dog3.inputBreed(br);
		System.out.println(dog3);

		System.out.println("");
		dog1.checkOldestDog(dog1, dog2, dog3);
		dog2.checkOldestDog(dog2, dog1, dog3);
		dog3.checkOldestDog(dog3, dog2, dog1);

	}

}
