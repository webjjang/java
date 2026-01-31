package chapter03;

// 관련이 있는 데이터끼리 캐스팅이 가능하다.
public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 10;
		
		// int(4byte 숫자) -> long(8byte 숫자)
		// 작은 -> 큰 : 자동캐스팅 - 데이터 손실이 없다.
		long number2 = number;
		
		System.out.println(number2);
		
		// long -> int
		// 큰 -> 작은 : 강제캐스팅 - 데이터 손실이 있다.
		// (int) long숫자
		number = (int) number2;
		System.out.println(number);
	}

}
