// 관련있는 프로그램을 묶어서 관리 패키지(=폴더)를 만든다.
package charter05;

// 처리할 때 관련 있는 것끼리 묶어서 선언
// 클래스의 이름 대문자로 시작한다.
// public 외부에서 같이 사용할 수 있다.
public class SwitchEx {

	// static : 자동으로 올라간다. SwitchEx.main()
	// 자바에서 맨 처음 실행되는 메서드()
	public static void main(String[] args) {

		// 주사위 숫자
		int number = 3;
		
		// 주사위 숫자 판별 처리
		// if / switch문 가능
		// if문 - 연속된 데이터 비교(>, <), 1번만 비교
		// switch문 - 비연속 데이터 비교(==), 여러개의 데이터와 비교
		// switch(비교 데이터:변수){ case 비교값: -> 라벨을 이용해서 이동 위치를 잡는다.
		// switch문으로 사용되는 데이터는 모두 가능하다. 자바6이상은 String된다.
		switch (number) {
		case 1:
			System.out.println("1번");
			// break - 멈춤. 빠져나간다. switch, for, while 문을 빠져 나간다.  if 문은 아님
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;

		default:
			System.out.println("6번");
			break; // 마지막 break는 의미가 없다.
		}
		
	}

}
