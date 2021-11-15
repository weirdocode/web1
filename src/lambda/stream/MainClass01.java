package lambda.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("김철수");
		list.add("박영희");
		list.add("김뽀삐");
		list.add("최또띠");
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("------------------------------");
		/*
		Stream<String> stream = list.stream();
		
		stream.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		 */
		list.stream().forEach((s) -> System.out.println(s));
		
		
		
		
	}

}
















