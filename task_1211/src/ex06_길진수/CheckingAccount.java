package ex06_길진수;

public class CheckingAccount implements AdvanceAccount{
//	- 공통 필드 (private)
//    - double balance: 계좌 잔액
//    - String accountHolder: 계좌 소유자 이름
//
//생성자
//
//- 생성자를 통해 필드 값을 초기화한다.
//- 생성자는 단 1개만 존재하며, 이름과 잔액을 매개변수로 받음
//	CheckingAccount 클래스
//
//	- AdvanceAccount 인터페이스 구현
//	    - addInterest(double rate) 메소드: 잔액(balance)에 주어진 비율(rate, %)만큼 이자 추가
//	    - printf 메소드를 사용하여 이자율을 소수점 2자리까지
//	    - transfer(Account target, double amount) 메소드: 잔액이 충분한 경우 송금 처리 수행
//	    잔액이 부족하면 "송금 실패: 이유: 잔액 부족" 메시지 출력
//	    - receive(double amount) 메소드: 수신 계좌의 잔액(balance)에 금액(amount)을 추가
	
	private double balance;
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addInterest(double rate) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void transfer(Account target, double amount) {
		// TODO Auto-generated method stub
	}
	@Override
	public void recive(double amount) {
		// TODO Auto-generated method stub
	}
	private String accountHolder;
}
