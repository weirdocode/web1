package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		
		String str = "헠4,500원 힣~ 1,200원엌? 6000원윀 120000원";
		
		/*
		 - 가격 형식만 찾아서 순서대로 출력해 보세요.
		 ex)
		 	4,500원 ....
		 	
		 	두 패턴을 모두 만족시킬 정규 표현식을 작성해야 합니다.
		 	*: 0회 이상 반복: 있어도 되고 없어도 되는 경우
		 */
		
		String pattern = "\\d+,*[0-9]+원";
		
		Matcher m = Pattern.compile(pattern).matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
		

	}

}
















