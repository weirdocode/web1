import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {

		
		/*
		 - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		 다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		 연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1: ");
		int num1 = sc.nextInt();
		System.out.println("희망 연산를 선택하세요[+,-,*,/]");
		String ee = sc.next();
		System.out.println("정수2: ");
		int num2 = sc.nextInt();
		
		int result;
		
		
		switch(ee) {
			case "+": 
				result = num1 + num2;
				System.out.println(result);
				break;
				
			case "-":
				result = num1 - num2;
				System.out.println(result);
				break;
			
			case "*":
				result = num1 * num2;
				System.out.println(result);
				break;
			
			case "/":
				result = num1 / num2;
				System.out.println(result);
				break;
			
			default :
				System.out.println("잘 못 된 연산자 입니다.");
				break;
				
				
				
		}
		
		
	}

}
