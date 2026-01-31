package ch04op;

public class OneOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 단항 연산자 예제
		int a;
		a = 10;
		System.out.println("" + (a++) + "," + (++a) + "," + (a++));
		System.out.println(a);
		
		// 삼항 연산자 = 조건 연산자
		// 조건 ? T값 : F값
		int score = 80;
		// 만약에 점수가 60이상이면 합격을 미만이면 불합격을 출력하시오.
		if(score >= 60) System.out.println("합격");
		else System.out.println("불합격");
		// 삼항 연산자
		System.out.println((score >= 60)?"합격":"불합격");
		// 대입 연산자
		int b, c, d;
		a= b= c= d = 10;
		// 비교 연산자 ==, instanceof : 클래스 타입이 같은지 비교할 때
		String name = "이영환";
		// name 변수가 String 타입입니까?
		System.out.println(name instanceof String);
		
	}

}
