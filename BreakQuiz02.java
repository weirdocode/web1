import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BreakQuiz02 {

	public static void main(String[] args) {

		/*
		 # Up&Down 게임을 제작합니다.
		 1. 기준이 되는 수는 난수 범위 1~100까지로 지정해 주세요.
		 2. 사용자에게 정답을 입력받아서, 기준이 되는 수보다
		 작은 수를 입력하면 Up, 큰 수를 입력하면 Down이라고 출력해서
		 정답에 근접할 수 있도록 유도해 주세요
		 3. 승리 조건 횟수는 7회로 제한하겠습니다.
		 7회가 넘어가도 정답은 계속 맞출 수 있도록 작성해 주세요.
		 정답을 맞췄다면, 반복문 종료와 함께 승리/패배 여부를 알려주세요.
		 */
		/*
		Scanner sc = new Scanner(System.in);
		int rn = (int) ((Math.random()*100)+1);
		System.out.println("술자리 게임 up&down");
		System.out.println("숫자를 추측해 보세요");
		System.out.println(">");
		int answer = sc.nextInt();
		int count = 0;
		
		while(true) {
			if(rn > answer) {
				System.out.println("UP!!");
				System.out.printf("기회는 %d - %d 남았습니다\n", 7, count);
				count++;
			}else if (rn < answer) {
				System.out.println("DOWN!!");
				System.out.printf("기회는 %d - %d 남았습니다", 7, count);
				
				count++;
			}else if (rn == answer){
				System.out.println("정답입니다!!");
				if (count > 7) {
					System.out.println("7회를 모두 사용하였습니다 실패입니다");
				} else {
					System.out.println("7회 안에 맞추셨습니다 성공입니다");
				}
				break;
				
				
			}
			
			
			
		}*/
		
		System.out.println("*** up&down 게임 ***");
		System.out.println("# 1부터 100까지 정수 중 어느 숫자가 선택되었을까요~");
		Scanner sc = new Scanner(System.in);
		int secret = (int) ((Math.random()*100) + 1);
		int count = 0;
		
		//0.0 < t <1.0
		
		while(true) {
			System.out.print("> ");
			int answer = sc.nextInt();
			if(answer > 100 || answer <1) {
				System.out.println("똑바로 입력 안해?");
				break;
			}
			count++;
			if (answer > secret) {
				System.out.println("DOWN!!!");
			}else if(answer < secret) {
				System.out.println("UP!!!");
			}else {
				System.out.println("정답입니다!");
				break;
			}
	
			if(count < 7) {
				System.out.println("정답 기회 " + (7 - count)+ "번 남았습니다");
				
			}else {
				System.out.println("정답 기회 모두 소진!");
				System.out.println("정답을 맞춰야 나갈 수 있습니다.");
				
			}
			
		}
		
		
		System.out.println(count + "번 만에 맞추셨네요~");
		if(count <= 7) {
			System.out.println("승리했습니다!!!");
			
		}else {
			System.out.println("패배했습니다");
		}
		
		
		
		sc.close();
		
	}

}
