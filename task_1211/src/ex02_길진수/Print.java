package ex02_길진수;

public class Print {
	public static void main(String[] args) {
		
		// 15부터 30을 배열에 담기
		// 짝수들의 합을 저장할 변수 선언
		// while문 제어할 논리형 변수 선언
		// while문을 사용하여 30까지 수를 다 보면 while문 종료
		
		
		int[] ar = new int[16];  // 15부터 30이 들어갈 정수형 배열 선언
		int sum = 0;  // 짝수들의 합을 저장할 변수 선언
		
		for(int i=0; i<ar.length; i++) {  // 배열의 길이만큼 반복
			ar[i] = i+15;  // 배열에 15부터 순차적으로 수를 담는다
		}
		
		boolean isTrue = true;  // 반복문을 통제할 논리형 변수 선언
		while(isTrue) {  // 일단 실행
			for(int i=0; i<ar.length; i++) {  // 배열의 길이만큼 반복한다
				if(ar[i]%2 == 0) {  // 배열에 저장된 값이 짝수라면
					sum += ar[i];  // 해당 인덱스에 저장된 값을 총합 변수에 더해서 저장
				}
				if(i == 15) {  // for문이 끝까지 실행됐다면
					isTrue = false;  // 반복문 탈출
				}
			}
		}
		
		System.out.println("15부터 30까지 짝수들의 합 : " + sum);  // 총합 결과 출력
	}
}
