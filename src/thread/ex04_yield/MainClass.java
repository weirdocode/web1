package thread.ex04_yield;

public class MainClass {

	public static void main(String[] args) {
		
		TestA a = new TestA();
		TestB b = new TestB();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		
		t1.start();
		t2.start();
		
		/*
		 Thread.yield()는 스레드를 일시 정지 상태로 만들거나,
		 정지된 스레드를 다시 실행시키거나 하는 행위, 즉 실행중인
		 스레드의 상태를 변경하는 것을 스레드 상태 제어라고 하는데,
		 그 중 yield는 일시 정지를 구현할 수 있다.
		 */
		
		
		try {
			Thread.sleep(3000);
			a.work = false;
			
			Thread.sleep(3000);
			a.work = true;
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}













