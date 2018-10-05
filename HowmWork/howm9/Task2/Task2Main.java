package Task2;

import Multithreading.MyThread;

public class Task2Main {

	public static void main(String[] args) throws Exception {
		Thread t1 = new MyThread("Hello, world", 2000);

		t1.start();

		t1.join();

		System.out.println("My name is …");

	}

}
