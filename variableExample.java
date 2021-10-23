
public class variableExample {

	public static void main(String[] args) {
		
		/*
		 # 변수 (Variable)
		 
		  1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
		  2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라
		  적당한 데이터 타입을 선언해야 합니다.
		  ex) int: 4바이트의 정수, String: 문자열(문장)
		  3. 변수는 동일한 이름으로 중복 선언할 수 없습니다.
		  4. 변수 내부의 값은 언제든지 변경이 가능합니다.	  
		 */
		
		// 변수의 선언: [자료형(데이터 타입)] [변수명]
		int age;
		
		//변수의 초기화: [변수명] = [값];
		age = 31;
		
		//변수의 값 참조(사용)
		System.out.println(age);
		
		//변수는 선언과 초기화를 동시에 할 수 있습니다.
		//(처음 선언 시 1회만 가능)
		int score = 90;
//		int score = 95; (x)
		
		score = 95; // 변수의 값 변경시에는 데이터 타입을 쓰지 않습니다.
		
		System.out.println(score);

		//변수에는 다른 변수의 값도 저장이 가능합니다.
		int myScore = score - 20;
		
		System.out.println(myScore);
		
		//변수의 자료형에 맞지 않는 데이터는 저장이 불가능합니다.
//		int count = "한번"; (x)
//		int count = 23.5; (x)
//		String str = 100; (x)
		
		//변수는 자료형(데이터 타입)이 달라도 이름이 동일하다면
		//중복 선언할 수 없습니다.
	
		String name = "홍길동";
//		int name = 1004; (x)
		
		//선언 및 초기화하지 않은 변수는 사용이 불가능합니다.
//		int result = myScore + num; (x) num을 선언한 적이 없다.
		int result;
//		System.out.println(result); (x)
		
		
		
		
		
		
		;
		
		
		
		
	}

}
