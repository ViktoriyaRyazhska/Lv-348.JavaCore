package Task2;
public class Task2Thread extends Thread {
   private int number;
   private int pause;

   public Task2Thread(int number, int pause) {
      this.number = number;
      this.pause = pause;
   }
   @Override
   public void run() {
      for (int i = 0; i < 5; i++) {
         try { sleep(pause); 
         } catch (InterruptedException e) {}
         System.out.println("Thread " + number);
      }
}  }
