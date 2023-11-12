package Java_threads;

/**
 * JavaThread
 * 
 */
public class JavaThread {

	public static void main(String[] args) throws InterruptedException {

		MyThread t1 = new MyThread();

		// Causes this thread to begin execution; the Java Virtual Machinecalls the run
		// method of this thread.
		t1.start();

		// Waits for this thread to die.
		t1.join();

		MyThread t2 = new MyThread();
		t2.start();

	}

}
