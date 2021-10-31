
public class Bread {

	int price;
	String name;
	String ingredient;
	
	Bread(){}
	
	Bread(String bName, int bPrice, String bIngredient){
		System.out.println("생성자 호출!");
		name = bName;
		price = bPrice;
		ingredient = bIngredient;
	}
	
	
	
	void showSpec() {
		System.out.println("*** 빵 정보 ***");
		System.out.println("빵 이름 : " + name);
		System.out.println("빵 가격 : " + price + "원");
		System.out.println("주 재료 : " + ingredient);
	}
	
	
}
