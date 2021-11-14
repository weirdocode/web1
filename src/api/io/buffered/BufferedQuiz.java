package api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BufferedQuiz {

	public static void main(String[] args) {
		
		/*
		 1. Date클래스와 SimpleDateFormat클래스를 활용하여
		  file 경로에 20211111.txt이름으로 파일을 씁니다.
		 2. 내용은 아무거나 작성하셔도 무방합니다.
		 3. 파일을 정상적으로 썼다면 BufferedReader를 통해
		  파일을 읽어들이세요.
		*/
		
		String str = "안녕하세요. 오늘 날씨가 참 춥네요~\n감기 조심하세요~ 안녕~";
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("C:\\Users\\Pumpkin\\Desktop\\park\\file\\" + today + ".txt");
			bw = new BufferedWriter(fw);
			
			bw.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		////////////////////파일 읽기 //////////////////////////
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:\\Users\\Pumpkin\\Desktop\\park\\file\\"
					+ ""
					+ ""
					+ ""
					+ ""
					+ "" + today + ".txt");
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
















