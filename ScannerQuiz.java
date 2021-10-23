import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {

		/*
		 - 스캐너를 사용하여 이름과 나이를 입력을 받아서
		 
		 이름: xxx
		 나이: xx세
		 출생년도: xxxx년
		 
		 을 출력하세요. (출력 함수는 마음대로 사용해서 출력하시고
		 출생년도는 입력사항이 아닙니다.)
		 
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
				
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		int birthYear = 2021 - age;
		
		System.out.println("-------------");
		System.out.println("이름: " + name );
		System.out.println("나이: " + age + "세");
		System.out.printf("출생년도: %d년\n", birthYear);
		System.out.println("-------------");
		
	//	System.out.printf("이름: %s\n나이: %d세\n출생년도: %d년", name, age, birthYear);
		
		
		sc.close();
		
		
	}

}
