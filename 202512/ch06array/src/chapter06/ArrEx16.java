package chapter06;

public class ArrEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 선언 초기값 할당
		int[] arrInt = {1,2,3,4,5};
		// 출력
		System.out.println(arrInt);
		// for문과 length와 index를 이용해서 모든 데이터를 출력해보자.
		for(int i=0; i < arrInt.length; i++) System.out.println(arrInt[i]);
		// 향상된 for문을 이용해 보자.
		// 배열이 같은 타입이 모여 있으므로 한개를 꺼내서 변수에 저장해 놓고 처리한다.
		// 더 이상 꺼낼 데이터가 없으면 반복문을 종료한다.
		for(int number : arrInt) System.out.println(number);
		
		// 비연속 데이터의 처리 - 요일을 요일의 숫자를 받아서(0~6) 처리
		// 0:일, 1:월 - 변수 day
		int day = 1; // 월 -> 배열을 사용해보자.
		String [] days = {"일","월","화","수","목","금","토"};
		System.out.println(days[day]);
		
		// if문 처리
		if(day == 0) System.out.println("일");
		else if(day == 1) System.out.println("월");
		else if(day == 2) System.out.println("화");
		else if(day == 3) System.out.println("수");
		else if(day == 4) System.out.println("목");
		else if(day == 5) System.out.println("금");
		else if(day == 6) System.out.println("토");
	}

}
