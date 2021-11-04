package poly.car;

public class CarShop {
	
	public void carPrice(Car c) {
		if(c instanceof Sonata) {
			System.out.println("소나타의 가격은 2500만원 입니다");
		} else if (c instanceof Benz) {
			System.out.println("벤츠의 가격은 5000만원 입니다");
		} else {
			System.out.println("테슬라의 가격은 7500만원 입니다");
		}
		
	}
	
	

}
