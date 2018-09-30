package j_tenth_lesson.HW10;


public class secondThread implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("I`m second Thread!");
        }
    }
}
