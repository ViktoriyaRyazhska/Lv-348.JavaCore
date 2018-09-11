package homeWork3;

import java.io.BufferedReader;
import java.io.IOException;

public class Dog {

	private String b1 = null;
	private String name = null;
	private BreedOfDogs breed;
	private byte age = 0;

	public Dog(String name, BreedOfDogs breed, byte age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public Dog(String name, BreedOfDogs breed) {
		this.name = name;
		this.breed = breed;
	}

	public Dog(String name) {
		this.name = name;
	}

	public Dog() {

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BreedOfDogs getBreed() {
		return this.breed;
	}

	public void setBreed(BreedOfDogs breed) {
		if (null == breed) {
			throw new IllegalArgumentException();
		}
		this.breed = breed;
	}

	public void setBreed(String breed) {
		BreedOfDogs brr = null;
		try {
			brr = BreedOfDogs.valueOf(breed);
		} catch (Exception e) {
			throw new IllegalArgumentException("invalid breed value", e);
		}
		this.breed = brr;
	}

	public byte getAge() {
		return this.age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public void inputBreed(BufferedReader br) throws IOException {
		System.out.print("Enter one of the breeds of the dog: bulldog, bull_terrier, dalmatian, rottweiler - ");
		b1 = br.readLine();
		BreedOfDogs bred;

		try {
			switch (b1.toUpperCase()) {
			case "BULLDOG":
				bred = BreedOfDogs.BULLDOG;
				this.breed = bred;
				break;
			case "BULL_TERRIER":
				bred = BreedOfDogs.BULL_TERRIER;
				this.breed = bred;
				break;
			case "DALMATIAN":
				bred = BreedOfDogs.DALMATIAN;
				this.breed = bred;
				break;
			case "ROTTWEILER":
				bred = BreedOfDogs.ROTTWEILER;
				this.breed = bred;
				break;
			default:
				System.out.println("Unknown breed! Please, try one more time.");
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("invalid breed value", e);
		}
	}

	public void inputNameAndAge(BufferedReader br) throws IOException {
		System.out.print("Please, enter a name for your pet - ");
		this.name = br.readLine();

		System.out.print("Please, enter an age for your pet - ");
		this.age = Byte.parseByte(br.readLine());
	}

	public void checkOldestDog(Dog dog1, Dog dog2, Dog dog3) {
		if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
			System.out.println("The name and the kind of the oldest dog: Name - " + name + ", breed - " + breed);
		}
	}

	@Override
	public String toString() {
		return "Dog name - " + name + ", breed - " + breed + ", age - " + age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
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

}
