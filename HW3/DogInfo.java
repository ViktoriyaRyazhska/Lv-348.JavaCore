
public class DogInfo {

	public void checkSameName(Dog dog1, Dog dog2, Dog dog3) {
		if(dog1.getName() == dog2.getName()) {
			System.out.println(dog1.getBreed() + " and " + dog2.getBreed() + " have same names");
		} else if(dog1.getName() == dog3.getName()) {
			System.out.println(dog1.getBreed() + " and " + dog3.getBreed() + " have same names");
		} else if(dog3.getName() == dog2.getName()) {
			System.out.println(dog3.getBreed() + " and " + dog2.getBreed() + " have same names");
		} else {
			System.out.println("All dogs have different names");
		}
	}
	
	public void checkOldestDog(Dog dog1, Dog dog2, Dog dog3) {
		if(dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
			System.out.println(dog1.getBreed() + " " + dog1.getName() + " is the oldest dog");
		} else if(dog2.getAge() > dog3.getAge() && dog2.getAge() > dog1.getAge()) {
			System.out.println(dog2.getBreed() + " " + dog2.getName() + " is the oldest dog");
		} else if(dog3.getAge() > dog1.getAge() && dog3.getAge() > dog2.getAge()) {
			System.out.println(dog3.getBreed() + " " + dog3.getName() + " is the oldest dog");
		} else {
			System.out.println("All dogs of the same age");
		}
	}
	
}
