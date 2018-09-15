
public class Main {

	public static void main(String[] args) {
		
		Bird e = new Eagle();
		Bird c = new Chicken();
		Bird p = new Penguin();
		Bird s = new Swallow();

		Bird[] birds = {e, c, p, s};
		
		e.setFeathers("Brown");
		e.setLayEggs(7);
		c.setFeathers("White");
		c.setLayEggs(10);
		p.setFeathers("Black");
		p.setLayEggs(3);
		s.setFeathers("Yellow");
		s.setLayEggs(5);
		
		for(int i = 0; i < birds.length; i++) {
			birds[i].fly();
			System.out.println(birds[i].getFeathers() + " " + birds[i].getLayEggs());
		}
		
	}

}
