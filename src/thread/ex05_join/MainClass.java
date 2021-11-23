package thread.ex05_join;

public class MainClass {

	public static void main(String[] args) {
		
		TestA a = new TestA();
		Thread t = new Thread(a);
		
		t.start();
		
		try {
			/*
			 join() 메서드는 해당 스레드가 종료될 때 까지 다른 스레드를 정지시킵니다.
			 다른 스레드가 종료될 때 까지 기다리다가 실행해야 하는 경우 사용.
			 ex) B라는 스레드가 계산을 마치고 그 결과값으로 A스레드가 로직을 처리할 때 등등
			 */
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("계산 결과: " + a.getSum());

	}

}















