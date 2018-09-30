package j_tenth_lesson.HW10;

public class tSecond extends Thread {
    public void run(){
        for(int i = 0; i < 3;i++){
            System.out.println("Thread number two.");
        }
        Thread t = new tThird();
        t.start();
    }
}
