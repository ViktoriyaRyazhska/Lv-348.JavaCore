import java.util.ArrayList;
import java.util.List;

public class ThreeThreads {

	public static void main(String[] args) {

	List <Thread> a = new ArrayList<Thread>();
		Thread a1 = new Thred1();
		Thread a2 = new Thred2();
		Thread a3 = new Thred3();
		
		a.add(a1);
		a.add(a2);
		a.add(a3);

		for(Thread b:a) {
			
			b.start();
			
			try {
				b.join();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("End in the end");
	}

}
