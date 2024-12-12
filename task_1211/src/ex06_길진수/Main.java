package ex06_길진수;

public class Main {
	public static void main(String[] args) {
//			1. 금융계좌 관리 프로그램을 만들려고 한다. 아래 요구사항에 맞게 프로그램을 코드로 구현하라.
//
//			[요구사항]
//
//			(1) 주어진 이자율, 송금 금액은 아래와 같다:
//
//			- SavingsAccount → 소유자: 본인이름, 잔액: 10,000원
//			- CheckingAccount → 소유자: 영구, 잔액: 20,000원
//			- 예금 계좌에 5% 이자 추가
//			- 예금 계좌에서 체크 계좌로 3,000원 송금
//
//			(1) 인터페이스 정의
//
//			- Account 인터페이스
//			    - getBalance() 메소드: 잔액 반환
//			    - printDetails() 메소드: 계좌의 세부 정보 출력
//			- AdvanceAccount 인터페이스
//			    - Account를 상속받아 아래 메소드 추가
//			    - addInterest(double rate) 메소드: 잔액(balance)에 주어진 비율(rate, %)만큼 이자 추가
//			    이자율 계산공식: balance += balance * (rate / 100)
//			    - transfer(Account target, double amount) 메소드: 다른 계좌로 금액(amount) 송금
//			    - receive(double amount) 메소드: 다른 계좌에서 송금된 금액을 수신 계좌의 잔액(balance)에 추가
//
//			(2) 클래스 설계
//
//			- 공통 필드 (private)
//			    - double balance: 계좌 잔액
//			    - String accountHolder: 계좌 소유자 이름
//
//			생성자
//
//			- 생성자를 통해 필드 값을 초기화한다.
//			- 생성자는 단 1개만 존재하며, 이름과 잔액을 매개변수로 받음
//
//			SavingsAccount 클래스
//
//			- AdvanceAccount 인터페이스 구현
//			    - addInterest(double rate) 메소드: 잔액(balance)에 주어진 비율(rate, %)만큼 이자 추가
//			    - printf 메소드를 사용하여 이자율을 소수점 2자리까지
//			    - transfer(Account target, double amount) 메소드: 잔액이 충분한 경우 송금 처리 수행
//			    잔액이 부족하면 "송금 실패: 이유: 잔액 부족" 메시지 출력
//			    - receive(double amount) 메소드: 수신 계좌의 잔액(balance)에 금액(amount)을 추가
//
//			CheckingAccount 클래스
//
//			- AdvanceAccount 인터페이스 구현
//			    - addInterest(double rate) 메소드: 잔액(balance)에 주어진 비율(rate, %)만큼 이자 추가
//			    - printf 메소드를 사용하여 이자율을 소수점 2자리까지
//			    - transfer(Account target, double amount) 메소드: 잔액이 충분한 경우 송금 처리 수행
//			    잔액이 부족하면 "송금 실패: 이유: 잔액 부족" 메시지 출력
//			    - receive(double amount) 메소드: 수신 계좌의 잔액(balance)에 금액(amount)을 추가
	}
}
