package static_.quiz;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("원주율: " + Calculator.pi);
		
		System.out.println("원의 둘레: " + Calculator.circle(3));
		
		System.out.println("------------------------------");
		
		String[] sArr = {"홍길동", "이순신", "김길동"};
		int[] iArr = {1,2,3,4,5};
		char[] cArr = {'가', '나'};
		
//		ArrayPrint ap = new ArrayPrint();
		
		ArrayPrint.printArray(sArr);
		ArrayPrint.printArray(iArr);
		ArrayPrint.printArray(cArr);
		
		
		
		
		
		
		

	}

}
