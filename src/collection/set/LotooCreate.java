package collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LotooCreate {

	public static void main(String[] args) {
		
		Set<Integer> lotto = new HashSet<>();
		Random r = new Random();
		
		while(lotto.size() < 6) {
			int num = r.nextInt(45)	+ 1;
			lotto.add(num);
			
			
		}

		System.out.println(lotto);
		List<Integer> list = new ArrayList<>(lotto);
		Collections.sort(list);
		System.out.println(list);
	}

}
