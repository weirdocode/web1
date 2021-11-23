package thread.ex01;

public class ThreadTest implements Runnable {

	int num = 0;
	
	@Override
	public void run() {
		
		System.out.println("쓰레드 시작!");
		
		for(int i=1; i<=10; i++) {
			
			if(Thread.currentThread().getName().equals("쓰레드1")) {
				System.out.println("----------------------");
				num++;
			}
			System.out.println("현재 쓰레드: " + Thread.currentThread().getName());
			System.out.println("num: " + num);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}


















