package anonymous.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Car s1 = new Sonata();
		s1.run();
		
		Car s2 = new Sonata();
		s2.run();
		
//		Garage g = new Garage();
		
		Car tesla = new Car() {

			public void run() {
				System.out.println("테슬라가 달립니다.");
			}
			
		};
		
		tesla.run();
		
		new Car() {

			public void run() {
				System.out.println("포르쉐는 쌩쌩 달립니다~");
			}
			
		}.run();

	}

}

















