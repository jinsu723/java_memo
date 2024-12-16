package task03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
//		3. 사용자로부터 정수를 입력받아, 입력받은 정수가 0에서 100 사이의 값인 경우, 
//		입력받은 정수를 2배한 값을 출력하고, 그 외의 값이 입력될 경우 
//		"잘못된 입력입니다"라는 예외 메시지를 출력하세요.

		Method m = new Method();  // 메소드가 있는 클래스 객체 생성
		Scanner sc = new Scanner(System.in);  // 입력 메소드 import
		
		// 프로그램 이름
		System.out.println("*****정수를 입력받아 2배로 돌려주는 프로그램*****");
		System.out.println("0부터 100 사이의 정수를 입력하세요");  // 사용자에게 입력값 요구
		String msg = sc.nextLine();  // 입력받은 문자열을 변수에 저장
		
		// 입력받은 문자열이 정수이면서 0부터 100까지의 범위에 해당하는지 판단
		if(!m.checkNum(msg)  || !m.checkNumRange(Integer.parseInt(msg))) {
			try {
				// 잘못된 입력 예외처리
				throw new MainException("잘못된 입력입니다");
			} catch (MainException e) {  // 예외처리 클래스 객체 생성
				// 예외 메시지 출력
				System.out.println(e.getMessage());
			}
		} else {  // 조건에 맞게 입력했다면
			// 결과 출력
			System.out.println("2배로 돌려드립니다 : " + Integer.parseInt(msg)*2);
		}
		
		sc.close();
	}
}
