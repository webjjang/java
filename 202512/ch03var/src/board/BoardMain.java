package board;

import java.util.Scanner;

public class BoardMain {

	// 키보드로 입력 받는 객체 - Scanner
	// Scanner를 사용하려면 메인 메모리에 올린다(생성)
	// 참조형 변수 - 주소
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// System.out.println(scanner.hashCode());
		// 데이터 처리를 위한 BoardVO 객체를 생성한다.
		BoardVO boardVO = new BoardVO();
		// 일반 게시판의 내용을 키보드로 입력 받는다.
		System.out.print("글번호 : ");
		// 입력 받은 문자열을 long 타입으로 변경해서 저장한다.
		boardVO.no = Long.parseLong(scanner.nextLine());
		
		System.out.print("제목 : ");
		// 입력 받은 문자열을 저장한다.
		boardVO.title = scanner.nextLine();
		
		System.out.print("작성자 : ");
		// 입력 받은 문자열을 저장한다.
		boardVO.writer = scanner.nextLine();
		
		// 데이터 출력
		System.out.println("글번호 : " + boardVO.no);
		System.out.println("제목 : " + boardVO.title);
		System.out.println("작성자 : " + boardVO.writer);
		
	}
}
