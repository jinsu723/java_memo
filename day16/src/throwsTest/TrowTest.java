package throwsTest;

// 6번 : 예외 발생시키기

public class TrowTest {
	public static void main(String[] args) {
		System.out.println("예외 발생시키기");
		
		throw new NumberFormatException();
//		System.out.println("출력 끝");
	}
}
