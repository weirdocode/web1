package anonymous.basic2;

import java.rmi.Remote;

public class Radio {
	
	private int sound;
	private RemoteController remote;
	

	public Radio() {
		remote = new RemoteController() {

			@Override
			public void turnOn() {
				System.out.println("라디오를 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("라디오를 끕니다");

			}

			@Override
			public void volumeUp() {
				sound++;
				System.out.println("라디오 볼륨을 올립니다.");

			}

			@Override
			public void volumeDown() {
				sound--;
				System.out.println("라디오를 볼륨을 내립니다.");

			}
		
		
		
		
		
		
		};
	}

	
	public RemoteController getRemote() {
		return remote;
	}
	
	public void setRemote(RemoteController remote) {
		this.remote = remote;
	}
	
}






















