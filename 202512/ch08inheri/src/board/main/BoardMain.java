package board.main;

import board.out.BoardOut;
import board.service.BoardWrite;
import board.vo.BoardVO;

public class BoardMain {

	public static void main(String[] args) {
		// 예외 처리
		try { // 정상 처리
			// 일반 게시판 데이터 받기
			BoardWrite boardWrite = new BoardWrite();
			BoardVO vo = boardWrite.write();
			
			// 받은 데이터 출력
			BoardOut boardOut = new BoardOut();
			boardOut.print(vo);
		} catch (Exception e) { // 예외 처리
			System.out.println("일반 게시판 처리 중 오류 발생~~~~.");
		}
		
		System.out.println("프로그램 종료~~~");
	} // main()의 끝 
	
}
