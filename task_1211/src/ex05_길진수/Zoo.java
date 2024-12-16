package ex05_길진수;

public class Zoo {

	// 필드 선언 객체 배열
	// 필드 동물의 수 저장
	// 생성자 배열 크기를 받아 초기화
	// 메소드 동물 각 인덱스에 넣기
	// 메소드 행동 출력

	Animal[] animals;  // 배열 필드 선언
	int animalCount;  // 동물의 수를 새어줄 정수형 필드 선언

	// 매개변수를 받아 배열의 크기를 초기화 하는 것을 빼놓고 하고있었습니다
	public Zoo(int num) {  // 배열의 크기를 초기화 해줄 생성자 선언
		animals = new Animal[num];  // 배열의 크기를 초기화한다
	}

	// 배열에 업캐스팅을 해서 값을 넣어야 하는 것을 생각하지 못했습니다
	void addAnimal(Animal a) {  // 동물을 배열에 집어넣기 
		// Cat클래스에서 Animal클래스로 업캐스팅되어 들어온다 -> 자동 형변환
		if(animalCount == 3) {  // 변수가 0부터 시작하기 때문에 3이 되면 멈춘다
			System.out.println("더 이상 동물을 추가할 수 없습니다");  // 경고 메시지 출력
			return;  // 강제종료
		}
		if (animalCount <= animals.length) {  // 배열에 남은 자리가 있는지 확인
			animals[animalCount] = a;  // 배열에 객체를 저장한다
			System.out.println(animals[animalCount].name);  // 배열에 동물이 잘 들어갔는지 확인
			animalCount++;  // 동물의 수를 카운트 중복 인덱스 방지, 3마리 이상 들어오는 것을 방지한다
		}
	}

	void printAllAction() {  // 모든 객체 행동 일괄 출력
		for (Animal ani : animals) {  // 배열에 저장된 객체들을 순차적으로 내보낸다
			ani.performAction();  // 해당 객체 행동 일괄 출력
//			System.out.println(ani);
		}
	}
}
