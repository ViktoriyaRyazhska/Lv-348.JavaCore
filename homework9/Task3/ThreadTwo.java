
public class ThreadTwo extends Thread {

	@Override
	public void run() {

		for(int i =0; i<3; i++) {
			
		System.out.println("Thread number two");
		
		try {
			
			sleep(1000);
			
		} catch (InterruptedException e) {
		
			System.out.println("Problem in thread two");
			
			e.printStackTrace();
		}
		}
		
		Thread a3 = new ThreadThree();
		
		a3.start();
	}

	
	
}
