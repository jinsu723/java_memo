package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class LottoSet {
	public static void main(String[] args) {
		
		// HashSet<Integer> hs = new HashSet<>();
		// hs.add(rd.nextInt(1, 45));
		// 배열에 랜덤한 값 넣기
		// 사이즈가 6이 될 때까지 반복한다
		// Collections.sort()를 사용하기 위해
		// ArrayList 객체에 HashSet 객체를 넣어서 새로운 객체를 선언한다
		// 배열에 저장된 값을 오름차순으로 정렬하여 출력
		
		
		// 정수형만 받는 HashSet 객체 생성 정수형 값만 들어올 수 있다
		HashSet<Integer> hs = new HashSet<>();
		Random rd = new Random();  // 랜덤 클래스 import
		
		// 배열의 크기가 6이 될 때가지 반복한다
		while(hs.size() < 6) {
			hs.add(rd.nextInt(1, 45));  // 배열에 랜덤한 값을 저장
			// HashSet은 중복되는 값을 무시하기 때문에 중복검사가 따로 필요하지 않다
		}
		
		// 인덱스 번호가 따로 없는 HashSet의 객체를 ArrayList 배열에 넣어서
		// 인덱스 번호를 지정해준다
		ArrayList<Integer> l = new ArrayList<>(hs);
		Collections.sort(l);  // 배열에 저장된 값을 오름차순으로 정렬
		System.out.println(l);  // 결과 출력
		
	}
}
