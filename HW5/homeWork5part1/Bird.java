package homeWork5part1;

public abstract class Bird {
	
	private boolean feathers;
	private boolean layEggs;
	
	public Bird(boolean feathers, boolean layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	
	public boolean getFeathers() {
		return true;
	}
	
	public void setFeather(boolean feathers) {
		this.feathers = feathers;
	}
	
	public boolean getLayEggs() {
		return true;
	}	
	
	public abstract void fly();

	@Override
	public String toString() {
		return "Does the bird have feathers? - " + feathers + ". Does the bird can lay eggs? - " + layEggs + ".";
	}
	
	
}
