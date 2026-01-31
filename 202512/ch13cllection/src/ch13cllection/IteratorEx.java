package ch13cllection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// list와 set 객체를 만들고 데이터 채우기(숫자 데이터만 넣자.-제네릭)
		List<Integer> list = new ArrayList<>(); // 여러개의 데이터
		Set<Integer> set = new HashSet<>();
		
		// 데이터 채우기
		for(int i = 1; i <=5 ; i++) {
			list.add(i); // 1~5
			set.add(i+5); // 6~ 10
		}
		
		// 출력
		System.out.println(list);
		System.out.println(set);
		
		// 순차적으로 데이터 한개씩 처리하고 싶다.
		// for(int a : list) System.out.println(a);
		
		// iterator 처리메서드 interatorPrint()를 사용하여 데이터 출력
		interatorPrint(list.iterator());
		// set -> iterator : 모든 데이터 출력
		// set.toArray() : 정렬을 할 때 배열로 바꾸면 Arrays.sort() 사용 가능
		// for(int a : set)System.out.println(a);
		interatorPrint(set.iterator());
	} // main()의 끝
	
	// private - 클래스 내에서만 사용. static - main()가 static이므로 바로 사용가능
	// iterator 프로그램 동작의 이해
	private static void interatorPrint(Iterator<Integer> it) {
		// iterator - hasNext() : 다음 데이터가 있으면 true가 리턴된다.
		while(it.hasNext()) {
			// next() - 다음 데이터로 가자
			System.out.println(it.next());
			// 출력한 현재 위치의 데이터 지우기
			it.remove();
		}
	}

} // 클래스의 끝
