package anonymousTest2;

// Calculator 인터페이스
// 추상 메소드2
// - 두 개의 매개변수 받아 더한 값을 반환하는 메소드
// - 두 개의 매개변수를 받아 곱한 값을 반환하는 메소드

interface Calculator {
	int add(int num1, int num2);
	int mul(int num1, int num2);
}

public class AnonymousTask {
	public static void main(String[]args) {
		// 익명 클래스로 객체 생성 후 메소드 호출하기
		Calculator c = new Calculator() {

			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}

			@Override
			public int mul(int num1, int num2) {
				return num1 * num2;
			}
			
		};
		
		System.out.println(c.add(5, 10));
		System.out.println(c.mul(3, 23));
	}
	
}
