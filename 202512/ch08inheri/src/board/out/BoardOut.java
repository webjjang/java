package board.out;

import board.vo.BoardVO;

public class BoardOut {

	public void print(BoardVO vo) {
		System.out.println("=== 게시판 출력 ===");
		System.out.println("- 글번호 : " + vo.getNo());
		System.out.println("- 제목 : " + vo.getTitle());
		System.out.println("- 내용 : " + vo.getContent());
		System.out.println("- 작성자 : " + vo.getWriter());
	}
}
