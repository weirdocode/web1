package inter.basic2;

public class LG implements Printer {

	@Override
	public void turnOn() {
		System.out.println("Life's Good");
		System.out.println("전원이 켜집니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Life's Good");
		System.out.println("전원이 꺼집니다.");
	}

	@Override
	public void print(String document) {
		System.out.println("Life's Good");
		System.out.println("문서 내용: " + document);
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println("Life's Good");
		System.out.println("색상: " + color);
		System.out.println("문서 내용: " + document);
	}

	@Override
	public int copy(int n) {
		System.out.println("Life's Good");
		System.out.println(n + "장 복사를 시작합니다.");
		return n;
	}

}





