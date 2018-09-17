
public class Dog {
	Breed breed;
	private String name;
	private int age;
	
	public Dog(Breed breed, String name, int age) {
		this.breed = breed;
		this.name = name;
		this.age = age;
	}
	
	public Dog(Breed breed, String name) {
		this.breed = breed;
		this.name = name;
	}
	
	public Dog(Breed breed) {
		this.breed = breed;
	}

	public Dog() {
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Dog other = (Dog) obj;
		if (age != other.age) return false;
		if (name == null) {
			if (other.name != null) return false;
		} else if (!name.equals(other.name)) return false;
		return true;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
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
	
	
	
}
