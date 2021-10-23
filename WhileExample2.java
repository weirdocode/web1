
public class WhileExample2 {

	public static void main(String[] args) {

		// 48~ 150 사이의 정수 증 8의  배수만 가로로 출력해 보세요.
		// (48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 되겠죠?)
		
//		int i = 48;
//		
//		while (i <= 150) {
//			System.out.print((i % 8 == 0 ? i+" " : " "));
//			i++;
			
		
	/*	int n = 48;
		while(n<= 150) {
			if (n % 8 == 0) {
				System.out.print(n + " ");
			}
			n++;
			
		*/
		
		//1 ~ 100까지의 정수 중 4의 배수이면서
		// 8의 배수는 아닌 수를 가로로 출력해 보세요.
		
//		int n = 1;
//			while(n<=100) {
//				System.out.print((n % 4 == 0 && n % 8 != 0 ? n + " " : " " ));
//				
//				
//				n++;
//		}
		

		//1~30000 까지의 정수 중 258의 배수의 개수를 출력
		
/*		int num1 = 1;
		int count = 0;
		while(num1 <= 30000) {
			if (num1 % 258 == 0) {
				count++;
			}
			num1++;
		}
		System.out.println("258의 배수의 갯수는:" + count);
		
*/		

		//1000의 약수의 개수를 구하세요.
		//1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
		//그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		int i = 1;
		int count = 0;
		
		while(i<=1000) {
			if(1000 % i == 0) {
				count++;
			}
			i++;
		}
		System.out.println("1000의 약수의 개수는 " + count + "개 입니다.");
		
		
		
	}

}
