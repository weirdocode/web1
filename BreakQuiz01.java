import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

		/*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		 지속적으로 문제를 출제한 후 정답을 입력받으세요.
		 사용자가 0을 입력하면 반복문을 탈출시키세요.
		 
		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요
		 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int correct = 0;
		int wrong = 0;
		System.out.println("***덧셈 퀴즈***");
		System.out.println("프로그램을 종료하고 싶으시면 0을 입력하세요");
		
		while (true) {
			int num1 = (int) (Math.random()*100)+1 ;
			int num2 = (int) (Math.random()*100)+1 ;
			int num3 = (int) (Math.random()*2);
			int answer;
			if (num3 == 0) {
				System.out.printf("%d + %d = ??\n", num1, num2);
				answer = num1 + num2;
			}else {
				System.out.printf("%d - %d = ??\n", num1, num2);
				answer = num1 - num2;
			}
			System.out.print("> ");
			int i = sc.nextInt();
			
			if (answer == i ) {
				System.out.println("정답입니다!");
				correct++;
			}else if(i == 0) {
				
				break;
			}else {
				System.out.println("오답입니다");
				wrong++;
			}
		}
		System.out.println("***풀이결과***");
		System.out.println("정답: " + correct);
		System.out.println("오답: " + wrong);
		sc.close();
	}

}
