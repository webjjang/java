package ch11exception;

import java.util.Scanner;

public class UserExceptionEx {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			// 점수를 입력 받습니다. (int : 0~100)
			int score = getInt("점수 입력");
			// if(score < 0 || score > 100) System.out.println("점수의 범위를 벗어났습니다.");
			if(score < 0 || score > 100) throw new OutOfScoreException();
			System.out.println("점수 : " + score);
		} catch (OutOfScoreException e) {
			System.out.println(e.getMessage());
		}
	}
	
	// 숫자를 입력 받는 메서드
	static int getInt(String msg) {
		// 숫자를 입력할 때까지 무한 반복
		while(true) {
			// 숫자가 아니면 예외처리를 하고 반복한다.
			try {
				System.out.print(msg + " -> ");
				return Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				System.out.println("숫자만 입력하셔야 합니다.");
			} // try ~ catch의 끝
		} // while 무한 반복의 끝 - 숫자가 입력되면 return
	}// getInt()의 끝
	
}// 클래스의 끝
