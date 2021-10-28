import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {

		/*
		 - 게임 인원은 2 ~ 4명 입니다.
		 - 실탄 개수는 6개 미만으로 설정하겠습니다.
		 - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
		  또한 총알의 위치도 랜덤으로 설정됩니다.
		 - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
		 ex)  [false, false, false, true, false, false]
		 - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
		  랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
		  원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임 인원(2~4) --> ");
		int playerNum = sc.nextInt();
		
		if(playerNum < 2 || playerNum > 4) {
			System.out.println("게임 인원이 올바르지 않습니다. 게임을 종료합니다.");
			return;  //main 함수 종료.
		}
		
		System.out.println("\n플레이어의 이름을 등록합니다.");
		String[] players = new String[playerNum];
		for(int i=0; i<players.length; i++) {
			System.out.printf("%d번 플레이어 이름: ", i+1);
			players[i] = sc.next();
		}
		
		System.out.println(Arrays.toString(players) + " 참가!");
		
		System.out.print("\n실탄 개수 (6미만): ");
		int bullet = sc.nextInt();
		
		if(bullet < 1 || bullet > 5) {
			System.out.println("실탄 수가 올바르지 않습니다. 게임을 종료합니다.");
			return;
		}
		
		System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");
		boolean[] bulletPos = new boolean[6];
		int checkCount = 0; //실탄을 정확하게 장전한 횟수.
		while(checkCount < bullet) {
			int position = (int) (Math.random()*bulletPos.length);
			if(bulletPos[position] == true) {
				continue;
			} else {
				bulletPos[position] = true;
				checkCount++;
			}	
		} //총알 배치 끝.
		
		//실행 순서 정하기
		int startIdx = (int) (Math.random()*playerNum);
		System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n"
				, players[startIdx]);
		
		//일부러 입력 대기를 해서 흐름을 잠시 끊어줍니다.
		//이 입력값은 받아서 활용할 것이 아니기 때문에 변수를 선언하지 않습니다.
		sc.nextLine();
		
		while(true) {
			
			//최후의 1인이 남을 때 까지 게임을 진행해 주세요.
			//또는 총알을 다 소비할 때 까지 게임을 진행해 주세요.
			//총알을 소모하면 true값을 false로 변경해 주세요.
			//사람이 한명 아웃되면 배열의 크기를 줄여 주세요.
			
		}
		
	


	}

}














