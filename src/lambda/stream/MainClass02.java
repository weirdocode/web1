package lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainClass02 {

	public static void main(String[] args) {
		
		/*
		 람다의 구현매개변수 사용문법
		 - Predicate - 매개변수를 받고, boolean형으로 반환
		 - Function - 매개변수를 받고, 임의의 값을 반환.
		 - Consumer - 매개변수를 받고, 반환은 없는 형태
		 - Supplier - 매개변수는 없고, 반환 형태는 지정 가능 (Consumer와 반대)
		 */
		
		
		
		
		List<Integer> list = new ArrayList<>();
		
		for (int i=1; i<=100; i++) {
			list.add((int) ((Math.random()*100) + 1));
		}
		System.out.print(list);
		
		System.out.println("\n---------------------------");
		//중복제거 distinct()
		list.stream()
			.distinct()
			.forEach((num) -> System.out.print(num + " "));
		
		System.out.println("\n-------------------------");
		
		//filter(): 걸러내는 기능
		Stream<Integer> s1 = list.stream()
								 .filter((num) -> num % 2 == 0);
								 //작성하신 조건식의 결과가 true면 리턴.
		
		s1.forEach((num) -> System.out.print(num + " "));
		
		System.out.println("\n----------------------");
		
		//정렬 sorted()
		list.stream()
			.sorted()
			.forEach((num) -> System.out.print(num + " "));
		
		System.out.println("\n----------------------------");
		
		//map(): 메서드 안에 정의된 새로운 stream으로 반환.
		Stream<String> s2 = list.stream().map((num) -> {
			return num % 2 == 0 ? "짝수" : "홀수";
		});
		
		s2.forEach((str) -> System.out.print(str + " "));
		
		System.out.println("\n----------------------------");
		
		//50보다 크면 값을 반환, 아니면 0을 반환.
		list.stream()
			.map((t) -> t > 50 ? t : 0)
			.forEach((t) -> System.out.print(t + " "));
		
		System.out.println("\n----------------------------");
		
		//50보다 크면 원본을 반환, 아니면 0을 반환, 0을 제거 후 출력
		
		list.stream()
			.map((num) -> num > 50 ? num : 0)
			.filter((i) -> i != 0)
			.forEach((j) -> System.out.print(j + " "));

	}

}
















