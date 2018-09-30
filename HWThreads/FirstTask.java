
public class FirstTask extends Thread{
	
	private String msg;

	public FirstTask(String msg) {
		super();
		this.msg = msg;
	}
	
	@Override 
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(msg);
		}
	}
}
