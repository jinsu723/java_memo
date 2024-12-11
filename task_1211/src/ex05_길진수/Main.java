package ex05_길진수;

public class Main {
	public static void main(String[] args) {
		
		// 객체를 선언하고 배열의 크기를 보내 초기화
		// 각 객체 생성
		// 행동 일괄 출력
		
		Zoo z = new Zoo(3);  // 객체를 생성하고 배열의 크기를 3으로 초기화 한다
		z.addAnimal(new Pet("얼룩말"));  // 업캐스팅 배열에 동물을 넣는 메소드 호출
		z.addAnimal(new Pet("사자"));  // 업캐스팅 배열에 동물을 넣는 메소드 호출
		z.addAnimal(new Pet("기린"));  // 업캐스팅 배열에 동물을 넣는 메소드 호출
		z.addAnimal(new Pet("고릴라"));  // 업캐스팅 배열에 동물을 넣는 메소드 호출
		
		z.printAllAction();  // 행동을 일괄 출력
		

	}
}
