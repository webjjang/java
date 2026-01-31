// package - 꾸러미, 묶음 : 종류 별로 관리 - 폴더
// info : 패키지 명 - 정보를 처리하는 클래스를 저장 
//  - 패키지 명은 모두 소문자로 만든다.
//  - 범위가 큰 것 부터 만들고 안에 작은 범위를 만든다. 그리고 . 으로 구분한다.
// 선언된 패키지의 위치와 클래스의 위치가 같아야만 한다.
package info;

import java.util.Scanner;

//public - 공공의. 같이 사용가능 : 다른 곳에 있는 것도 작성하고 있는 프로그램을 사용하고 가져다 쓸 수 있어요.
//class - 클래스 : 같은 목적을 가지고 있는 모임
//PrintInfo - 출력정보 : 클래스 이름
//- 맨 앞자는 대문자로 시작하고 낙타표기법으로 작성
//{ 클래스 내용 } - 여러개를 한꺼번에 묶어 놓는다. 0 개 이상
public class PrintInfoWithKeyin {

	// Ctrl + sp로 자동 완성 -> import 가 위에 자동 입력됩니다.
	static Scanner scanner = new Scanner(System.in);
	
	// public - 공공의. 같이 사용가능 : 다른 곳에 있는 것도 작성하고 있는 프로그램을 사용하고 가져다 쓸 수 있어요.
	// static - 고정된.
	//  - 모든 프로그램은 메인 메모리에 올라가야 실행가능하다. - 메모리에 올리는 작업 : 생성
	//  - 생성 : new 키워드 사용하면 프로그램으로 작성 가능 - 주로 변수로 저장해서 사용. 주소 바뀜
	//        : static 키워드 사용 클래스가 불려지면 자동으로 올라간다. 클래스이름.static이름. 그리고 안 내려옴.
	// void - 비어 있는. 없다. 리턴 타입(결과에 대한 타입). main을 부르면 결과는 없다. 실행하고 만다.
	// main - 주된. main 메서드() - 동작 기능을 작성해 놨다. : 처리문들이 있다.
	//  - 자바 프로그램의 처음 시작되는 부분. 프로젝트에서는 딱 한개만 만든다.
	//  - 실습을 위해 여러개를 만든 경우 열려져 있는 main부터 시작.  main 형식이 틀리면 이전 실행 성공한 프로그램이 실행.
	// main(){} - {} - 0개 이상의 처리문을 묶어서 한개로 정의
	// 리턴타입 메서드이름(){} - 메서드의 선언
	// (사용되는 데이터들을 저장하는 변수의 선언) 을 ,를 이용해서 전달받는다.
	// String - 끈, 이어져 있는 - 문자열(문자가 연결되어 있는 형태)
	//  - 문자 : '문자한개' -> 'a'
	//  - 문자열 - 0개이상의 문자들의 나열. "문자열", "", "a", "abc"
	// [] - 문자열 데이터 0개 이상 여러 개 -> 배열
	// args - arguments의 약자. 논쟁, 주제 - 판단하는 기준이 되는 데이터가 전달된다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		- 지역, 생년, 이름 저장
//		. 지역(location) : String
//		. 생년 (birth): int
//		. 이름(name) : String
//		- 지역, 나이(2025-생년), 이름 출력
//		 . 출력 형식 - 항목 이름 : 값
		// 변수 선언과 데이터 할당(저장)
		// 데이터를 여러번(2번 이상) 사용할 때는 반드시 변수를 사용해 주세요.
		// 키보드로 데이터를 입력 받는다. 처리문은 scanner.nextLine() 만 사용한다. 입력은 String 타입이 된다.
		// String -> int로 들어가지 않는다. 그래서 변환하는 프로그램을 작성하셔야만 합니다.
		System.out.print("지역 : ");
		// nextLine() : 입력하고 엔터 친데까지 한개의 문자열 데이터로 처리한다.
		String location = scanner.nextLine(); // scanner는 main이 static이므로 같은 statice이여야 보인다.
		System.out.print("태어난 년도 : ");
		int birth = Integer.parseInt(scanner.nextLine());
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		
		// 변수에 저장된 데이터를 꺼내와서 출력한다.
		System.out.println("지역 : " + location);
		System.out.println("나이 : " + (2025 - birth));
		System.out.println("이름 : " + name);
	}

}
