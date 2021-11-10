package exception.quiz;

public class Account {
	
	/*
    1. 잔액(balance: long)으로 멤버변수를 선언 (private 제한자)
    2. deposit: 입금기능
       withDraw: 출금기능
       getBalance: 잔액확인기능 (return -> long)
       
    3. withDraw에서 잔액이 출금금액보다 작다면 예외를 발생시키는 코드르
     작성해 보세요. (MyException)
    4. AccountMain이라는 클래스를 작성하셔서 예외처리가 잘 되는지
     확인 해 보세요.
    */
	private long balance;
	
	public Account(int money) throws Exception {
		if(money <= 0) {
			throw new MyException("돈을 넣어야 계좌 개설을 하지!");
		}
		this.balance = money;
	}
	
	
	public void deposit(int money) throws MyException {
		if(money <= 0) {
			throw new MyException("입금액은 0보다 커야합니다");
		}
		this.balance += money;
	}
	public void withDraw(int money) throws MyException {
		if(this.balance < money) {
			throw new MyException("잔액 부족: " + (money - this.balance) + "원");
		}
		this.balance -= money;
	}
	public long getBalance() {
		return this.balance;
	}

}
