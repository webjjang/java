package ch14generic;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

//	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 데이터만 사용해보자.
		// 문자열 입력을 강제시킨다. 이유 - list 객체 안에 저장하는 변수의 타입이 제네릭은 선언한
		// String으로 코드가 변경된다.(컴파일 할 때)
		List<String> list = new ArrayList<>();
		// 정상 적인 데이터 추가시키기
		list.add("홍길동");
		// 비정상 데이터 추가시키기\
		// list.add(123);
		
		for(int i = 0; i < list.size(); i++) {
			// 데이터 꺼내기 - 타입은 Object - 모든 데이터 타입
			System.out.println(list.get(i));
			// 데이터를 꺼내서 첫번째 글자 출력해보기
			// 꺼내면 데이터는 Object인데 안에 String을 넣어 놨다. Casting 가능
			System.out.println(((String)list.get(i)).charAt(0));
		}
		
	}

}
