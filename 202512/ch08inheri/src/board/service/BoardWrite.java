package board.service;

import java.util.Scanner;

import board.vo.BoardVO;

public class BoardWrite {

	Scanner scanner = new Scanner(System.in);
	
	// 데이터를 입력 받는 메서드를 작성한다.
	public BoardVO write() {
		// 저장객체 생성해서 저장해 놓는다.
		BoardVO vo = new BoardVO();
		
		// 생성된 저장 객체에 데이터 입력
		System.out.print("글번호 : ");
		vo.setNo(Long.parseLong(scanner.nextLine()));
		System.out.print("제목 : ");
		vo.setTitle(scanner.nextLine());
		System.out.print("내용 : ");
		vo.setContent(scanner.nextLine());
		System.out.print("작성 : ");
		vo.setWriter(scanner.nextLine());
		
		// 데이터가 입력된 저장 객체 리턴
		return vo;
	}
	
}
