import java.util.Arrays;

public class MethodQuiz01 {
	
	
	//1.
	static void method1() {
		System.out.println("안녕");
	}
	
	//2.
	static String method2(String str) {
		return str;
	}
	//3.
	static double method3(int n1, int n2, double d) {
		return (double)n1 + (double)n2 + d;
	}
	//4.
	static String method4(int i) {
		if (i % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	//5.
	static void method5(String s, int i) {
		for(int j=1; j<=i; j++) {
			System.out.println(s);
		}
	}
	//6.
	static int maxNum(int i, int j){
//		if(i > j) {
//			return i;
//		} else {
//			return j;
//		}
		return i > j ? i : j;
	}
	//7.
	static int abs(int i) {
		return i > 0 ? i : -i;
	}
	//8.
	static int method6(int i) {
		int total = 0;
		for(int j=0; j<=i; j++) {
			total += j;
		}
		return total;
	}
	//9.
	static int method7(int[] arr) {
		return arr.length;
	}
	//10.
	static String[] method8(String s1, String s2) {
		return new String[] {s1, s2};
	}
	
	public static void main(String[] args) {
		
		//1.
		method1();

		//2.
		System.out.println(method2("안녕하세요"));

		//3.
		System.out.println(method3(3, 4, 3.14));
		
		//4.
		System.out.println(method4(30));
		
		//5.
		method5("메롱메롱", 3);
		
		//6.
		System.out.println(maxNum(43, 96));
		
		//7.
		System.out.println(abs(-43));

		//8.
		System.out.println(method6(100));
		
		//9.
		System.out.println("배열의 길이: " + method7(new int[] {1, 2, 3, 4, 5}));
	
		//10.
		System.out.println(Arrays.toString(method8("자바", "java")));
	}

}
