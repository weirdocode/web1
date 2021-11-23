package thread.ex03_syncro;

public class MainClass {

	public static void main(String[] args) {

		ThreadTest t1 = new ThreadTest();

		Thread thread1 = new Thread(t1, "쓰레드1");
		Thread thread2 = new Thread(t1, "쓰레드2");

		thread1.start();
		thread2.start();

		System.out.println("메인 종료~");


	}

}


