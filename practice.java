
public class practice {

	public static void main(String[] args) {

		
		int n = (int) ((Math.random()*355)+42);
		String result = (n % 2 == 0 ? "짝수 입니다." : "홀수 입니다" );
		System.out.println(n + "은(는)" + result);
		
		
		
	}

}
