package chapter07;

public class Member {

	// --- static 초기화 블록 ---
	// 주로 static 변수에 고정된 값을 세팅할 때 사용
	static {
		System.out.println("static 초기화 블록 : 클래스가 맨처리 호출되면 딱한번 실행된다.");
		className = "Member";
	} // static 초기화 블록의 끝
	
	// 사용하는 방법 - 클래스이름.변수이름 : Member.className
	static String className;
	
	// 초기화 블록
	// 주로 non-static 변수에 고정된 값을 세팅할 때 사용한다.
	{
		System.out.println("초기화 블록 : new 할 때마다 실행된다.");
		// 기본 초기값을 홍길동으로 만들어 놓고 다음에 바꾸자.
		name = "홍길동";
	}  // 초기화 블록의 끝
	// 객체변수.name
	String name;
	String tel;
	
	// 생성자 - 특별한 메서드 : 생성(new)할 때 딱한번 사용하고 쓰지 않는다. 주소가 나온다.
	// 주로 외부에서 값을 전달받아서 초기화시킬 때 사용한다.
	// 기본 생성자 - 전달되는 값이 없고 처리가 없다. 그래서 생략할 수 있다. 생성자가 없으면 컴파일러가 생성
	public Member() {
		System.out.println("기본 생성자 호출 실행");
	} // 기본 생성자 끝
	
	// 전달받은 데이터로 변수 초기화 시킬 때 - 이름을 받아서 초기화 시켜보자.
	public Member(String name) {
		// this(); // 생성자의 맨 처음에 나타나는 this() - Member() : 기본 생성자를 호출해성 생성하고
		System.out.println("생성자를 이용해서 name 변수에 전달 받은 값을 세팅한다.");
		// this는 자신의 객체를 의미한다.
		this.name = name;
	} // 생성자 Member(String name)의 끝
	
	// 전달 받는 데이터가 이름, 연락처를 가지고 변수 셋팅
	public Member(String name, String tel) {
		this(name);
		System.out.println("생성자를 이용해서 name, tel 변수에 전달 받은 값을 세팅한다.");
		// this.name = name;
		this.tel = tel;
	} //생성자 Member(String name, String tel)의 끝
	
} // 클래스의 끝
