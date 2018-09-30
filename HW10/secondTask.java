package j_tenth_lesson.HW10;

public class secondTask {
    public final static Object first = new Object();
    public final static Object second = new Object();

    /*
    *
    * I have not ideas how to do this
    * 
    *
    * */
    public static void main(String[] args){
        Thread f = new Thread(){
            public void run(){
                synchronized (first){
                    Thread.yield();
                    synchronized (second){
                        System.out.println("Ok");
                    }
                }
            }
        };
    }
}
/*2/  Cause a deadlock.
        Organize the expectations of ending a thread in main(),
        and make the end of the method main() in this thread.*/