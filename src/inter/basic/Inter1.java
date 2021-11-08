package inter.basic;

public interface Inter1 extends Inter {

	//인터페이스 내에 변수를 선언하면 자동으로 상수로 취급합니다.
	double PI = 3.14;
	
//	Inter1() {
//		
//	} 인터페이스는 생성자를 가질 수 없습니다.
	
	//인터페이스 내에 메서드를 선언하면 자동으로 추상 메서드가 됩니다.
	public void method1();
	
	public static void staticMethod() {
		System.out.println("가능해요~");
	}
	
	
	
}




