package regex.pattern;

import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		
		//[]: 해당 위치의 한 글자에 어떤 문자들이 올 수 있는지를 정의.
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sweep"));
		
		/*
		 # [] 안에 정의할 수 있는 것들
		 1. [abc]: a,b,c 중 하나만 허용
		 2. [^abc]: a,b,c를 제외한 모두를 허용
		 3. [a-z]: a부터 z까지 허용.
		 [a-zA-Z가-힣]: 영문 소문자, 대문자, 한글을 허용.
		 4. [0-9]: 숫자만 허용
		 5. &&: 교집합 (좌항과 우항 패턴을 모두 만족하는 문자)
		 */
		
		
		
		
		

	}

}

















