package chapter07;

public class MemberMain {

	public static void main(String[] args) {
		System.out.println("main 메서드 시작");
		System.out.println(Member.className);

		// 생성을 2번 실행 - 저장 하려면 2개의 변수 사용. 한개만 사용하면 덮어쓰기가 된다.
		Member m = new Member();
		Member m2 = new Member();
		
		// 객체 출력 - hashCode : 데이터 주소 관련 16진수 숫자 출력 - 타입@해쉬코드
		System.out.println(m);
		System.out.println(m.name);
		System.out.println(m2);
		
		// 객체의 라이프 사이클 확인 - 생성자 확인
		Member m3 = new Member("이영환");
		System.out.println(m3.name);
		
		// 이름과 연락처를 전달 받아서 객체를 생성하는 생성자 호출
		Member m4 = new Member("안세영", "010-1111-2222");
		
		System.out.println(m4.name);
		System.out.println(m4.tel);
		
	} // main()의 끝

} // 클래스의 끝
