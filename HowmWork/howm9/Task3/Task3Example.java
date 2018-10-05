package Task3;
public class Task3Example {
   public static void main(String[] args) throws Exception {
      Thread t1 = new ThreadOne();
      Thread t2 = new ThreadTwo("Thread number two", 200,t1);
    
      t1.start();
      t2.start();
      
      
   }
}
