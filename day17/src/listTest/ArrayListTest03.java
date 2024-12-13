package listTest;

import java.util.ArrayList;

public class ArrayListTest03 {
	public static void main(String[] args) {
//		List<Integer> l = new ArrayList<>();  // 업캐스팅
		ArrayList<Integer> li = new ArrayList<>();
		
		// 추가
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		System.out.println(li);
		
		// 값 가져오기 : index 번호로 특정 값 가져오기
//		System.out.println(li.get(0));
//		try {
//			System.out.println(li.get(10));
//		} catch (Exception e) {
//			System.out.println("범위를 벗어났습니다");
//		}
		
		// 삭제 : index번호(int 타입)
		// 삭제한 요소를 반환
		System.out.println("인덱스 1의 값 : " + li.remove(1) + "을 삭제했습니다");
		System.out.println(li);
		
		// 삭제 : 값으로 검색하여 삭제(Object 타입)
		// 삭제 성공 유무를 반환
		System.out.println("값 : " + li.remove(Integer.valueOf(50)));
		System.out.println(li);
		
		// 포함 여부 검사 : 리스트에 존재하면 true, 없으면 false
		System.out.println(li.contains(40));
		System.out.println(li.contains(100));
		
		// 수정
		System.out.println(li);
		System.out.println(li.set(2, 50));  // 수정당하는 값을 출력
		System.out.println(li);
	}
}
