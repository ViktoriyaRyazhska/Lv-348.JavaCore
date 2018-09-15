
public class MainAnimal {

	public static void main(String[] args) {

		Animal[] an = new Animal[3];
		an[0] = new Cat();
		an[1] = new Dog();
		an[2] = new Cat();
		
		for (int i = 0; i < an.length; i++) {
			an[i].voice();
			an[i].feed();
		}
		
		
	}

}
