package Task1;

public class MyThread extends Thread {
	private String s;
	private int pause;
	private Thread t;
	private Thread a;

	public MyThread(String s, int pause, Thread t,Thread a) {
		this.s = s;
		this.pause = pause;
		this.t=t;
		this.a=a;
		
	}
	
	public MyThread(String s, int pause) {
		this.s = s;
		this.pause = pause;
		
	}

	@Override
	public void run() {
		if (t != null&&a != null)
			try {
			t.join();
			a.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			try {
				sleep(pause);
			} catch (InterruptedException e) {
			}
			System.out.println( s);
		}
	}
}
