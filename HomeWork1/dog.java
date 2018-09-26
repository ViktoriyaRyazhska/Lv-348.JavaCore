package Lesson4;

import Lesson4.enumDog.Breed;

public class dog {

	private String name;
	private int age;
	private Breed breed;

	public dog(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public dog() {
	}

	@Override
	public String toString() {

		return name + " " + age+" years " + breed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		dog other = (dog) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
		
	public static void main(String[] args) {

		dog dog1 = new dog("Milka", 3);
		dog1.setBreed(Breed.Dalmatian);

		dog dog2 = new dog("Tuzik", 7);
		dog2.setBreed(Breed.Bulldog);

		dog dog3 = new dog("Luky", 5);
		dog3.setBreed(Breed.Collie);
		System.out.println(dog2);
		System.out.println(dog3);
		System.out.println(dog1);
		

		if (dog1.age>dog2.age && dog1.age>dog3.age) {
			System.out.println(dog1);
		}else if (dog2.age>dog1.age && dog2.age>dog3.age) {
			System.out.println(dog2);
		}else if (dog3.age>dog1.age && dog3.age>dog2.age) {
			System.out.println(dog3);
		}
		
		
		
		System.out.println(dog1.equals(dog2));
		

	}
}
