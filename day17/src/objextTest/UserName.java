package objextTest;

public class UserName {
	public static void main(String[] args) {
		User user1 = new User(1, "짱구");
		User user2 = new User(1, "짱구");
		
		System.out.println(user1);
		System.out.println(user2.toString());
		
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
		
		System.out.println(user1 == user2);
		// 원랜 false인데 equals를 오버라이딩으로 재정의해서 true가 나옴
		System.out.println(user1.equals(user2));
		
		// 자기 자신과 비교하는 경우
		System.out.println(user1.equals(user1));
		// 객체와 null 비교하는 경우
		System.out.println(user1.equals(null));
		// 유저 번호가 일치하는지 비교하는 경우
		System.out.println(user1.equals(user2));
		System.out.println(user1 == user2);
		
		System.out.println(user1.equals(new User(1, "철수")));
		System.out.println((new User(1, "철수")) instanceof User);
	}
}
