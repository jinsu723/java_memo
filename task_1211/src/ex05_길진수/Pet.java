package ex05_길진수;

public class Pet extends Animal{
	
	// 이름 받아 초기화
	// 행동 출력 메소드 3개
	// 행동 오버라이딩 하여 출력
	
	public Pet(String name){  // 동믈의 이름을 매개변수로 하는 생성자 선언
		super(name);  // 겹치는 코드를 줄이기 위해 부모의 생성자로 보낸다
	}
	
	void play() {  // 놀기 메소드 선언
		System.out.println(this.name + "이(가) 놀고있습니다.");  // 객체가 놀고있음
		// 이름의 접근제한자가 protected => 같은 페키지이면서 상속받았기 때문에 호출 가능
	}
	
	void eat() {  // 먹기 메소드 선언
		System.out.println(this.name + "이(가) 밥을 먹습니다.");  // 객체가 식사중
	}
	
	void sleep() {  // 잠자기 메소드 선언
		System.out.println(this.name + "이(가) 잠을 잡니다.");  // 객체자 잠을 자고있음
	}

	@Override  // 부모 클래스의 메소드를 오버라이딩 하였음
	void performAction() {  // 행동을 일괄 출력해주는 메소드
		this.play();  // 놀기 메소드 호출
		this.eat();  // 먹기 메소드 호출
		this.sleep();  // 잠자기 매소드 호출
	}
	
}
