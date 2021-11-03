package obj_array;

public class Score {
	
	/*
	 - 이름, 국어, 영어, 수학, 총점, 평균(double)을
	 담을 수 있는 객체를 디자인 하세요.
	 
	 - 학생의 모든 정보를 한 눈에 확인할 수 있게
	 scoreInfo() 메서드를 선언해 주세요.
	 메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요
	 
	 - 캡슐화를 구현해서 작성해 주세요. (생성자는 마음대로 하세요)
	 
	 */

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	Score(){}
	
	
	void scoreInfo(){
		System.out.println("이름: " + name);
		System.out.println("국어 점수: " + kor);
		
		
	}
	
	
	
}
