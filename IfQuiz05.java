import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		
		/*
		 #국어, 영어, 수학 점수를 각각 입력받아서
		 평균을 구해보세요. (평균은 소수점 첫째 자리까지 출력)
		 평균이 90점이 넘는다면, 다시 한 번 조건을 검사해서
		 95 ~100 -> a+
		 94 ~ 90 -> A0
		 80점대는 b, 70점대는 c, 60점대는 d, 나머지는
		 모두 f 처리하시면 됩니다. (100점이 만점)
		 
		 ex)
		 평균 점수 : 95.5
		 당신의 학점은 a+입니다.
		
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		System.out.printf("평균 점수: %.1f\n", avg);
		
		if(avg > 90) {
			if (avg > 100) {
				System.out.print("잘못 입력하였습니다");
			}else if (avg >= 95) { 
				System.out.println("당신의 학점은 A+입니다");
			}else {
				System.out.println("당신의 학점은 A입니다");
			}
			
		} else if (avg > 80) {
			System.out.println("당신의 학점은 B입니다");
		} else if (avg > 70) {
			System.out.println("당신의 학점은 C입니다");
		}else if (avg > 60) {
			System.out.println("당신의 학점은 D입니다");
		}else {
			System.out.println("당신의 학점은 F입니다");
			
		}
		
		sc.close();
		
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수: ");
		int kor = sc.nextInt();
		System.out.print("영어점수: ");
		int eng = sc.nextInt();
		System.out.print("수학점수: ");
		int math = sc.nextInt();
		
		double ss = (kor + eng + math)/3;
		
		if (ss >= 90) {
			if(ss >= 95) {
				System.out.printf("평균 점수: %.1f", ss);
				System.out.print();
				
			
			
		
				
			} 
				
			
		}
		
		
		*/
		
		
		
		
		
		
	}

}
