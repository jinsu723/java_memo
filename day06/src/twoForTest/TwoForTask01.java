package twoForTest;

import java.util.Scanner;

// 5번 :

public class TwoForTask01 {
	public static void main(String[] args) {
		// 1번 : 역삼각형
		// *****
		// ****
		// ***
		// **
		// *
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("수를 입력하세요");
		num = sc.nextInt();

		for (int i = 0; i < num; i++) { // 행
			for (int j = num; j > i; j--) { // 열
				System.out.print("* ");
			}
			System.out.println();
		}
		
		sc.nextLine();
		System.out.println();
		
		// 2번 : 피라미드와 유사하지만 죄측 정렬
		// *
		// * * *
		// * * * * *
		// * * * * * * *
		
		int num2 = 0;
		System.out.println("정수를 입력");
		num2 = sc.nextInt();
		
		for(int i=0; i<num2; i++) {
			for(int j=0; j<=(2*i); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		sc.nextLine();
		System.out.println();
		
		// 3번 : 피라미드 (for문이 총 3개 -> 어떻게 사용될지 먼저 생각하기)
		
		int num3 = 0;
		System.out.println("정수를 입력");
		num3 = sc.nextInt();
		
		for(int i=0; i<num3; i++) {
			for(int j=num3; j>i; j--) {
				System.out.print(" ");
			}
			for(int z=0; z<=i; z++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		sc.nextLine();
	}
}
