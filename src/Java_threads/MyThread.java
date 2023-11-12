package Java_threads;

/**
 * MyThread
 * 
 */
public class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 20; i++) {
			System.out.println("Thread running..." + i);
		}
		System.out.println("Thread running...");
	}
}