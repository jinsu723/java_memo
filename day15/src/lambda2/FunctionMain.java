package lambda2;

public class FunctionMain {
	public static void main(String[] args) {
		
		// 익명 클래스로 객체 생성
		FunctionalInter1 fi1 = new FunctionalInter1() {

			@Override
			public int addTea(int number) {
				return number + 10;
			}
			
		};
		
		// 람다식으로 객체 생성
		FunctionalInter1 fii = number -> number + 10;
		System.out.println(fi1.addTea(10));
		System.out.println(fii.addTea(5));
		
//		int addTea(int number) { return number + 10; }
//		메소드명 없애고 -> 추가
//		반환 타입 추론 가능 생략
//		매개변수 추론 가능 생략
//		매개변수가 1개면 () 생략 가능
//		number -> { return number + 10; }
//		number -> number + 10
		
		System.out.println("=========================");
		// 익명 클래스로 재정의
		FunctionalInter2 f1 = new FunctionalInter2() {

			@Override
			public int printSum(int num1, int num2) {
				System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2);
				return num1 + num2;
			}
			
		};
		
		// 람다식으로 재정의
		
		System.out.println(f1.printSum(10, 5));
		FunctionalInter2 f2 = (num1, num2) -> {
			System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2);
			return num1 + num2;
		};
			
		// 매소드 호출
		System.out.println(f1.printSum(12, 9));
		System.out.println(f2.printSum(11, 4));
		
		System.out.println("===================================");
		FunctionalInter3 fi3 = new FunctionalInter3() {  // 익명 클래스로 추상 메소드 구현

			@Override  // 인터페이스의 메소드 오버라이드
			public int getMul(int num1, int num2) {  // 추상 메소드와 선언부 일치
				return num1 * num2;  // 두 정수를 곱한 값을 반환
			}
			
		};
		System.out.println("FunctionalInter3 익명클래스 : " + fi3.getMul(3, 3));  // 익명 클래스에서 구현된 메소드 호출
		
		FunctionalInter3 fi31 = (num1, num2) -> num1 * num2;  // 익명 메소드 람다식으로 객체 선언
		System.out.println("FunctionalInter3 익명메소드 : " + fi31.getMul(3, 8));  // 람다식으로 구현한 메소드 호출
		
		
		System.out.println("===================================");
		FunctionalInter4 fi4 = new FunctionalInter4() {  // 익명 클래스로 추상 메소드 구현

			@Override  // 인터페이스의 메소드 오버라이딩
			public String combineString(String msg1, String msg2) {  // 추상 메소드와 선언부 일치시키기
				return msg1 + msg2;  // 문자열을 이어붙여서 반환
			}
			
		};
		
		System.out.println("FunctionalInter4 익명 클래스 : " + fi4.combineString("안녕", "하세요"));  // 익명 클래스에서 구현한 메소드 호출
		
		FunctionalInter4 fi41 = (msg1, msg2) -> msg1 + msg2;  // 익명 메소드 람다식으로 객체 선언
		System.out.println("FunctionalInter4 익명 메소드 : " + fi41.combineString("안녕", "하세요2"));  // 람다식으로 구현한 메소드 호출
		
	}
}
