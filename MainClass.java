
public class MainClass {
	
	

	public static void main(String[] args) {

		/*
		 - 객체를 생성하지 않았을 때의 예시를 보고
		 빵 객체를 생성할 수 있는 클래스(설계도)를 작성해 보세요.
		 클래스 이름은 Bread로 통일하겠습니다.
		 
		 - MainClass에서 똑같이 피자빵, 초코케이크의 정보를 
		  호출해 보세요. (생성자는 여러분들 마음대로~)
		 */
		
		Bread p = new Bread();
		p.name = "피자빵";
		p.price = 500;
		p.ingredient = "밀가루";
		p.showSpec();
		
		Bread c = new Bread("초코빵", 500, "초콜렛");
		c.showSpec();
		
		
	}

}
