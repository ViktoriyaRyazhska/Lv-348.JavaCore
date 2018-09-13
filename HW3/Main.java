public class Main {

	public static void main(String[] args) {
		
		TaskOne t1 = new TaskOne();
		TaskOneOne tone = new TaskOneOne();
		DogInfo dInfo = new DogInfo();
		
		Dog dog1 = new Dog("Henry", Dog.Breed.PUG, 5);
		Dog dog2 = new Dog("Arnold", Dog.Breed.HUSKY, 7);
		Dog dog3 = new Dog("Lisa", Dog.Breed.BULLDOG, 12);
		
		t1.getRange();
		t1.getMaxMin();
		tone.getErrorName();
		
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
		
		dInfo.checkSameName(dog1, dog2, dog3);
		dInfo.checkOldestDog(dog1, dog2, dog3);
	}
	
}
