
public class Dog_Main {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.setBreed(Breed.BEAGLE);
		dog1.setName("Dimka");
		dog1.setAge(25);
		System.out.println(dog1.toString());
		//another dog
		Dog dog2 = new Dog();
		dog2.setBreed(Breed.LABRADOR);
		dog2.setName("Marko");
		dog2.setAge(25);
		System.out.println(dog2.toString());
		//yet one more dog
		Dog dog3 = new Dog();
		dog3.setBreed(Breed.POODLE);
		dog3.setName("Kliuba");
		dog3.setAge(24);
		System.out.println(dog3.toString());
		
		Dog dog4 = new Dog();
		dog4.setBreed(Breed.CHOW_CHOW);
		dog4.setName("Moska");
		dog4.setAge(22);
		System.out.println(dog4.toString());
		//final dog
		Dog dog5 = new Dog();
		dog5.setBreed(Breed.BOXER);
		dog5.setName("Lutska");
		dog5.setAge(27);
		System.out.println(dog5.toString());
		
		
	if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge() 
			&& dog1.getAge() > dog4.getAge() && dog1.getAge() > dog5.getAge()) {
		System.out.println(dog1.getName() + " is the oldest dog");
	} else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()
			&& dog2.getAge() > dog4.getAge() && dog2.getAge() > dog5.getAge()) {
		System.out.println(dog2.getName() + " is the oldest dog");
	} else if (dog3.getAge() > dog1.getAge() && dog3.getAge() > dog2.getAge()
			&& dog3.getAge() > dog4.getAge() && dog3.getAge() > dog5.getAge()) {
		System.out.println(dog3.getName() + " is the oldest dog");
	} else if (dog4.getAge() > dog1.getAge() && dog4.getAge() > dog2.getAge()
		&& dog4.getAge() > dog3.getAge() && dog4.getAge() > dog5.getAge()) {
		System.out.println(dog4.getName() + " is the oldest dog");
	} else {
		System.out.println(dog5.getName() + " is the oldest dog");
	}
	
	
	System.out.println(dog1.equals(dog2));
	
		
	}
}
