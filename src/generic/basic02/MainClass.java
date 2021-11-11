package generic.basic02;

public class MainClass {

	public static void main(String[] args) {
		
		Basic<Integer, String> b = new Basic<>();
		b.put(1, "홍길동");
		String name = b.get(1);
		System.out.println(name);
		

	}

}
