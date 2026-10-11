package algo.threadsjava;

/**
 * MyThread
 * 
 */
public class MyRunner implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("Thread running..." + i);
		}
		System.out.println("Thread running...");
	}
}