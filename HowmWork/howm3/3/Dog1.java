import java.io.BufferedReader;
import java.io.IOException;

public class Dog1 {
	private String name_dog;
	private Breed breed;
	private int age = 0;

	public void input2(BufferedReader br) throws IOException {

		System.out.println("name_dog?");
		name_dog = br.readLine();
		System.out.println("breed?");
		breed = breed.valueOf(br.readLine());
		System.out.println("age?");
		age = Integer.parseInt(br.readLine());
	}

	public Dog1() {
	}

	public Dog1(String name_dog, int age) {
		this.name_dog = name_dog;
		this.breed = Breed.valueOf(breed);
		this.age = age;
	}

	public String getName_dog() {
		return name_dog;
	}

	public void setName_dog(String name_dog) {
		this.name_dog = name_dog;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = Breed.valueOf(breed);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog (name_dog=" + name_dog + ", age=" + age + ", breed=" + breed + ")";
	}

}
