
public class Run2 implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
		System.out.println("Thread number two");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		Runnable r3 = new Run3();
		Thread t3 = new Thread(r3);
		t3.start();
	}

}
