package api.io.steam;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {
	
	public static void main(String[] args) {
		
	
	
	/*
	 1. 파일을 쓸 때 (작성) 사용하는 클래스는 FileOutputStream 입니다.
	 2. 생성자의 매개값으로 파일을 쓸 전체 경로를 지정합니다.
	 3. io패키지의 모든 클래스들은 생성자에 throws 키워드가 있기 때문에
	  try-catch블록을 항상 작성해야 합니다.
	 */
	
	Scanner sc = new Scanner(System.in);
	System.out.print("파일명: ");
	String name = sc.next();
	
	FileOutputStream fos = null;
	
	try {
		fos = new FileOutputStream("C:\\Users\\Pumpkin\\Desktop\\park\\file\\" + name + ".txt");
		
		System.out.print("문장을 입력하세요: ");
		sc.nextLine();
		String str = sc.nextLine();
		
		byte[] arr = str.getBytes(); //문자열 데이터를 바이트데이터로 변환.
		
		fos.write(arr); //파일을 바이트 단위로 써 내림
		System.out.println("파일이 정상적으로 저장되었습니다.");
	
	
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			fos.close();
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	}

}
