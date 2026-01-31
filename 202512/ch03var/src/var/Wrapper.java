// package - 꾸러미, 묶음 : 종류 별로 관리 - 폴더
// var : 패키지 명 - 변수 처리 클래스를 저장 
//  - 패키지 명은 모두 소문자로 만든다.
//  - 범위가 큰 것 부터 만들고 안에 작은 범위를 만든다. 그리고 . 으로 구분한다.
// 선언된 패키지의 위치와 클래스의 위치가 같아야만 한다.
package var;

//public - 공공의. 같이 사용가능 : 다른 곳에 있는 것도 작성하고 있는 프로그램을 사용하고 가져다 쓸 수 있어요.
//class - 클래스 : 같은 목적을 가지고 있는 모임
//Wrapper - 기본형 변수의 처리를 위한 랩퍼 클래스
//- 맨 앞자는 대문자로 시작하고 낙타표기법으로 작성
//{ 클래스 내용 } - 여러개를 한꺼번에 묶어 놓는다. 0 개 이상
public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자를 숫자로 변환 처리 또는 그 반대
		char c = '1';
		// String + int -> String
		// int + String -> String
		System.out.println("\'1\'의 코드 값 : " + ((int)c));
		System.out.println("49의 문자 : " + ((char)49));
		// char + int -> int
		System.out.println("\'1\' + 2 의 코드 값 : " + (c + 2));
		
		// 1. 정수 int의 최대 처리 숫자와 최소 처리 숫자를 표시하시오. 단, 랩퍼 클래스를 사용하세요.
		// Integer - 클래스
		// MAX_VALUE : 상수 변수 - 모두 대문자로 표시. 의미가 바뀌면 _ 사용
		// static - 클래스명.변수명 , 클래스명.메서드명()
		System.out.println("int의 최대 숫자 : " + Integer.MAX_VALUE);
		System.out.println("int의 최소 숫자 : " + Integer.MIN_VALUE);
		
		// 2. 숫자 47을 10, 2, 8, 16 진수로 출력해 보세요.
		int num = 47;
		System.out.println("10 진수 47을 10진수 : " + num);
		System.out.println("10 진수 47을 2진수 : " + Integer.toBinaryString(num));
		System.out.println("10 진수 47을 8진수 : " + Integer.toOctalString(num));
		System.out.println("10 진수 47을 16진수 : " + Integer.toHexString(num));
		
		// 
		int a;
		String s = "10";
		// 1. String -> int
		a = Integer.parseInt(s);
		// 2. int -> String
		Integer ca = a;
		System.out.println(ca.toString() + 10);
		System.out.println("" + a + 10);
		
	}

}





