import java.util.Scanner;

public class WhileQuiz2 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		int i = 1; //begin
		int total = 0; //누적합을 담을 변수
		
		while (i <= num) {
			if(num %i == 0) {
				total += 1;
			}
		i++;
		
	}
	System.out.println(num + "의 약수의 총합: " + total);
	sc.close();
	}
}
