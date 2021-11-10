package exception.quiz;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc = null;
		
		try {
			acc = new Account(2000);
			acc.deposit(200);
			acc.withDraw(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("계좌 잔액: " + acc.getBalance());

	}

}
