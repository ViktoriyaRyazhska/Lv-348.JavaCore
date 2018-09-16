package homeWork5part1;

public class Penguin extends NonFlyingBird{
	
	public Penguin(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}
	
	public void fly() {
		System.out.println("I'm penguin. I can't flying!");
	}

}
