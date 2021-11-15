package lambda.stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuizMain {

	public static void main(String[] args) {
		
		/*
	       1. BufferedReader를 사용해서 csv파일을 읽어들이세요.
	       2. ,를 기준으로 잡아서 분할 한 뒤 Data객체에 한 줄 단위로 저장합니다.
	       3. list<Data>에 추가합니다.
	       
	       4. 람다식을 이용해서 지역: 서울, 월: 짝수의 분양가격이 4000 이상의 객체만 
	       뽑아서 새로운 list를 생성. (filter)
	       
	       stream.collect(Collectors.toList()) 
	       -> 스트림 객체의 요소를 모아서 새로운 리스트 생성.
	       
	       5. 새롭게 만들어진 리스트 내부의 내용을 모두 출력해 주세요.
	       */
		
//		FileReader fr = null;
		BufferedReader br = null;
		//Data 객체들을 모아놓는 리스트
		List<Data> list = new ArrayList<>();
		
		/*
		 - 외부 문서를 읽어들일 때, 인코딩 형식이 다르면 한글이 깨지는 현상이 발생한다.
		 - BufferedReader를 통해 인코딩 형식을 지정한 후에 가져오는 방법.
		 */
		FileInputStream fis = null;
		InputStreamReader is = null; //인코딩을 지정해서 가져올 수 있는 클래스.
		
		try {
			fis = new FileInputStream("C:\\Users\\admin\\Desktop\\PKw\\주택도시보증공사_전국 평균 분양가격(2020년 2월).csv");
			is = new InputStreamReader(fis, "EUC-KR");
			br = new BufferedReader(is);
			
			String str;
			while((str = br.readLine()) != null) {
				String[] arr = str.split(",");
//				System.out.println(Arrays.toString(arr));
				String region = arr[0];
				String size = arr[1];
				String year = arr[2];
				String month = arr[3];
				
				String price;
				try {
					//공백, -제거
					arr[4] = arr[4].replace("-", "").replace(" ", "");
					if(arr[4].equals("")) {
						price = "0"; //없는 값이라면 0을 저장
					} else {
						price = arr[4];
					}
					
				} catch (Exception e) {
					price = "0";
				}
				
				Data data = new Data(region, size, year, month, price);
				list.add(data);
				
				
			}/*
			List<Data> newList =
			list.stream().filter((data) -> data.getRegion().equals("서울"))
						 .filter((data) -> Integer.parseInt(data.getMonth())) % 2 == 0)
						 .filter((data) -> Integer.parseInt(data.getPrice)) >= 4000)
						 .Collectors.toList();
						 */
			List<Data> newList =
			list.stream().filter((data) -> data.getRegion().equals("서울")
					&& Integer.parseInt(data. getMonth()) % 2 == 0
					&& Integer.parseInt(data. getPrice()) >= 4000)
			.collect(Collectors.toList());
						 
						 
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				is.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		

	}

}
















