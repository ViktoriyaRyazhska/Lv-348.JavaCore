package Task3;

public class ThreadTwo extends Thread {
	private String s;
	   private int pause;
	   private Thread t;
	   
	   public ThreadTwo(String s, int pause,Thread t) {
	      this.s=s;
	      this.pause = pause;
	      this.t = t;
	   }
	   @Override
	   public void run() {
		  
				if (t != null)
					try {
					t.join();
					
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
	      for (int i = 0; i < 3; i++) {
	         try { sleep(pause); 
	         } catch (InterruptedException e) {}
	         System.out.println(s);
	      }
	      Thread t3 = new ThreadThree("Thread number three", 200);
	      t3.start();
	}  

}
