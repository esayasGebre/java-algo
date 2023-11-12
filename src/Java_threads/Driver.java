package Java_threads;

/**
 * JavaThread
 * 
 */
public class Driver {

	public static void main(String[] args) throws InterruptedException {

		MyThread t1 = new MyThread();

		// Causes this thread to begin execution; the Java Virtual Machinecalls the run
		// method of this thread.
		t1.start();

		// Waits for this thread to die.
		t1.join();

		MyThread t2 = new MyThread();
		t2.start();
		
		System.out.println("With Runnable.");
		MyRunner myRunnable = new MyRunner();
		Thread t3 = new Thread(myRunnable);
		t3.start();
		t3.join();
		
		Thread t4 = new Thread(myRunnable);
		t4.start();
	}

}
