package poly.quiz;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart cart = new MyCart(2000);
		
		Tv tv = new Tv();
		Radio radio = new Radio();
		Computer com = new Computer();
		
		cart.buy(tv);
		cart.buy(radio);
		cart.buy(com);
		
	}

}
