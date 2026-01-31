package ch14generic;

import java.util.Arrays;

public class GenericEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 타입이 지정이 안된(임시로 T로 선언) 저장 객체 사용해 보기
		Generic<String> gen = new Generic<>();
		
		// 데이터 넣어보기
		String [] s1 = {"홍길동", "이순신", "김유신"};
		gen.set(s1);
		
		// 데이터를 꺼내 보자.
		String[] ss = gen.get();
		System.out.println(Arrays.toString(ss));
		
		// gen의 T타입 변형 확인
		gen.print();
	}

}
