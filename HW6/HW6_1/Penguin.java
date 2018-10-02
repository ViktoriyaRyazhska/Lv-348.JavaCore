package Lesson6.HW6.HW6_1;

public class Penguin extends NonFlyingBird {

	public Penguin(String attributes1, String attributes2) {
		super(attributes1, attributes2);
	}
	
	public void inf() {
		System.out.println("I am Penguin");
		setAttributes1("feathers");
		setAttributes2("layEggs");
		System.out.println("I have " + getAttributes1()+" " + "and" +" "+ getAttributes2());
//		fly();
		eat();
	}
	
	public void fly() {
		super.fly();
		System.out.println("But, I can swim");
	}

	
	
	private void eat() {
		System.out.println("I`m sea bird, I eat fish");
	}
		

}
