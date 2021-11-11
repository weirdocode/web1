package generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 Object타입으로 선언하면 무엇이든 저장할 수 있지만,
		 반대로 저장했던 값을 꺼내올 때는 타입별로 형변환을 해야 하는 
		 문제가 발생합니다.
		 잘못 형 변환 했을 시에는 예외가 발생할 수도 있습니다.
		 
		 
		 */
		
		Box box = new Box();
		box.setObj("홍길동");
		String name = (String) box.getObj();
		
		Box p = new Box();
		p.setObj(new Person());
		Person name2 = (Person) p.getObj();
		
		
		

	}

}
