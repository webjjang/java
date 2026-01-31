package board;

import java.util.Scanner;

public class BoardController {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// url을 입력 받는다.
		System.out.print("서비스 url 입력 -> ");
		String url = scanner.nextLine();
		
		// url 처리
		switch (url) {
		case "/board/list.do":
			System.out.println("일반게시판 리스트가 처리되었습니다.");
			break;

		case "/board/view.do":
			System.out.println("일반게시판 글보기가 처리되었습니다.");
			break;

		case "/board/write.do":
			System.out.println("일반게시판 글등록이 처리되었습니다.");
			break;
			
		default:
			System.out.println("요청하신 페이지가 존재하지 않습니다.");
			break;
		}
		
		// --- 기본 자바만 가지고 코딩하는 방법
		// 메뉴 번호를 입력 받는다.
		System.out.println("1. 리스트  2. 글보기  3. 글등록");
		System.out.print("메뉴 입력 ->");
		String menu = scanner.nextLine();
		
		// menu 처리
		switch (menu) {
		case "1":
			System.out.println("일반게시판 리스트가 처리되었습니다.");
			break;

		case "2":
			System.out.println("일반게시판 글보기가 처리되었습니다.");
			break;

		case "3":
			System.out.println("일반게시판 글등록이 처리되었습니다.");
			break;
			
		default:
			System.out.println("요청하신 페이지가 존재하지 않습니다.");
			break;
		}
		
	}

}
