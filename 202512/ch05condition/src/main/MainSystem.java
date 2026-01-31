package main;

import java.util.Scanner;

public class MainSystem {
	
	// 키보드로 입력 받는 객체 선언 - 생성 저장
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 초기 인사
		System.out.println("한양여자대학교 시스템에 오신 것은 환영합니다.");
		// 메인 메뉴 처리 무한 반복
		while(true) {
			// 메인 메뉴 출력
			System.out.println("<메인 메뉴>");
			System.out.println("-----------------------------");
			System.out.println(" 1. 일반 게시판   0. 프로그램 종료");
			System.out.println("-----------------------------");
			// 메인 메뉴 입력
			System.out.print("메뉴 선택 -> ");
			String menu = scanner.nextLine();
			// 메인 메뉴 처리
			switch (menu) {
			case "1":
				//System.out.println("일반 게시판 처리");
				boardLoop:
				while(true) {
					// 일반 게시판 메뉴 출력
					System.out.println("<일반 게시판>");
					System.out.println("1. 리스트   0. 이전 메뉴");
					// 일반 게시판 메뉴 입력
					System.out.print("메뉴 선택 -> ");
					menu = scanner.nextLine();
					// 일반 게시판 메뉴 처리
					switch (menu) {
					case "1":
						System.out.println("-- 일반 게시판 리스트 처리");
						break;

					case "0":
						// switch, for, while 문을 빠져 나감.
						break boardLoop;
						
					default:
						System.out.println("* 잘못된 메뉴를 선택 하셨습니다. 1,0번을 선택하세요.*");
						break;
					} // 일반 게시판 메뉴 처리 switch 끝
				} // 일반 게시판 처리 무한 반복 while 끝
				
				break;
			
			case "0":
				System.out.println("*** 프로그램을 종료 합니다. ***");
				// 자바 프로그램을 완전히 종료
				System.exit(0);

			default:
				System.out.println("* 잘못된 메뉴를 선택 하셨습니다. 1,0번을 선택하세요.*");
				break;
			} // 메인 메뉴 처리 switch의 끝
		}// 메인 메뉴 무한 반복 while의 끝
		
	} // main()의 끝
} // 클래스의 끝
