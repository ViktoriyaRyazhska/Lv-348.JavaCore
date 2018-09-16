package homeWork5part1;

public class Eagle extends FlyingBird {
	
	public Eagle(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}
	
	@Override
	public void fly() {
		System.out.println("I'm eagle. I can fly!");
	}
	
	

}
