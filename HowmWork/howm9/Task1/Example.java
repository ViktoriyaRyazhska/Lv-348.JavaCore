package Task1;

public class Example {
   public static void main(String[] args) throws Exception {
      Thread t1 = new MyThread("Thread t1", 100);
      Thread t2 = new MyThread("Thread t2", 250);
      Thread t3 = new MyThread("Thread t3", 150,t1,t2);
      t1.start();
      t2.start();
      t3.start();
//      t1.join();
//      t2.join();
//      System.out.println("Thread main");
   }
}
