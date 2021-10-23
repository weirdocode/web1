
public class PrintExample {

	public static void main(String[] args) {

		
		//자바의 표준 출력 형식은 크게 3가지입니다.
		//1. 개행을 포함하지 않는 print()
		//2. 자동으로 개행을 포함해 주는 println()

		System.out.print("안녕하세요~!");
		System.out.println("hello~!");
		System.out.print("안녕히 가세요 ㅠㅠ");
		System.out.println("bye bye~~");
		
		//3. 형식 지정 표준 출력 함수 printf()
		//서식 문자를 이용해서 문자열을 완성시킨 후,
		//서식 문자에 들어갈 값을 지정해서 출력하는 방식.
		
		/*
		 # 포매팅 서식 문자 종류
		 %d: 부호가 있는 정수 데이터 (decimal)
		 %f: 실수 데이터 (floation point)
		 %s: 문자열 (String)
		 */
		
		int month = 12;
		int day = 25;
		String anni = "크리스마스";
		
		//12월 25일은 크리스마스 입니다.
		System.out.println(month + "월 " + day + "일은 " + anni + " 입니다.");
		System.out.printf("%d월 %d일은 %s 입니다.", month, day, anni);
		
		
		
		
		
		
		
		
		
		
	}

}
