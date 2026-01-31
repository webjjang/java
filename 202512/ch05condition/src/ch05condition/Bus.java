package ch05condition;

import java.util.Scanner;

//* 버스요금 계산하기
//- 연령에 따른 요금 계산
//0~7 : 무료
//8~13 : 550원
//14~19 : 900원
//20~64 : 1550원
//65 이상 : 무료
//0미만인 경우: 입력 오류
//** 나이를 입력 받아서 요금을 계산하시오.
//if ~ else if ~~~~ else
//
//1. 나이를 입력 받는다.
//2. 요금을 계산  (if ~ else if ~~~ else)
//3. 결과를 출력한다.

public class Bus {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 나이를 입력 받는다. String을 int로 변환해서 저장
		System.out.print("나이를 입력하세요.");
		int age = Integer.parseInt(scanner.nextLine());

		// 요금 결과 저장 변수 선언
		String result;
		
		// 2. 요금 계산
		if(age < 0) result = "입력 오류";
		else if(age < 8) result = "무료";
		else if(age < 14) result = "550 원";
		else if(age < 20) result = "900 원";
		else if(age < 65) result = "1,550 원";
		else result = "무료";
		
		// 3. 출력
		System.out.println("지불해야할 버스비는 " + result + "입니다.");
	}

}


