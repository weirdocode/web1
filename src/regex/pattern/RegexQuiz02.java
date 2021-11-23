package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		
		/*
		 상품번호, 업소명(도시락명), 가격 으로 분리해서 출력.
		 
		 정규표현식에서 (): 괄호 안에 들어있는 문자를 하나의 문자열로 인식
		 \\(,\\): 특수문자 (가 존재하는지를 확인
		 */
		
		String str1 = "123123-4564564 GS25(치킨도시락) 4,400원";
		String str2 = "111111-2222222 CU(마늘햄도시락) 5,500원";
		String str3 = "333333-4444444 MINISTOP(제육도시락) 5,000원";
		
		String pattern1 = "\\d{6}-\\d{7}";
		String pattern2 = "[A-Z]+[0-9]*";
		String pattern3 = "\\([가-힣]+\\)";
		String pattern4 = "[0-9],[0-9]+원";
		
		String[] arr = {str1, str2, str3};
		
		int i = 0;
		while(i < arr.length) {
			System.out.println("----------------------------");
			Matcher m1 = Pattern.compile(pattern1).matcher(arr[i]);
			Matcher m2 = Pattern.compile(pattern2).matcher(arr[i]);
			Matcher m3 = Pattern.compile(pattern3).matcher(arr[i]);
			Matcher m4 = Pattern.compile(pattern4).matcher(arr[i]);
			
			if(m1.find() && m2.find() && m3.find() && m4.find()) {
				System.out.println("제품번호: " + m1.group());
				System.out.println(m2.group());
				System.out.println(m3.group());
				System.out.println(m4.group());
			}
			
			i++;
		}
	

	}

}















