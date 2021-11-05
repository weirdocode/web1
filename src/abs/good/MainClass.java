package abs.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 1. 추상클래스(추상메서드)를 사용하면 오버라이딩이 강제되기 때문에
		 프로그래머의 오버라이딩 실수를 줄일 수 있고, 부모 클래스에서
		 메서드를 선언할 때 메서드 내부에 어떤 내용을 써야 할 지 막연할 때도
		 구현하기가 편합니다.
		 
		 2. 다형성을 적용시켰을 경우에도 안전하게 사용이 가능합니다.
		 
		 3. 상속관계에 있는 자식 메서드들의 이름을 통일하기가 편합니다.
		 
		 */
		
		//추상클래스는 스스로의 객체를 생성할 수 없습니다.
//		HeadStore h = new HeadStore();
		
		HeadStore s = new SeoulStore();
		s.orderApple();
		s.orderBanana();
		s.orderGrape();
		s.orderWaterMelon();
		
	}

}
