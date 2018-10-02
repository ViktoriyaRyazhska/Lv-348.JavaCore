package Lesson6.HW6.HW6_1;

public class Eagle extends FlyingBird {

	public Eagle(String attributes1, String attributes2) {
		super(attributes1, attributes2);
	}

	public void inf() {
		System.out.println("I am Eagle");
		setAttributes1("feathers");
		setAttributes2("layEggs");
		System.out.println("I have " + getAttributes1()+" " + "and" +" "+ getAttributes2());
//		fly();
		eat();
	}
	
	public void fly() {
	System.out.println("I can fly high and fast");
	}

	public void eat() {
		System.out.println("I am bird of prey, i eat meat");
	}
	
	
	
	
	
	
}
