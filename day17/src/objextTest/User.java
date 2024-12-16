package objextTest;

public class User {

	// 필드
	int userNumber;
	String userName;
	
	// 기본 생성자
	public User() {
		super();
	}
	
	// 생성자 오버로딩
	public User(int userNumber, String userName) {
		super();
		this.userNumber = userNumber;
		this.userName = userName;
	}

	// toString 오버라이딩
	@Override
	public String toString() {
		return "User [userNumber = " + userNumber + ", userName = " + userName + "]";
	}

	// hashCode 오버라이딩
	@Override
	public int hashCode() {
		return this.userNumber;
	}

	
	// equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
		// 자기자신과 비교하는 경우
		if(this == obj) {
			return true;
		}
//		// null과 비교하는 경우
//		if(this == null) {  // 어차피 null이면 fasle라 없어도 되는 코드임
//			return false;
//		}
		// 유저 번호가 일치하는 비교하는 경우
		if(obj instanceof User) {
			User user = (User)obj;
			if(user.userNumber == this.userNumber) {
				return true;
			}
		}
		return false;
	}
	
	
}
