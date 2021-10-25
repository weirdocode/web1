
public class ContinueExample {

	public static void main(String[] args) {

		
		for(int i=1; i<=10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.print(i + " ");
		} 
		System.out.println("\n반복문 종료!");
		
	}

}
