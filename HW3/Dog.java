public class Dog {

	private String name;
	private String breed;
	private int age;
	
	enum Breed {
		PUG("Pug"),
		BULLDOG("Bulldog"),
		HUSKY("Husky");
		
		String name;
		Breed(String name) {
			this.name = name;
		}
	}
	
	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed.name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed.name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
	
}
