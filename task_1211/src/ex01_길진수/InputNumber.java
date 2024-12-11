package ex01_길진수;

import java.util.Scanner;

public class InputNumber {
	public static void main(String[] args) {

		// 입력 메소드 import
		// 각각의 변수와 최대 최소값, 평균을 저장할 변수선언
		// 최대값과 최소값 찾기
		// 각각의 수를 더해 평군을 구하기
		// 결과 출력

		Scanner sc = new Scanner(System.in);  // 입력 메소드 import

		int num1, num2, num3, max, min;
		// 입력받은 수를 저장할 변수 3개, 최대값 최소값을 저장할 변수 하나씩 선언
		double avg;  // 평균을 저장할 변수 선언

		System.out.println("3개의 정수를 띄어쓰기를 통해 입력하세요");  // 사용자에게 입력 요구
		num1 = sc.nextInt();  // 1번째 수 저장
		num2 = sc.nextInt();  // 2번째 수 저장
		num3 = sc.nextInt();  // 3번째 수 저장

		// 최대값 구하기
		if (num1 > num2) {  // 1번째 수가 2번째 수보다 크다면
			max = num1;  // 최대값에 1번째 수 저장
			if (num3 > max) {  // 3번째 수가 최대값에 저장된 1번째 수보다 크다면
			max = num3;  // 최대값에 3번째 수 저장
			}
		} else {  // 처음에 1번째 숫자보다 2번째 숫자가 컸다면
			max = num2;  // 최대값에 2번째 숫자 저장
			if (num3 > max) {  // 최대값에 저장된 2번째 숫자보다 3번째 숫자가 크다면
				max = num3;  // 최대값에 3번째 숫자 저장
			}
		}
		
		// 최소값 구하기
		if(num1 < num2) {  // 1번째 숫자가 2번쨰 숫자보다 작다면
			min = num1;  // 최소값에 1번째 숫자 저장
			if(num3 < min) {  // 최소값에 저장된 1번째 숫자보다 3번째 숫자가 작다면
				min = num3;  // 최소값에 3번째 숫자 저장
			}
		} else {  // 처음에 2번째 숫자가 1번째 숫자보다 작았다면
			min = num2;  // 최소값에 2번째 숫자 저장
			if(num3 < min) {  // 최소값에 저장된 2번째 숫자보다 3번째 숫자가 작다면
				min = num3;  // 최소값에 3번째 숫자 저장
			}
		}
		
		avg = (num1 + num2 + num3) / 3d;  // 입력받은 세 숫자의 합을 3으로 나누고 실수형으로 바꿔서 평균 변수에 저장
		
		System.out.println("최소값 : " + min + ", 최대값 : " + max);  // 최대값과 최소값 출력
		System.out.printf("평균 : %.3f", avg);  // 평균을 소수점 3자리까지 출력
		
		
		sc.nextLine();  // 버퍼 비우기
		sc.close();  // 자원 닫기
	}
}