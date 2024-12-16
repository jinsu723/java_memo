package ex06_길진수;

public class SavingAccount implements AdvanceAccount {
//	- 공통 필드 (private)
//    - double balance: 계좌 잔액
//    - String accountHolder: 계좌 소유자 이름
//
//생성자
//
//- 생성자를 통해 필드 값을 초기화한다.
//- 생성자는 단 1개만 존재하며, 이름과 잔액을 매개변수로 받음
//
//SavingsAccount 클래스
//
//- AdvanceAccount 인터페이스 구현
//    - addInterest(double rate) 메소드: 잔액(balance)에 주어진 비율(rate, %)만큼 이자 추가
//    - printf 메소드를 사용하여 이자율을 소수점 2자리까지
//    - transfer(Account target, double amount) 메소드: 잔액이 충분한 경우 송금 처리 수행
//    잔액이 부족하면 "송금 실패: 이유: 잔액 부족" 메시지 출력
//    - receive(double amount) 메소드: 수신 계좌의 잔액(balance)에 금액(amount)을 추가

	private double balance;
	private String accountHolder;

	// 이름과 잔액 초기화
	public SavingAccount(String accountHolder, double balance) {
		super();
		this.balance = balance;
		this.accountHolder = accountHolder;
	}

	// 계좌 잔액 반환
	@Override
	public double getBalance() {
		return this.balance;
	}

	//이름과 잔액을 출력
	@Override
	public void printDetails() {
		System.out.println("이름 : " + this.accountHolder);
		System.out.println("잔액 : " + this.balance);
	}

//  - addInterest(double rate) 메소드: 잔액(balance)에 주어진 비율(rate, %)만큼 이자 추가
//  이자율 계산공식: balance += balance * (rate / 100)
	@Override
	public void addInterest(double rate) {
		this.balance += balance * (rate / 100);
		System.out.printf("이자를 받았습니다.\n%s님의 현제 잔액 : %.2f\n",this.accountHolder, this.balance);
	}

//  - transfer(Account target, double amount) 메소드: 다른 계좌로 금액(amount) 송금
	@Override
	public void transfer(Account target, double amount) {
		if(this.balance < amount) {
			System.out.println(amount + "원 송금 불가!");
			System.out.println("당신의 현제 잔액 : " + this.balance);
			return;
		}
		this.balance -= amount;
		System.out.println(amount + "원 송금 완료! 현제 잔액 : " + this.balance);
		((CheckingAccount)target).recive(amount);  // target에게 amount원을 송금
	}


	//  - receive(double amount) 메소드: 다른 계좌에서 송금된 금액을 수신 계좌의 잔액(balance)에 추가
	@Override
	public void recive(double amount) {
		this.balance += amount; // this는 송금을 받는 객체
		System.out.println(this.accountHolder + "님, " + amount + "원이 입금되었습니다. 현제 잔액 : " + this.balance);
	}

}
