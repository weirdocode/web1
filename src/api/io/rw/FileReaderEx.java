package api.io.rw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		
		/*
		 - 문자기반으로 읽어들이는 클래스는 FileReader 입니다.
		 - 2바이트 단위로 읽기 때문에 문자를 읽어들이기 적합합니다.
		 */
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:\\Users\\Pumpkin\\Desktop\\park\\file\\merong.txt");
		
			char[] arr = new char[100];
			
			int result = fr.read(arr); // 문자를 하나씩 읽어들임.
			System.out.println("문자의 개수: " + result);
			for(char c : arr) {
				System.out.print(c);
				if(c == 0) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}


















