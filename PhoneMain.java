
public class PhoneMain {

	public static void main(String[] args) {
		
		Phone basic = new Phone();

		basic.showSpec();
		
		System.out.println("-------------------");
		
		Phone galaxyS21 = new Phone("갤럭시s21");
		galaxyS21.showSpec();
		
		System.out.println("-------------------");
		
		Phone iPhone13 = new Phone("아이폰13", "시에라 블루");
		iPhone13.showSpec();
		
	}

}
