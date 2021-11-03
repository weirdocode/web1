package obj_array;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		/*
		 - 스캐너를 이용하여 Person객체를 생성하는 데 필요한
		  정보를 입력받으시면 되겠습니다.
		  입력받은 정보를 토대로 Person객체를 생성한 후
		  여러 개의 Person 객체를 배열에다 담아 둘 생각입니다.
		  
		 - 배열의 크기는 3개로 하겠습니다. 반복문을 이용하여
		  입력을 반복해서 받아주시면 됩니다.
		  
		 - 입력이 끝나면 배열 안에 있는 모든 주소값을 순회하여
		  각 객체의 personInfo()를 호출해 보세요. 
		 */
		
		Scanner sc = new Scanner(System.in);
		Person[] people = new Person[3];
		
		for(int i=0; i<people.length; i++) {
			/*
			Person p = new Person();
			System.out.print("이름을 입력하세요: ");
			p.setName(sc.next());
			
			System.out.print("나이를 입력하세요: ");
			p.setAge(sc.nextInt());
			*/
			
			System.out.print("이름을 입력하세요: ");
			String name = sc.next();
			
			System.out.print("나이를 입력하세요: ");
			int age = sc.nextInt();
			
			System.out.print("성별을 입력하세요: ");
			String gender = sc.next();
			
			people[i] = new Person(name, age, gender);
			
			
			System.out.println("***정보 입력 완료***");
			
		} //입력받는 반복문 끝.
		
		System.out.println("-------------------------------");
		
		for(Person p : people) {
			p.personInfo();
			System.out.println();
		}
		
		sc.close();
		

	}

}













