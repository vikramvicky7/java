package threads;

public class ThreadA extends Thread {

	@Override
	public void run() {

		System.out.println("Entering the Thread");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(999);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("ThreadA=" + i);
		}
		System.out.println("Exiting ThreadA");
	}

}
