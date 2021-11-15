package anonymous.basic2;

public class Tv implements RemoteController {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Tv을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다");
	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("Tv의 볼륨: " + volume);
	}

	@Override
	public void volumeDown() {
		volume--;
		System.out.println("Tv의 볼륨: " + volume);
	}
	
	
	

}



















