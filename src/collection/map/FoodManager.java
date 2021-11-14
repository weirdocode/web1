package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FoodManager {

	public static void main(String[] args) {
		
		Map<String, Integer> foods = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 음식점 메뉴판 관리 프로그램 ***");
		
		while(true) {
			
			System.out.println("# 1. 메뉴 등록");
			System.out.println("# 2. 메뉴 전체보기");
			System.out.println("# 3. 프로그램 종료");
			System.out.print("> ");
			int menu = sc.nextInt();
			
			System.out.println("-------------------");
			
			if(menu == 1) {
				
				System.out.println("등록하실 메뉴를 입력하세요 ");
				System.out.println("> ");
				String food = sc.next();
				if(foods.containsKey(food)) {
					System.out.println("이미 존재하는 메뉴입니다.");
					continue;
				}else {
				System.out.println("메뉴가격: ");
				int price = sc.nextInt();
				
				foods.put(food, price);
				System.out.println(foods.get(food) + "가 등록되었습니다");
				
				}
				
				
				/*
	             - 메뉴명과 가격을 입력받아서 Map에 삽입하시면 됩니다.
	              이미 존재하는 메뉴명이 들어왔다면 '이미 존재하는 메뉴입니다.'
	              를 출력하시고 메인 메뉴로 돌아와 주세요.
	             - 메뉴 등록 완료 후 'XXX 메뉴가 등록되었습니다.' 를 출력하세요.
	             */
				
			} else if(menu == 2) {
				/* if(foods.isEmpty()) {
					 System.out.println("메뉴를 먼저 등록해 주세요!");
					 continue;
				 }
				 Set<String> show = foods.keySet();
					for(String s : show){
						System.out.println(s + " : " + foods.get(s));
						
						System.out.println("1. 수정 | 2. 삭제 | 3. 취소");
						int choose = sc.nextInt();
						if(choose == 1) {
							System.out.println("수정할 음식을 입력하세요");
							System.out.println("> ");
							String fixfood = sc.next();
							if(!foods.containsKey(fixfood)) {
								System.out.println("해당 메뉴가 존재하지 않습니다");
								break;
							}
							
						}
							
						} else {
							System.out.println("잘못 입력했습니다.");
							continue;
						}
				
				/*
	             - 만약 메뉴가 하나도 등록되어 있지 않다면
	              '메뉴부터 먼저 등록해 주세요!' 출력 후 메인 메뉴로 이동시켜
	              주세요. 
	             
	             - Map의 모든 요소를 반복문을 이용하여 출력해 주세요.
	             ex)
	                메뉴명 : 가격
	                메뉴명 : 가격
	                메뉴명 : 가격....
	              
	              메뉴를 모두 출력 후에 선택지를 제공하세요.
	              (1. 수정 | 2. 삭제 | 3. 취소)
	              - 수정: 수정할 메뉴명을 입력받아서 가격 수정을 진행하세요.
	               없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
	               
	              - 삭제: 삭제할 메뉴명을 입력받아서 해당 메뉴를 삭제해 주세요.
	               없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
	               
	              - 취소: 메인 메뉴로 이동
	             */
				if(foods.isEmpty()) {
					System.out.println("메뉴부터 먼저 등록하고 오세요!");
				} else {
					System.out.println("----------메뉴판---------");
					for(String m : foods.keySet()) {
						System.out.println(m + " : " + foods.get(m));
					}
					System.out.println("---------------------\n");
					
					System.out.println("1. 수정 | 2. 삭제 | 3. 취소");
					System.out.println("> ");
					int sel = sc.nextInt();
					
					switch(sel){
					case 1:
						System.out.println("수정하실 메뉴를 입력하세요");
						System.out.println("> ");
						String cMenu = sc.next();
						if(foods.containsKey(cMenu)) {
							System.out.println("수정할 가격: ");
							int newPrice = sc.nextInt();	
							foods.put(cMenu, newPrice);
							System.out.printf("%s 음식이 %d원으로 변경되었습니다.\n"
									, cMenu, newPrice);
						} else {
							System.out.println("존재하지 않는 메뉴입니다.");
						}
						break;
					
					case 2:
						System.out.println("삭제하실 메뉴를 입력하세요");
						System.out.println("> ");
						String del = sc.next();
						if(foods.containsKey(del)) {
							foods.remove(del);
							System.out.printf("%s 음식이 삭제되었습니다.", del);
							
						}else {
							System.out.println("존재하지 않는 음식입니다");
						}
						break;
						
					case 3:
						System.out.println("메인 메뉴로 돌아갑니다.");
						break;	
					default:
						System.out.println("메뉴를 잘못 입력하였습니다");
						System.out.println("메인 메뉴로 이동합니다.");
					}
					
				}
				
				
			} else if(menu == 3) {
				/*
				 - Y / N를 입력받아서 Y가 입력되면 프로그램 종료.
				  그 외의 값은 종료 취로슬 진행해 주세요.
				 */
				System.out.println("프로그램을 종료합니다 [Y/N]");
				System.out.print("> ");
				String quit = sc.next();
				if(quit.toLowerCase().equals("y")) {
					System.out.println("종료합니다.");
					sc.close();
					System.exit(0);
					
				} else {
					System.out.println("종료가 취소됩니다.");
				}
				
				
			} else {
				System.out.println("메뉴를 잘못 입력하였습니다.");
			}
		

	}

	}
}
