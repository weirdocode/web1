package api.io.steam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {
		
		/*
		 1. 파일을 읽어드리는 데 사용하는 클래스는 fileInputStream 입니다.
		 2. 생성자의 매개값으로 읽어들일 파일의 전체 경로를 적습니다.
		 3. InputStream 객체는 생성자에 throws가 있기 때문에
		 try-catch 안에서 사용합니다.
		 */
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\Pumpkin\\Desktop\\park\\file\\text.txt");
			/*
			while(true) {
				int data = fis.read(); //1바이트 단위로 데이터를 읽어들임.
				System.out.print((char) data);
				if(data == -1) break; //read() 메서드가 더 이상 읽을 값이 없다면 -1을 반환.
				
				
			}*/
			
			byte[]	arr = new byte[100];
			int result = fis.read(arr); //100바이트 단위로 읽어드림.
			System.out.println("읽어드린 데이터 길이: " + result);
			System.out.println(Arrays.toString(arr));
			
			int i = 0;
			while(arr[i] !=0) {
				System.out.print((char) arr[i]);
				i++;
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//스트림을 더 이상 사용하지 않을 경우
				//시스템 자원을 반납하는 코드를 꼭 작성합니다.
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
