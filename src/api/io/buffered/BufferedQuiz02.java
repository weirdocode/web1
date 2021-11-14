package api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BufferedQuiz02 {

	public static void main(String[] args) {


		/*
		 1. Date클래스를 이용해서 file폴더 내에 하위 경로로
		  오늘 날짜 20211111file 이라는 이름으로 폴더를 생성하세요.
		 2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
		 3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
		  파일을 작성합니다. 
		  (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
		   연결해 주시면 됩니다.)
		 4. '그만'으로 파일이 작성되었다면, 아무방법으로나 
		  파일을 읽어서 콘솔에 출력해 보세요.
		 */

		Scanner sc = new Scanner(System.in);

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);

		File file = new File("C:\\Users\\Pumpkin\\Desktop\\park\\file\\" + today + "file");

		if(!file.exists()) {
			file.mkdir();
			System.out.println("폴더가 생성됨!");
		} else {
			System.out.println("폴더가 이미 존재함!");
		}

		BufferedWriter bw = null;
		String str = null;

		System.out.print("파일명을 입력하세요: ");
		str = sc.nextLine();

		try {
			bw = 
					new BufferedWriter(new FileWriter("C:\\Users\\Pumpkin\\Desktop\\park\\file\\" + today + "file\\" + str + ".txt"));

			System.out.println("'그만'을 입력하면 중지합니다.");
			while(true) {
				System.out.print("하실 말씀: ");
				String text = sc.nextLine();

				if(text.equals("그만")) {
					System.out.println("종료합니다.");
					break;
				}

				text += "\r\n";
				bw.write(text);
				bw.flush(); //버퍼가 가득차지 않아도 문자열을 파일로 내보내는 메서드
			}



		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


		////////////////////파일 읽기 //////////////////////////

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("C:\\Users\\admin\\Desktop\\Java_Web_LKM\\file\\" + today + "file\\" + str + ".txt");
			br = new BufferedReader(fr);

			String read;

			while((read = br.readLine()) != null) {
				System.out.println(read);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}



	}

}