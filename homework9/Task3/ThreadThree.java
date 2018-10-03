
public class ThreadThree extends Thread {

	@Override
	
	public void run() {
		

		for(int i =0; i<5; i++) {
			
		System.out.println("Thread number three");
		
		try {
			
			sleep(1000);
			
		} catch (InterruptedException e) {
		
			System.out.println("Problem in thread three");
			
			e.printStackTrace();
		}
		}
		
	}

	
}
