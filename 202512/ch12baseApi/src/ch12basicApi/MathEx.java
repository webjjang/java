package ch12basicApi;

import java.util.Arrays;
import java.util.Random;

public class MathEx {

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
		
		int [] lottos = new int[6];
		// 6개의 숫자를 랜덤으로 받아서 저장한다. 단, 숫자는 중복되면 안된다. 반복문 작성
		for(int i = 0; i< lottos.length ; ++i) {
			int r = random.nextInt(45) + 1;
			lottos[i] = r; // 중복이 된 경우 이전 데이터에 덮어쓰기가 된다.
			// 중복을 판단하는 변수 선언
			// boolean dupCheck = true; // 중복되지 않았다.
			// 입력된 데이터(i-1 까지 배열) 중복 여부를 확인한다.
			for(int j = 0; j <= i-1; j++) {
				// 중복된 경우의 처리
				if(lottos[j] == r) {
					// 중복이 되는 경우 위로 올라가면 ++i 때문에 다음 위치가 되는데 같은 위치에
					// 갈수 있도록 조정해야만 한다.같은 위치에 램덤 숫자를 받게하기 위해서 -1 해준다.
					i--; 
					// dupCheck = false;
					break;
				}
			}
			// if(dupCheck) lottos[i] = r; // 중복이 안되면 데이터를 넣는다.
			
		}
		
		// 로또 번호 출력 - 오름차순 정렬을 해서 출력하시오.
		// 오름차순 정렬 - Arrays.sort() 사용해라. 배열 출력 - Arrays.toString()활용
		Arrays.sort(lottos); // 원본 데이터의 순서가 바뀐다.
		System.out.println(Arrays.toString(lottos)); // 로또 데이터 출력
		
	}

}
