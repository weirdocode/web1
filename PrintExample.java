
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
		//printf 함수도 줄 개행 기능이 없습니다.
		
		
		
		/*
		 # 포매팅 서식 문자 종류
		 %d: 부호가 있는 정수 데이터 (decimal)
		 %f: 실수 데이터 (floation point)
		 %s: 문자열 (String)
		 
		 # 탈출 코드 (escape code)
		 - 문자열 내에서 특정 명령을 내리고 싶을 때 사용하는 특수 기호입니다.
		 - 어떤 출력 함수에서도 사용이 가능합니다.
		 - 반드시 따옴표 내에 위치시켜야 합니다.
		 \n: 줄 바꿈 명평 (enter)
		 \t: 탭 정렬 (4칸 들여쓰기)
		 
		 
		 
		 */
		
		int month = 12;
		int day = 25;
		String anni = "크리스마스";
		
		//12월 25일은 크리스마스 입니다.
		System.out.println(month + "월 " + day + "일은 " + anni + " 입니다.");
		System.out.printf("%d월 %d일은 %s 입니다.\n\n", month, day, anni);
		System.out.printf("지금 시간은 %d시 %d분 입니다.\t\t\t %s요일입니다.\n\n", 9, 46, "목");
		
		/*
		 - %f는 기본적으로 소수점 6자리까지 표현하도록 설계되어 있습니다.
		 - 만약 자리수를 조정하려면 %.[자리수에 해당하는 숫자]f를 사용합니다.
		 - "%" 특수문자를 표현하려면 %%를 씁니다.
		 */
		
		double rate = 63.456;
		System.out.printf("시험 합격율: %.2f%%", rate);
		
		
		
		
		
		
	}

}
