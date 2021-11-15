package anonymous.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.turnOn();
		tv.turnOff();
		tv.volumeUp();
		tv.volumeDown();
		
		/////////////////////////////////////////////////
		
		Radio radio = new Radio();
		radio.getRemote().turnOn();
		radio.getRemote().turnOff();
		radio.getRemote().volumeUp();
		radio.getRemote().volumeDown();

	}

}
