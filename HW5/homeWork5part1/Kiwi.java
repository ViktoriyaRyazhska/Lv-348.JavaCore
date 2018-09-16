package homeWork5part1;

public class Kiwi extends NonFlyingBird{
	
	public Kiwi(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}
	
	public void fly() {
		System.out.println("I'm kiwi. I can't flying!");
	}
	

}
