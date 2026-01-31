package ch13cllection;

import java.util.HashMap;
import java.util.Map;

public class ServiceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 일반 게시판 리스트 실행
		run(new BoardListService());
		// 일반 게시판 글보기 실행
		run(new BoardViewService());
		
		// url에 따라서 실행되는 프로그램을 선택해서 실행하는 프로그램 작성
		String url = "/board/view.do";
		
		// map<url, Service>
		Map<String, Service> serviceMap = new HashMap<>();
		// 데이터 넣기
		serviceMap.put("/board/list.do", new BoardListService());
		serviceMap.put("/board/view.do", new BoardViewService());
		run(serviceMap.get(url));
	} // main()의 끝
	
	// Service를 실행하는 메서드
	public static void run(Service service) {
		service.service();
	}

} // 클래스의 끝
