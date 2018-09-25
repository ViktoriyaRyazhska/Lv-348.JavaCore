package Howm;

public class My_Birds {

	public static void main(String[] args) {
		Bird[] bi = new Bird[4];
		bi[0]= new Eagle();
		bi[1] = new Swallow();
		bi[2] = new Chicken();
		bi[3] = new Penguin();
		
		
		
		for (int i = 0; i < bi.length; i++) {
			bi[i].fly();
			
		}
	}

}

