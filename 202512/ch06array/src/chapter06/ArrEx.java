package chapter06;

import java.util.Arrays;

// Array Example - 배열예제
public class ArrEx {

	public static void main(String[] args) {
		// 배열 - 참조형 변수 : 주소로 운영
		//  생성해서 사용한다. - static, new
		// [] 배열 - 문자열 배열 : [5] 5개 만든다.
		// 인덱스 : 0~4, 길이 : length
		String[] arrStr = new String[5];
		// null 참조형 변수가 주소가 없는 상황
		System.out.println(arrStr[0]);
		// 0번째에 이름 입력
		arrStr[0] = "이영환";
		System.out.println(arrStr[0]);
		// 배열의 모든 데이터를 출력해보자 - 확인용
		System.out.println(Arrays.toString(arrStr));
		System.out.println(arrStr.length);
		// 배열의 모든 데이터를 한개씩 출력 - 배열의 모든 데이터를 처리하자.
		for(int i = 0; i < arrStr.length; i++) System.out.println(arrStr[i]);
		
		
		// 이미 데이터가 모두 있는 경우 초기값 세팅할 때만 new 배열의 타입[]을 생략할 수 있다. 데이터는 {}
		String[] arrStr2 = {"이영환","홍길동","손흥민"};
		System.out.println(Arrays.toString(arrStr2));
		for(int i = 0; i < arrStr2.length; i++) System.out.println(arrStr2[i]);
		
	}
	
}
