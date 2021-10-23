import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 # 사용자에게 구구단 단수를 입력받아서
		 해당 단수의 구구단을 출력해 보세요.
		 ex)
		 *** 구구단 4단 ***
		 4 x 1 = 4
		 4 x 2 = 8
		 .
		 .
		 .
		 .
		 4 x 9 = 36
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단을 입력하세요: ");
		int i = sc.nextInt();
		int j = 1;
		
		while(j <= 9) {
			System.out.printf("%d x %d = %d\n", i, j, i * j);
			j++;
		}
		sc.close();
		
	}

}
