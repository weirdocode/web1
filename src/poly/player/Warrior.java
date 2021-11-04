package poly.player;


public class Warrior extends Player {

	int rage;
	
	Warrior(String name) {
		super(name);
		this.rage = 60;
	}
	
	public void rush(Player p) {
	
		/*
	       1. rush라는 기술을 사용하는 사람의 이름을 
	        적절한 키워드를 사용하여 출력해 주세요.
	        
	       2. 이 기술을 맞는 사람의 피해량을 출력해 주세요.
	        전사는 10의 피해, 마법사는 20의 피해, 사냥꾼은 15의 피해를
	        각각 입습니다.
	        
	       3. 직업별로 다른 피해량을 instanceof 키워드를 사용하여
	        구분해서 출력해 주세요.
	        
	       4. 남은 체력들도 마찬가지로 출력해 주세요.
	       */
		
		System.out.printf("%s님이 %s님에게 돌진을 시전했습니다\n", this.name , p.name);
		
		String job = null;
		int damage = 0;
		if(p instanceof Warrior) {
			damage = 10;
			p.hp -= damage;
			job = "전사";
		} else if (p instanceof Mage) {
			damage = 20;
			p.hp -= damage;
			job = "마법사";
			
		} else if (p instanceof Hunter) {
			damage = 15;
			job = "사냥꾼";
			
		}
		p.hp -= damage;
		System.out.printf("%s(%s)님이 %d의 피해를 주었습니다", this.name, job, damage);
		
//		int damage = 0;
//		if(p instanceof Warrior) {
//			damage = 10;
//		} else if(p instanceof Mage) {
//			damage = 20;
//		} else {
//			damage = 15;
//		}
//		System.out.printf("%s님이 %d의 피해를 입었습니다.\n", p.name, damage);
//		System.out.printf("%s님의 남은 체력: %d\n", p.name, p.hp - damage );
//		System.out.println("-----------------------------");
		
	}
	
	
	

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}

	
	
}












