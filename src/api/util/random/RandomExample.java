package api.util.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//실수 난수: 0.0 <= ~ < 1.0
		double d = r.nextDouble();
		System.out.println(d);
		
		//정수 난수: nextInt();
		int i = r.nextInt(); //int의 전체 범위
		System.out.println(i);
		
		//0 ~ 5까지의 정수 난수 생성
		int j = r.nextInt(6);
		System.out.println(j);
		
		//10 100까지의 정수 난수 생성.
		int k = r.nextInt(91) + 10;
		System.out.println(k);
		
		boolean flag = r.nextBoolean();
		System.out.println(flag);

	}

}
