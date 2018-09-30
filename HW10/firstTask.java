package j_tenth_lesson.HW10;

import j_tenth_lesson.FirstThread;
import j_tenth_lesson.SecondThread;

public class firstTask {
    public static void main(String[] args) {
        Thread first = new firstThread();
        Runnable second = new secondThread();
        Thread secondX = new Thread(second);
        Thread third = new thirdThread();

        first.start();
        secondX.start();

        try {
            secondX.join();
            first.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        third.start();
    }
}
/*
1/  Run three threads and output there different messages for 5 times.
The third thread  after finishing working of the two previous threads.
*/