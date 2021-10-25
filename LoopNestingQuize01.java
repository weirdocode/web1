
public class LoopNestingQuize01 {

	public static void main(String[] args) {

		/*
		 1. 구구단을 다음과 같이 가로로 출력해 보세요.
		 
		 2단: 2x1=2 2x2=4 2x3=6 .....
		 3단: 3x1=3 3x2=6 3x3=9 .....
		 4단: 4x1=4 4x2=8 4x3=12 .....
		 
		 
		 
		 
		 
		 2. 구구단을 다음과 같이 세로로 출력해 보세요.
		 각 단의 간격은 탭 하나로 고정하겠습니다.
		 2단         3단
		 2x1=2      3x1=3
		 2x2=4      3x2=6
		 2x3=6      3x3=9
		 .
		 .
		 .	 
		 */
		
		for (int i=2; i<=9; i++) {
			System.out.print( i + "단: ");
			for(int j=1; j<=9; j++) {
				System.out.printf("%dx%d=%d ", i, j, i*j);
			}
			
			System.out.println();
			
		}
		
		
		System.out.println("-------------------------------");
		
		//Q2.
		for(int j=0; j<=9; j++) {
			
			for(int i=2; i<=9; i++) {
				if(j == 0) {
					System.out.print(i + "단\t");
				} else {
					System.out.printf("%dx%d=%d\t"
							, i, j, i*j);
				}
			}
			
			System.out.println();
			
		}
		
		
		}
		
		
		
	}


