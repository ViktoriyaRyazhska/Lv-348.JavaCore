package Task3;

public class ThreadThree extends Thread {
	private String s;
	   private int pause;

	   public ThreadThree(String s, int pause) {
	      this.s = s;
	      this.pause = pause;
	   }
	   @Override
	   public void run() {
	      for (int i = 0; i < 5; i++) {
	         try { sleep(pause); 
	         } catch (InterruptedException e) {}
	         System.out.println(s);
	      }
	}   

}
