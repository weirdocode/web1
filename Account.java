
public class Account {
	
	String name;
	int password;
	int balance;
	
	Account() {}
	
	Account(String nName, int nPassword, int nBalance){
		
		name = nName;
		password = nPassword;
		balance = nBalance;
		
		
	}
	
	//입금 기능
	void deposit(int pCoin) {
		if(pCoin <= 0) {
			System.out.println("입금 금액은 0원 보다 커야 합니다");
			return;
		}
		balance += pCoin;
		
	}
	
	//출금 기능
	void withDraw(int mCoin, int pw) {
		if(pw == password) {
			if(mCoin > balance) {
				System.out.println("잔액이 부족합니다.");
			} else {
			balance -= mCoin;
			}
		}else {
			System.out.println("비밀 번호가 틀렸습니다.");
		}
		
	}
	
	//잔액 조회
	int getBalance() {
		return balance;
	}
	
}
