package task;

import java.util.Scanner;

// 공백(0100) 문제2
public class Task02 {
	public static void main(String[] args) {
//		- **문제 2. 입력받은 Type 출력**
//	    
//	    정수, 실수, 문자, 문자열 중 하나를 입력하여 입력받은 Type이 무엇인지 알려주는 프로그램 
//	    
//	    메서드명: CheckType, Type에 따라 값 출력하는 메서드), 매개변수O, 리턴값 자유
//	    
//	    출력 형식
//	    정수, 실수, 문자, 문자열 중 하나를 입력하세요:  3.14
//	    3.14는 실수입니다.
//	    
//	    출제 의도 
//	    
//	    - 오버 로딩 연습
//	    - 여러 형변환들이 어떻게 작동하는지  연습
		
		System.out.println("*****입력받은 Type 출력*****");
		
		// 입력메소드 import
		// 객체 생성
		// 입력받은 값을 메소드에 바로 저장 => t.checkType(sc.next());
		
		Scanner sc = new Scanner(System.in);
		Task02 t = new Task02();
		
		t.checkType(sc.nextLine());
	}
	
	// 리턴 타입 : X
	// 매개변수 : int, double, char, String 하나씩 메소드 생성
	// 매개변수 형식에 따라 출력메시지 출력
	
	void checkType(int num) {
		System.out.println(num + "은 정수입니다.");
	}
	
	void checkTyep(double num) {
		System.out.println(num + "은 실수입니다.");
	}
	
	void checkType(char word) {
		 System.out.println(word + "는 문자형입니다.");
	}
	 
	void checkType(String words) {
		char[] word = new char[words.length()];
		for(int i=0; i<words.length(); i++) {
			word[i] = words.charAt(i);
		}
//		if(char[0].equals(words)) {
//			
//		}
		System.out.println(words + "는 문자열입니다.");
	}
}
