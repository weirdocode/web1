package poly.car;

public class Driver {
	
	public void drive(Car c) {
		System.out.println("운전을 시작합니다.");
		c.run();
	}
	
	public Car buyCar(String name) {
		if(name.equals("소나타")) {
			System.out.println("소나타를 구입합니다");
			return new Sonata();
		} else if(name.equals("벤츠")) {
			System.out.println("벤츠를 구입합니다");
			return new Benz();
		} else if(name.equals("테슬라")) {
			System.out.println("테슬라를 구입합니다");
			return new Tesla();
		} else {
			return null;
		}
	}
	
	
	
//	public void drive(Benz b) {
//		System.out.println("운전을 시작합니다.");
//		b.run();
//	}
//
//	public void drive(Tesla t) {
//		System.out.println("운전을 시작합니다.");
//		t.run();
//	}
}













