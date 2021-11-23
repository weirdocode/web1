package thread.ex05_join;

public class TestA implements Runnable {

	private int sum;
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum += i;
			System.out.println("A의 누적합: " + sum);
		}
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public int getSum() {
		return sum;
	}
	
	
	
}














