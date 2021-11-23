package thread.quiz;

import java.util.Random;

public class VoteThread implements Runnable {

	/*
	 run() 메서드 안에는 랜덤값을 이용해서 개표 진행사항을 화면에 출력합니다.

	 멤버변수: int finish -> 최대 개표율
	 		int sum -> 개표율
	 		Random r -> 난수 생성용
	 		StringBuilder -> *찍기용

	 조건: 개표율은 100%가 최대값입니다.
	  문자는 StringBuilder를 이용하여 개표율만큼의 *을 출력했습니다.
	  개표율은 1 ~ 10까지의 난수를 생성해서 개표율에 적용했습니다.
	  개표가 한 번 일어날 때마다 스레드는 1초씩 일시정지됩니다.
	 */

	final int finish = 100; //개표끝
	int sum = 0; //개표율
	Random r = new Random();
	StringBuilder sb = new StringBuilder();

	@Override
	public void run() {
		
		while(true) {
			int num = r.nextInt(10) + 1;
			sum += num;
			
			if(finish > sum) { //개표가 덜 된 경우
				for(int i=1; i<=num; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName() + " 개표율: " + sum + "%: " + sb);
				System.out.println();
			} else { //개표율이 100보다 큰 경우
				sum = 100;
				sb.delete(0, sum);
				for(int i=1; i<=100; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName() + " 개표율: " + sum + "%: " + sb);
				break;
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} //end while(true)
		
		System.out.println("\n" + Thread.currentThread().getName() + "의 개표가 완료되었습니다.");

	}

}


















