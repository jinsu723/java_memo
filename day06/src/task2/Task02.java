package task2;

import java.util.Random;
import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
//		문제 2. UP&DOWN 게임
//		   게임의 정답은 정해놓는다.
//		   사용자에게 1 ~ 50까지의 정수를 입력 받고, 입력 받은 값이 정답보다 크면 "DOWN!"을 출력한다
//		   정답보다 작으면 "UP"을 출력한다.
//		   정답이 아닐 경우 "값을 다시 입력해 주세요 : " 를 출력한 후, 값을 다시 입력 받는다.
//		   정답을 맞히면 "정답입니다 *번 째에 맞혔습니다!"를 출력하고 프로그램을 종료한다.
//		   단, 1 ~ 50까지의 정수 범위를 벗어나면 "1 ~ 50까지의 숫자만 입력해주세요 : " 를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		TaskMethod tm = new TaskMethod();
		Random rd = new Random();
		int randomNum = rd.nextInt(1, 50);  // 정답
		
		
		
		
	}
}
