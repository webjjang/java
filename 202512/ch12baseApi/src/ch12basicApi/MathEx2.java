package ch12basicApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MathEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Math.random 이용한 램덤 숫자 만들기 --------------
		// 랜덤의 시드값 - 시간 데이터로 진행한다.
		System.out.println("시간 데이터(시드) : " + System.nanoTime());
		// 랜덤 숫자 만들기 0.0 이상 1.0 미만 -> 시드값을 가지고 계산해서 만든다.
		double ran = Math.random();
		System.out.println(ran);
		// 로또 번호 1 ~ 45
		// 0.0 ~ 1.0 -> 1 ~ 45
		int rotto = (int)(ran * 45.0) + 1;
		System.out.println(rotto);
		
		// Random 클래스를 이용한 로또 번호 만들기.
		//Random random = new Random(42);
		Random random = new Random();
		System.out.println("시드 값 : 없음");
		// nextInt(45) : 0 ~ 44 번호를 받는다.
		System.out.println(random.nextInt(45) + 1);
		
		// 배열 처리
		int [] lottos = new int[6];
		// 6개의 숫자를 랜덤으로 받아서 저장한다. 단, 숫자는 중복되면 안된다. 반복문 작성
		for(int i = 0; i < lottos.length; i++) {
			lottos[i] = random.nextInt(45) + 1; // nextInt(45 개:0~44)
			// 중복 확인
			for(int j = 0; j <= i -1; j++) {
				if(lottos[i] == lottos[j]) {
					i--;
					break;
				} // if문의 끝
			} // 중복 확인 for j의 끝
		} // for i 의 끝
		
		// 로또 번호 출력 - 오름차순 정렬을 해서 출력하시오.
		Arrays.sort(lottos); // 정렬
		System.out.println(Arrays.toString(lottos));
		
		// Set 처리
		Set<Integer> setLottos = new HashSet<Integer>();
		
		while(setLottos.size() < 6) {
			setLottos.add(random.nextInt(45) + 1); // nextInt(45 개:0~44)
		}
		Object[] arrSetLottos = setLottos.toArray(); // set을 배열로 만들기
		Arrays.sort(arrSetLottos);
		System.out.println(Arrays.toString(arrSetLottos));
		
	}

}
