package j_tenth_lesson.HW10;

public class tOne extends Thread{
    public void run(){
        Thread s = new tSecond();
        s.start();
    }
}
