package Task3;
public class ThreadOne extends Thread {
	

   public ThreadOne() {
     
   }
   @Override
   public void run() {
     
         try { sleep(500); 
         } catch (InterruptedException e) {}
       
      }
} 