package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LottoList {
	public static void main(String[] args) {
		
		// Integer 타입의 객체 생성
		// 랜한 수를 넣어줄 Random 클래스 객체 선언
		// 랜덤한 값을 임시로 저장해둘 변수 선언
		// while문을 사용해서 배열의 크기가 6이 될 때까지 반복
		// while문 안에서 중복검사 실행
		// 랜덤한 값을 변수에 임시 저장
		// for문을 사용하여 배열의 길이만큼 반복
		// 배열 안에 임시저장한 값이 이미 있다면 건너뛰기
		// 만약 배열에 중복되는 값이 없다면 임시저장한 값 저장
		// 배열의 크기가 6이 되었다면 while문 탈출
		// 배열에 저장된 값들을 오름차순으로 정렬하여 출력
		
		
		// 정수형만 받는 ArrayList 객체 선언
		ArrayList<Integer> al = new ArrayList<>();
		Random rd = new Random();  // 랜덤 클래스 import
		int randomNum;  // 임시저장할 변수 선언
		
		// 배열의 크기가 6이 될때까지 반복하는 반복문
		while(al.size() < 6) {
			randomNum = rd.nextInt(1, 45);  // 랜덤한 값을 임시 변수에 저장
			for(int i=0; i<=al.size(); i++) {  // 배열의 길이만큼 반복
				if(al.contains(randomNum)) {  // 임시저장된 값이 이미 배열에 있는 값이라면
					continue;  // 무시
				} else {  // 임시저장된 값이 배열에 없는 값이라면
					al.add(randomNum);  // 배열에 저장
				}
			}
		}
		
		Collections.sort(al);  // 베열에 있는 수를 오름차순으로 정렬
		System.out.println(al);  // 배열에 있는 값 출력
	}
}
