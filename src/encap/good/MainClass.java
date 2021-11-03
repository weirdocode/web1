package encap.good;

public class MainClass {

	public static void main(String[] args) {

		MyBirth my = new MyBirth();
//		my.day = 31; (x)
		my.setYear(1991);
		my.setMonth(12);
		my.setDay(17);
		
		
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n", 
				my.getYear("abc1234"), my.getMonth(), my.getDay());
		
	}

}
