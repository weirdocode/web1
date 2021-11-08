package inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Printer p = new Samsung();
		
		p.turnOn();
		p.print("안녕하세요~");
		p.colorPrint("가나다라", "초록");
		p.copy(10);
		p.turnOff();
		
		System.out.println("-------------------------------");
		
		p = new LG();
		p.turnOn();
		p.print("메롱메롱~");
		p.colorPrint("abcd", "빨강");
		p.copy(3);
		p.turnOff();
		

	}

}


















