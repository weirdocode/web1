package this_super;

public class Player {
	
	String name;
	int level;
	int atk;
	int hp;
	
	Player() {
		System.out.println("Player의 기본 생성자 호출!");
//		System.out.println("this의 주소값: " + this);
		this.level = 1;
		this.atk = 3;
		this.hp = 50;
	}
	
	Player(String name) {
		this(); //같은 클래스의 다른 생성자를 부르는 문법
		System.out.println("Player의 2번 생성자 호출!");
//		System.out.println("this의 주소값: " + this);
//		level = 1;
//		atk = 3;
//		hp = 50;
		this.name = name;
	}
	
	Player(String name, int hp) {
		this(name); //다른 생성자의 호출은 생성자 내에서 최상단에 위치해야 합니다.
		System.out.println("Player의 3번 생성자 호출");
//		this.name = name;
		this.hp = hp;
	}
	
	
	void characterInfo() {
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디: " + name);
		System.out.println("# 레벨: " + level);
		System.out.println("# 공격력: " + atk);
		System.out.println("# 체력: " + hp);
	}

}













