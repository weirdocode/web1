package inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		//인터페이스는 객체를 생성할 수 없는 추상적인 개념입니다.
//		Inter1 i1 = new Inter1(); (x)
		
		System.out.println("원주율: " + Inter1.PI);
		Inter1.staticMethod();
		
		ImplClass1 i1 = new ImplClass1();
		i1.method1();
		i1.method2();
		i1.method3();
		
		/*
		 - 다형성은 상속이 전제되어야 하는 것이 원칙이지만
		 예외로 인터페이스와 클래스간의 구현 관계에서도
		 다형성 발생을 허용합니다.
		 인터페이스 변수 = new 객체();
		 */
		
		Inter1 it1 = new ImplClass1();
		it1.method1();
		it1.method3();
		
		//연산자의 우선 순위
		//괄호() -> 참조(.) -> 단항 -> 2항 -> 3항 -> 대입
		((ImplClass1)it1).method2();
		
		/*
		 - 인터페이스의 다형성도 앞에서 배운 클래스의 다형성처럼
		  정보가 없다면 메서드 호출이 불가능하기 때문에 형 변환이 필요합니다.
		  
		 - 구현하는 클래스가 서로 다른 인터페이스들을 동시에 구현하고 있다면
		  구현하는 인터페이스들끼리 서로 즉시 형변환이 가능합니다.
		 */
		
		((Inter2)it1).method2();
		
		Inter2 it2 = new ImplClass1();
		it2.method2();
		it2.method3();
		((Inter1) it2).method1();
		
		Inter1 it3 = new ImplClass2();
		Inter2 it4 = new ImplClass3();
		
		Inter[] inters = {it1,it2,it3,it4};
		

	}

}
















