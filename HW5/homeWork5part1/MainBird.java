package homeWork5part1;

public class MainBird {
	
	public static void main(String[] args) {
		
		Bird[] instBrd = createBirds();
		
		for(int i = 0; i < instBrd.length; i++) {
			instBrd[i].fly();
			System.out.println(instBrd[i]);
			System.out.println();
		}
		
	}
	
	public static Bird[] createBirds() {
		Bird[] brd = new Bird[4];
		
		brd[0] = new Eagle(true, true);
		brd[1] = new Kiwi(true, true);
		brd[2] = new Swallow(true, true);
		brd[3] = new Penguin(true, true);
		return brd;
	}

}
