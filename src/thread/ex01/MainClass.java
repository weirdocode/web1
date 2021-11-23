package thread.ex01;

public class MainClass {

	public static void main(String[] args) {
		
		//객체 2개, 스레드도 2개 (2개의 스레드가 각각 실행)
		
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		
		Thread thread1 = new Thread(t1, "쓰레드1");
		Thread thread2 = new Thread(t2, "쓰레드2");
		
		thread1.start();
		thread2.start();
		
		
		System.out.println("메인 쓰레드 종료!");

	}

}















