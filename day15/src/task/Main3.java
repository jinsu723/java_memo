package task;

public class Main3 {
	public static void main(String[] args) {
		
		System.out.println("F를 입력 : " + subPoint("F").getMsg("ABCDEFG", "가나다"));
		System.out.println("B를 입력 : " + subPoint("B").getMsg("ABCDEFG", "가나다"));
		
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	static SubInter subPoint(String word) {
		if(word.equals("F")) {
			SubInter si = (msg1, msg2) ->  {
				char[] msgAr1 = new char[msg1.length()];
				for(int i=0; i<(msg1.length()-msg2.length()); i++) {
					msgAr1[i] = msg1.charAt(i);
				}
				return msgAr1.toString();
			};
			return si;
		} else if(word.equals("B")) {
			SubInter si = (msg1, msg2) -> {
				char[] msgAr1 = new char[msg1.length()];
				for(int i=msg2.length(); i<msg1.length(); i++) {
					msgAr1[i-msg2.length()] = msg1.charAt(i);
				}
				return msgAr1.toString();
			};
			return si;
		} 
		SubInter si = (msg1, msg2) -> "잘못 입력함";
		return si;
	}

}
