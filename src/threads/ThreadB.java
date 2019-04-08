package threads;

public class ThreadB extends Thread {

	@Override
	public void run() {

		System.out.println("Entering the Thread");
		for (int i = 0; i < 10; i++) {

			System.out.println("ThreadB=" + i);
		}
		System.out.println("Exiting ThreadB");
	}

}
