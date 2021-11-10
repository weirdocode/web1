package exception.quiz;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		try {
		System.out.println("메서드의 실행 결과: " + c.input());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
