package abs.bad;


//쥬스 프렌차이즈 본사
public class HeadStore {

	//상속을 받는 클래스들에게 오버라이딩을 권유 (강제x)
	public void orderApple() {
		System.out.println("0원입니다. 가게에서 알아서 가격을 정해주세요.");
		
	}
	
	public void orderBanana() {
		System.out.println("0원입니다. 가게에서 알아서 가격을 정해주세요.");

	}
	
	public void orderGrape() {
		System.out.println("0원입니다. 가게에서 알아서 가격을 정해주세요.");

	}
	
}
