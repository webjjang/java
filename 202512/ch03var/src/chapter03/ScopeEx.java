package chapter03;

public class ScopeEx {

	// 1-1 클래스 블럭 내에서 사용 가능한 변수
	//  클래스 안에 모든 메서드에서 사용이 가능하다.
	//  단, new해서 클래스를 생성해서 변수에 저장해서 변수이름.no 로 사용한다.
	//  전역 변수 = 맴버 변수 = 객체 변수 : new 로 클래스를 생성할 때 사용한다.
	// int no; 
	// 전역변수 = 맴버 변수는 변수 선언하면 변수를 만들고 기본 값으로 세팅해 준다.
	// 기본값 - 숫자 : 0, 문자 : ' ', boolean : false, 참조형 변수 : null
	//   초기화 시키지 않아도 사용할 때 오류가 나지 않는다.
	static int no; 
	
	public static void main(String[] args) {

		// 2-1 main 메서드 블럭 내에서 사용 가능한 변수 = 지역 변수
		// main()가 실행되면서 생긴다. main() 실행이 끝나면 사라진다.
		// 변수가 선언이되면 만들고 기본값은 넣지 않는다. - 초기화 시키지 않고 사용하면 오류 발생
		String name;
		
		// 위에 non-static no를 사용가능한가? 불가능
		// main은 자동으로 메모리에 올라간다. 그래서 no는 아직 보이지 않는다. no는 new해야 사용할 수 있다.
		// 결론적으로 static을 바로 사용 가능. non-static은 바로 사용 불가능
		
		// 메서드 안에 있는 지역 변수 name은 변수를 선언하고 반드시 초기화시켜야 출력할 수 있다.
		name = "이영환";
		System.out.println(name);
		System.out.println(no);
		
	}

}
