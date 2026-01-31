package info;

import java.util.Scanner;

// 회원의 정보를 입력 받고 출력하는 클래스 작성
// 단, MemberInfo라는 클래스를 사용한다. - new해서 사용한다.
// 정보는 키보드로 입력 받는다.
public class MemberInfoMain {

	// 키보드로 입력 받는 클래스 생성
	// Sca - Ctrl + sp : 자동 입력을 사용한다. - import가 자동으로 코딩된다.
	// 다른 곳의 클래스를 사용하려면 import를 해야만 한다. 가져다가 코딩할 때 사용한다.
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 선언
		// 클래스를 메인 메모리에 올려야 사용가능하다. 생성한다.(new 사용) MemberInfo() - 생성할 때 사용되는 생성자
		// = 왼쪽을 정리해서 하나가 나온다. 나오는 것은 주소가 나오는데 주소를 member1 에 저장한다.
		MemberInfo member1 = new MemberInfo();
		System.out.println(member1);
		
		// 회원의 사는 지역 세팅
		System.out.print("사는 지역 : ");
		// scanner.nextLine() : 엔터 친데까지 키보드로 입력받자.
		// 받은 데이터를 member1안에 location 변수에 저장하자.
		member1.location = scanner.nextLine();
		System.out.print("태어난 년도 : ");
		// 받은 데이터를 member1안에 birth 변수에 저장하자. -> 반드시 숫자만 입력하셔야만 합니다.
		member1.birth = Integer.parseInt(scanner.nextLine());
		// 받은 데이터를 member1안에 name 변수에 저장하자.
		System.out.print("이름 : ");
		member1.name = scanner.nextLine();
		
		System.out.println("지역 : " + member1.location);
//		System.out.println("나이 : " + (2025 - member1.birth));
		System.out.println("나이 : " + member1.getAge());
		System.out.println("이름 : " + member1.name);
	}

}
