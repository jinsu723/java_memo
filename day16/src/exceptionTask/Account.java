package exceptionTask;

public class Account {
	// 은행계좌 클래스(Account)

	// 필드 : 잔고 balance private
	// 생성자 : 기본생서자 추가
	// 출금메소드 : withdraw 매개변수 1개
	// 잔액보다 출금금액이 크다면 출금불가 예외처리/현재 잔고는 _원입니다. 출금금액의 _원이 부족하여 출금이 불가능합니다 출력

	// 입금메소드 : deposit 매개변수 1개
//         잔액에 입금된 금액 추가후 입금된 금액은 _원입니다. 현재 잔고는 _원입니다. 출력

//         모든 예외처리는 메소드를 사용하는 쪽으로 던지기
	
	private int balance;
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	// 게터, 세터
	public int getBalance() {
		return balance;
	}
	
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
	
	// 출금 메소드
	void withdraw(int num) {
		if(num > balance) {
			try {
				throw new AccountException(this.balance, (num-this.balance));
			} catch (AccountException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} else {
			this.balance -= num;
			System.out.println("출금 완료 현제 잔액 : " + this.balance);
		}
	}
	
	// 입금 메소드
	void deposit(int num) {
		this.balance += num;
		System.out.println("입금 완료 현제 잔액 : " + this.balance);
	}
}
