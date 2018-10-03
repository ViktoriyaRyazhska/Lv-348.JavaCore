
public class ThreadOne extends Thread {

	@Override
	public void run() {
		
		Thread a2 = new ThreadTwo();
		
		 a2.run();
		
		
	}

	
	
}
