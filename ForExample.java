import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
/*
		int i = 1;
		int total = 0;
		while(i<=10) {
			
			total += i;
			
			i++;
		}
		*/
		/*
		int total = 0;
		for(int i=1; i<=10; i++) {
			total += i;
		}*/
		// 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를
		// 가로로 출력해 보세요. (for)
		/*
		for(int i = 1; i<=200; i++) {
			if (i % 6 == 0 && i % 12 != 0) {
				System.out.print(i +" ");
			}
		}
		
		System.out.println();
		
		int cnt = 0;
		for(int i = 1; i <= 60000; i++) {
			if(i % 177 == 0) {
				cnt++;
			}
		}
		System.out.println("1~60000까지의 정수 중 177의 배수는: " + cnt + "개");
		
		System.out.println();
		*/
		
		// 입력받은 정수까지의 팩토리얼값을 구하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int num = sc.nextInt();
		int fac = 1; //팩토리얼 최종 결과를 담을 변수.
		for (int i=1; i<=num; i++) {
			fac *= i;
		}
		System.out.printf("%d!: %d\n", num, fac);
		
		sc.close();
		
		
		
	}

}
