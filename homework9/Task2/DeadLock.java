
public class DeadLock {

	public final static DeadLock Example1 = new DeadLock();
	public final static DeadLock Example2 = new DeadLock();

	public static void main(String s[]) {

		Thread MyThread = new Thread() {

			public void run() {

				synchronized (Example1) {

					Thread.yield();

					synchronized (Example2) {

						System.out.println("Its ok, we have no deadblock");

					}
				}
			}
		};

		Thread MyThread1 = new Thread() {

			public void run() {

				synchronized (Example2) {

					Thread.yield();

					synchronized (Example1) {

						System.out.println("Its ok, we have no deadblock");
					}
				}
			}
		};

		MyThread.start();
		MyThread1.start();

		System.out.println("End");
	}

}
