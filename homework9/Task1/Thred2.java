
public class Thred2 extends Thread {

	@Override
	public void run() {
	
		for (int i = 0; i < 5; i++) {

			System.out.println("This is second thread");
			System.out.println();

			try {
				
				
				sleep(2000);
				
			} catch (InterruptedException e) {

				System.out.println("Problem in thread 2");
				
				e.printStackTrace();
			}

		}
		
		
		
	}
}
