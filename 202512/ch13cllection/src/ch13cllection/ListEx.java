package ch13collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// 데이터 여러개를 처리 - 배열 보다 향상 프로그램을 만들어 놨다.
		// List : ArrayList, LinkedList ...
		// <E> 제네릭 - 들어가는 데이터의 타입을 밖에서 지정해서 타입에 해당되는 데이터나 저장할 수 있도록 한다.
		// 정수 Integer만 저장하도록 한다. E -> Integer
		List<Integer> list = new ArrayList<>();
		// 데이터 넣기
		list.add(100);
		list.add(88);
		System.out.println(list);
		// 들어가 있는 데이터의 개수 출력
		System.out.println(list.size());
		// 데이터를 한개씩 꺼내서 처리
		for(int i = 0;i < list.size(); i++)
			System.out.println(list.get(i));
		// 들어 있는 모든 데이터 처리
		for(Integer data : list) System.out.println(data);
		
		// 여러개의 게시판 데이터 넣기
		List<BoardVO> boardList = new ArrayList<>();
		for(int i = 1; i <= 3; i++) {
			// BoardVO 생성
			BoardVO vo = new BoardVO();
			// vo 데이터 저장
			vo.setNo(i);
			vo.setTitle("제목 " + i);
			vo.setWriter("이름 " + i);
			// list에 vo를 넣기
			boardList.add(vo);
		}
		
		// 일반 게시판 리스트 출력
		for(BoardVO vo :  boardList) {
			System.out.print(vo.getNo() + "/" + vo.getTitle() + "/" + vo.getWriter());
			System.out.println();
		}
		
	} // main()의 끝
} // 클래스의 끝



