
public class Run1 implements Runnable {

	@Override
	public void run() {
		System.out.println("First thread started!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Runnable r2 = new Run2();
		Thread t2 = new Thread(r2);
		t2.start();

	}

}
