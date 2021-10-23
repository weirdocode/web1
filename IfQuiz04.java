import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		System.out.print("정수3: ");
		int num3 = sc.nextInt();
		
		int max, mid, min;
		
		if (num1 > num2 && num1 > num3) { //num1이 제일 큰 값.
			max = num1;
			if (num2 > num3) {
				mid = num2;
				min = num3;
				System.out.println("가장 큰 값: " + num1);
				System.out.println("중간 값: " + num2);
				System.out.println("가장 작은 값: " + num3);
				
			} else {
				mid = num3;
				min = num2;
				System.out.println("가장 큰 값: " + num1);
				System.out.println("중간 값: " + num3);
				System.out.println("가장 작은 값: " + num2);
			}
		} else if (num2 > num1 && num2 > num3) { //num2이 제일 큰 값.
			max = num2;
			if (num1 > num3) {
				mid = num1;
				min = num3;
				System.out.println("가장 큰 값: " + num2);
				System.out.println("중간 값: " + num1);
				System.out.println("가장 작은 값: " + num3);
				
				
			} else {
				mid = num3;
				min = num1;
				System.out.println("가장 큰 값: " + num2);
				System.out.println("중간 값: " + num3);
				System.out.println("가장 작은 값: " + num1);
				
			}
		}else {
			max = num3;
			if(num1 > num2) {
				mid = num1;
				min = num2;
				System.out.println("가장 큰 값: " + num3);
				System.out.println("중간 값: " + num1);
				System.out.println("가장 작은 값: " + num2);
			
			}else {
				mid = num2;
				min = num1;
				System.out.println("가장 큰 값: " + num1);
				System.out.println("중간 값: " + num2);
				System.out.println("가장 작은 값: " + num3);
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		/*
		 - 정수 3개를 입력 받습니다.
		 - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
		 
		 # max, mid, min이라는 변수를 미리 선언하셔서
		 판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
		 마지막에 한번에 출력하면 되겠습니다.
		 */
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		System.out.println("정수3: ");
		int num3 = sc.nextInt();
		
		int max;
		int mid;
		int min;
		
		
		if (num1 > num2 && num2 > num3) {
		max = num1;
		mid = num2;
		min = num3;
		System.out.println("-----------");
		System.out.printf("가장 큰 값 : %d\n", max);
		System.out.printf("중간 값 : %d\n", mid);
		System.out.printf("가장 작은 값 : %d\n", min);
		System.out.println("-----------");
		
		
		} else if(num2 > num3 && num3 > num1) {
			max = num2
			mid = num3
			min = num1
			
			System.out.println("-----------");
			System.out.printf("가장 큰 값 : %d\n", max);
			System.out.printf("중간 값 : %d\n", mid);
			System.out.printf("가장 작은 값 : %d\n", min);
			System.out.println("-----------");
			
			
			
		} else (num3 > )
		
		sc.close();
		*/
		
		
		
		
		
		
	}

}
