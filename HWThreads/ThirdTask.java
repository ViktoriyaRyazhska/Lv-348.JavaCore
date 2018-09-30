
public class ThirdTask {
	
	public static void main(String[] args) {
		
		Runnable run1 = new Run1();
		Thread t1 = new Thread(run1);
		
		t1.start();
		
	}
	
}
