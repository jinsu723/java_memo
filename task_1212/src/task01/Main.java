package task01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		1. 숫자를 입력받아 1부터 입력받은 숫자까지의 합을 출력하는 프로그램을 만드세요. 
//		그리고 숫자가 아닌 값이 입력될 경우 "잘못된 입력입니다"라는 예외 메시지를 출력하고, 
//		프로그램을 종료하세요
		Method m = new Method();  // 객체 생성
		
		// 프로그램 이름
		System.out.println("*****1부터 입력한 수까지 더해주는 프로그램*****");
		
		System.out.println("정수를 입력하세요");  // 사용자에게 입력값 요구
		
		Scanner sc = new Scanner(System.in);  // 입력 메소드 import
		String a = sc.next();  // 받은 입력값 변수에 저장
		
		if(!m.checkNum(a)) {  // 입력받은 값이 정수인지 판단
			try {
				throw new MainException("잘못된 입력입니다");  // 정수가 아니라면 예외처리
			} catch (MainException e) {  // 내가 만든 예외처리 클래스의 객체 생성
				System.out.println(e.getMessage());
			}
		} else {
			// 입력받은 값이 정수라면 정수형으로 반환해서 계산하고 결과 출력
			System.out.println("계산 결과 : " + m.sumNum(Integer.parseInt(a)));
			
		}
		
		// 프로그램 정상 종료
		System.out.println("프로그램 종료");
		sc.nextLine();  // 버퍼 비우기
		sc.close();  // 자원 닫기
	}
}
