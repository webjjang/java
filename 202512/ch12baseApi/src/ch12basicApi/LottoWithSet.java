package ch12basicApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoWithSet {

	public static void main(String[] args) {
		
		// Random 클래스를 이용한 로또 번호 만들기.
		Random random = new Random(); // 1 ~ 45 랜덤 숫자를 만들기 위한 객체 생성
		
		// 데이터 중복이 안되는 컬렉션이 Set을 생성해서 사용한다.
		// 제네릭 - 많은 데이터를 저장할 때 저장하는 데이터의 타입을 밖에서 선언해서 사용한다.
		Set<Integer> lotto = new HashSet<>();

		// 반복 처리 - lotto의 데이터 개수가 6이 되면 빠져 나간다.
		while(lotto.size() < 6) {
			// lotto set에 데이터를 넣는 add() 실행 - 데이터가 중복되면 덮어쓰기가 된다.
			lotto.add(random.nextInt(45) + 1);
		}
		
		// set 출력 (정렬이 안됐다.)
		System.out.println(lotto);
		// 배열로 만든다.
		Object[] arrLotto = lotto.toArray();
		// 배열의 데이터를 정렬 시킨다.
		Arrays.sort(arrLotto);
		// 배열을 출력한다.
		System.out.println(Arrays.toString(arrLotto));
		

	}

}
