import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {

		
		/*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		 인지를 판별하시면 됩니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num =sc.nextInt();
		/*
		int num2 = 1;
		int cnt = 0;
		while(num >= num2) {
			if(num % num2 == 0) {
				cnt++;
			}
			
			num2++;
		} 
		if(cnt == 2 ) {
			System.out.print("소수 입니다.");
			
		}else {
			System.out.print("소수가 아닙니다.");
		}
		
		sc.close();
		*/
		
		System.out.println("--------------");
		int j = 2; //은 모든 수의 약수이기 때문에 배제합니다.
		
		while(num % j != 0) {
			j++;
		} if(num == j) {
			System.out.println("소수입니다");
		} else {
			System.out.println("소수가 아닙니다");
		}
		

		sc.close();
		
		
		
		
	}

}
