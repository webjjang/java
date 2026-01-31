package ch13cllection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<>();
		
		// map.put("홍길동", 1234);
		String[] names = {"홍길동", "김유신", "이순신", "강감찬","김유신"}; // key로 사용.
		Integer[] nums = {1234,4567,2350,9870,2345};
		
		for(int i = 0; i < names.length; i++) map.put(names[i], nums[i]);
		System.out.println(map);
		
		// 홍길동의 번호를 알아보자
		String name = "홍길동";
		System.out.println(name + "=" + map.get(name));
		
		// boardVO - boardMap 처리 : 번호, 제목, 작성자.
		Map<String, String> boardMap = new HashMap<>();
		
		// 데이터 넣기
		boardMap.put("no", "10");
		boardMap.put("title", "map 사용법");
		boardMap.put("writer", "이영환");
		
		// 데이터를 꺼내서 출력해 보자.
		System.out.println("no = " + boardMap.get("no"));
		System.out.println("title = " + boardMap.get("title"));
		System.out.println("writer = " + boardMap.get("writer"));
		
	}

}
