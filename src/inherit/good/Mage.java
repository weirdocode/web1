package inherit.good;

public class Mage extends Player{
	
	int mana;
	
	void characterInfo(){
		super.characterInfo();
		System.out.println("#정신력: " + mana);
	}
	


}
