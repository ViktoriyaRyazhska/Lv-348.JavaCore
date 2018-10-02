package Lesson6.HW6.HW6_1;

public class Swallow extends FlyingBird {

	public Swallow(String attributes1, String attributes2) {
		super(attributes1, attributes2);
	}

	public void inf() {
		System.out.println("I am Swallow");
		setAttributes1("feathers");
		setAttributes2("layEggs");
		System.out.println("I have " + getAttributes1()+" " + "and" +" "+ getAttributes2());
//		fly();
		eat();
	}
	
	
	public void fly() {
		super.fly();
		System.out.println("I fly fast, but not hi");
	}

		
	public void eat() {
		System.out.println("I am not bird of prey, i eat insects");
	}

}
