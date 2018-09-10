import java.io.BufferedReader;
import java.io.IOException;

public class Dog {
	private String name;
	private Breed breed;
	private int age;

	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Dog() {

	}

	public enum Breed {
		PEKINESE, BEARDER_COLIEE, AFGAN_HOUND;
	}

	public void SetBreed(Breed breed) {
		this.breed = breed;
	}

	public void SetDog(BufferedReader reader) {
		try {
			System.out.println("Set name of your dog :  ");
			this.name = reader.readLine();
			System.out.println("Set age of your dog :  ");
			this.age = Integer.parseInt(reader.readLine());
			System.out.println("Set breed of your dog :  ");
			String breed = reader.readLine();
			this.breed = Breed.valueOf(breed);
		} catch (IOException | IllegalArgumentException e) {
			System.out.println("You set wrong data, please try again " + e);
			e.printStackTrace();
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void SameName(Dog Flyffy, Dog Spike, Dog Lucky) {
		if (Flyffy.equals(Spike)) {
			System.out.println("We have two dogs with the same name!" + Flyffy.name + " and " + Spike.name);
		} else if (Flyffy.equals(Lucky)) {
			System.out.println("We have two dogs with the same name!" + Flyffy.name + " and " + Lucky.name);
		} else if (Spike.equals(Lucky)) {

			System.out.println("We have two dogs with the same name!" + Spike.name + " and " + Lucky.name);
		} else {
			System.out.println("No dogs with the same name!");
		}
	}

	public void OldestOne(Dog Flyffy, Dog Spike, Dog Lucky) {
		if ((Spike.age > Lucky.age) && (Spike.age > Flyffy.age)) {
			System.out.println("Oldest dog is  " + Spike.name + " , breed is  " + Spike.breed);
		} else if ((Flyffy.age > Lucky.age) && (Flyffy.age > Spike.age)) {
			System.out.println("Oldest dog is  " + Flyffy.name + " , breed is  " + Flyffy.breed);
		} else if ((Lucky.age > Flyffy.age) && (Lucky.age > Spike.age)) {
			System.out.println("Oldest dog is  " + Lucky.name + " , breed is  " + Lucky.breed);
		} else {
			System.out.println("NO information about age.");
		}
	}
}
