package anonymous.basic;

interface Car {
	public void run(); // 추상메서드
}

class Sonata implements Car{

	@Override
	public void run() {
		System.out.println("소나타가 달립니다~");
	}
	
}


public class Garage {
	
//	public Car car = new Sonata(); 일반적인 인터페이스 구현 객체 사용법.
	
	public Car car = new Car() {
		public void run() {
			System.out.println("익명객체가 달립니다~");
		}
	};
	
	public Garage() {
		car.run();
	}
	
	
	
	
	

}






















