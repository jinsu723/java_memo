package innerTest;

// 1번 : 내부 클래스와 외부 클래스 객체화

public class Main {
	public static void main(String[] args) {
		// 외부 클래스의 객체 생성
		Outer outer = new Outer();
		System.out.println("외부 클래스의 참조값 : " + outer);
		System.out.println("외부 클래스의 데이터 : " + outer.var1);
		
		// 내부 클래스의 객체 생성
		// 내부 클래스는 외부 클래스의 인스턴스를 통해 생성해야함
		Outer.Inner inner1 = outer.new Inner();
		System.out.println("내부 클래스의 참조값 : " + inner1);
		System.out.println("내부 클래스의 데이터 : " + inner1.var2);
		inner1.innerMethod();
		outer.outerMethod();
		
		Outer.Inner inner2 = new Outer().new Inner();
		
//		Inner inner = new Inner();
	}
}
