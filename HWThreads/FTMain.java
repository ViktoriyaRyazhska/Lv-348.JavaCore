
public class FTMain {
	
	public static void main(String[] args) {
		
		FirstTask thread1 = new FirstTask("Hi");
		FirstTask thread2 = new FirstTask("Hello");
		FirstTask thread3 = new FirstTask("Bye");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread3.start();
		
	}
}
