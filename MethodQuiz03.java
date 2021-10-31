import java.util.Scanner;

public class MethodQuiz03 {

	/*static int calcGCD(int x, int y) {
		int GCD = 0;
		while (true) {
			if(x > y) {
				if(x % y !=0) {
					x = y;
					y = x % y;
				} else {
					GCD = y;
					break;
				}
				
			else if (x < y) {
				if (y % x !=0) {
					y = x;
					x = y % x;
				} else {
					GCD = x;
					break;
			}
		}
			return GCD;
	}
		}
		*/
	static int calcGCD(int n1, int n2) {
		
		// 제가 작성하는 로직은 무조건 n1이 크다고 가정했기 때문에
		// n2가 만약 더 크다면 값을 서로 바꿔주는 if문입니다.
		if(n1 < n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
//		while(n2 > 0) {
//			int temp = n1;
//			n1 = n2;
//			n2 = temp % n2;
//		}
//		return n1;
		
		while (n1 % n2 != 0) {
			int temp = n1 % n2;
			n1 = n2;
			n2 = temp;
		}
		return n2;
	}
	
	
	
	
	public static void main(String[] args) {

		/*
		 - 정수 2개를 입력받아서 두 숫자의 최대 공약수를 구해주는 메서드
		 calcGCD()를 선언하세요.
		 - 최대공약수: 두 숫자의 공통된 약수 중 가장 큰 약수
		 ex) 12, 18의 최대공약수 -> 6
		 
		 #임의의 두 자연수 a, b가 주워졌을 때, 둘 중 큰 값이 a라고 가정.
		 a를 b로 나눈 나머지를 n이라고 했을 때 (a % b -> n)
		 n이 0이 된다면 b가 최대 공약수 입니다.
		 
		 # 만약 n이 0이 아니라면 (안 나누어 떨어졌다면)
		 a의 자리에 b값을 다시 넣고
		 b의 자리에 n의 값을 대입한 후에 위의 행동을 반복.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		System.out.println("정수2: ");
		int num2 = sc.nextInt();
		
		System.out.printf("%d와 %d의 최대공약수는 %d\n", num1, num2, calcGCD(num1, num2));
		
	}

}
