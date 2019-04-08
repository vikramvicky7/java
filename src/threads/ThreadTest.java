package threads;

public class ThreadTest {

	public static void main(String[] args) {

		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ThreadC tc = new ThreadC();

		ta.start();
		tb.start();
		Thread t1 = new Thread(tc);
		t1.start();

		Runnable r = () -> {
			System.out.println("Entering into the ThreadLambda");
			for (int i = 0; i < 10; i++) {
				System.out.println("ThreadLambda=" + i);
			}
			System.out.println("Exiting  the ThreadLambda");
		};

	}

}
