package thread.ex04_yield;

public class TestA implements Runnable {

	public boolean work = true;
	
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println("A쓰레드 실행 중!");
			} else {
				Thread.yield(); //실행 양보
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}












