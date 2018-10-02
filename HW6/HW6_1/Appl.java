package Lesson6.HW6.HW6_1;


public class Appl {

	public static void main(String[] args) {

		Bird Swallow = new Swallow(null, null);
		((Swallow) Swallow).inf();
		Swallow.fly();

		System.out.println();

		Bird Eagle = new Eagle(null, null);
		((Eagle) Eagle).inf();
		Eagle.fly();

		System.out.println();

		Bird Chicken = new Chicken(null, null);
		((Chicken) Chicken).inf();
		Chicken.fly();

		System.out.println();

		Bird Penguin = new Penguin(null, null);
		((Penguin) Penguin).inf();
		Penguin.fly();

		System.out.println();

		Bird[] bi = new Bird[4];

		bi[0] = Eagle;
		bi[1] = Swallow;
		bi[2] = Chicken;
		bi[3] = Penguin;

		
		for (int i = 0; i < bi.length; i++) {
		bi[i].fly();
			System.out.println();
		}
	}

}
