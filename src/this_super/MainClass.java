package this_super;

public class MainClass {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		System.out.println("p1의 주소값: " + p1);
		p1.name = "플레이어1";
		p1.characterInfo();
		
		System.out.println("------------------------------");
		
		Player p2 = new Player("플레이어2");
		System.out.println("p2의 주소값: " + p2);
		p2.characterInfo();
		
		

	}

}













