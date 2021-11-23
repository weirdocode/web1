package thread.quiz;

public class MainClass {

	public static void main(String[] args) {
		
		VoteThread voteLocation1 = new VoteThread();
		VoteThread voteLocation2 = new VoteThread();
		VoteThread voteLocation3 = new VoteThread();
		
		Thread location1 = new Thread(voteLocation1, "Location1");
		Thread location2 = new Thread(voteLocation2, "Location2");
		Thread location3 = new Thread(voteLocation3, "Location3");
		
		location1.start();
		location2.start();
		location3.start();
		

	}

}
















