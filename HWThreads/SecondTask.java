public class SecondTask {

	public static void main(String[] args) {
		
		Thread t2 = new Thread() {
			public void run() {
				System.out.println("I'm started!");
				try {
					join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Thread.interrupted();
				System.out.println("Why do not I stop? =(");
			}
		};
		
		t2.start();
		
	}
	
}
