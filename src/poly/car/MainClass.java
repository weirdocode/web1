package poly.car;

public class MainClass {

	public static void main(String[] args) {
		
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Car s3 = new Sonata();

		Car b1 = new Benz();
		Benz b2 = new Benz();
		Benz b3 = new Benz();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Car t3 = new Tesla();
		Tesla t4 = new Tesla();
		
//		s1.run();s1.run();s3.run();b1.run();b2.run();b3.run();
//		t1.run();t2.run();t3.run();t4.run();

//		Sonata[] sonatas = {s1, s2, s3};
//		for(Sonata s : sonatas) {
//			s.run();
//		}
		
		Car[] cars = {s1, s2, s3, b1, b2, b3, t1, t2, t3, t4};
		for(Car c : cars) {
			c.run();
		}
		
		System.out.println("-----------------------");
		
		Driver kim = new Driver();
		kim.drive(b1);
		kim.drive(s1);
		kim.drive(t2);
		
		Tesla t5 = (Tesla) kim.buyCar("테슬라");
		t5.run();
		t5.enterMembership();
//		c.run();
//		Tesla t5 = (Tesla) c;
//		t5.enterMembership();
		
		System.out.println("-----------------------");
		
		s1.frontLeft = new Htire();
		s1.frontRight = new Ntire();
		s1.rearLeft = new Htire();
		s1.rearRight = new Ntire();
		
		CarShop shop = new CarShop();
		shop.carPrice(s1);
		shop.carPrice(new Benz());
		shop.carPrice(kim.buyCar("테슬라"));
		
	}

}
