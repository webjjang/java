package charter05;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		// 1부터 10까지 더해서 출력한다. 반복하는 횟수가 정해지면 for문 사용.
		// 반복에 사용되는 변수는 i,j,k, ... 로 사용한다.
		for(int i = 1; i <= 10; i++) sum += i;
		System.out.println(sum);
		
		// 초기값을 꺼내자.
		int i = 1;
		sum = 0;
		for(; i <= 10; i++) sum += i;
		System.out.println(sum);
		
		// 초기값과 증감을 꺼내자.
		i = 1;
		sum = 0;
		for(; i <= 10;) {
			// 실행
			sum += i;
			// 증감
			i++;
		}
		System.out.println(sum);

		// 초기값과 증감, 조건을 꺼내자.
		// 1. 초기값
		i = 1;
		sum = 0;
		for(;;) { // 무한 반복
			// 반복할 조건 -> 빠져나갈 조건 : 11이 되면 빠져 나간다.
			if(i > 10) break;
			// 실행
			sum += i;
			// 증감
			i++;
		}
		System.out.println(sum);
		
		// 기본 while(조건)
		// 1. 초기값
		i = 1;
		sum = 0;
		// 2. 반복할 조건 : 조건을 만족하는 동안 계속 실행
		while(i <= 10) {
			// 3. 처리
			sum += i;
			// 4. 증감
			i++;
		}
		System.out.println(sum);
		
		// 무한 반복 while 이용
		// 1. 초기값
		i = 1;
		sum = 0;
		// 2. 무조건
		while(true) {
			// 2. 빠져나갈 조건
			if(i > 10) break;
			// 3. 실행
			sum += i;
			// 4. 증감
			i++;
		}
		System.out.println(sum);
		
	}

}


