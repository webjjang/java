package ch08inherit;

public class MemberMain {

	public static void main(String[] args) {

		Member member = new Member();
		// 데이터 세팅
//		member.name = "이영환";
//		member.tel = "010-1111-2222";
		member.setName("이영환");
		member.setTel("010-1111-2222");
		// 모든 클래스는 Object라는 클래스를 아무 상속 정의 없이 강제 상속 받게 되어 있다.
		System.out.println(member);
		System.out.println(member.toString());
		System.out.println
		(member.getClass().getName() + "@" + Integer.toHexString(member.hashCode()));
		
		print(member);
		printInfo(member);
		
		System.out.println(member instanceof Student);
		if(member instanceof Student)
			print((Student) member); // Member안에 순수한 Member가 들어 있으면 캐스팅 오류가 난다.
		
		Student student = new Student();
		student.setHakbun("202601011");
		student.setName("홍길동");
		student.setTel("010-1111-2222");
		System.out.println(student);
		print(student);
		printInfo(student);
		
		member = student; // 자동 캐스팅
		print((Student) member); // 강제 캐스팅
	} // main() 의 끝
	
	// 이름과 연락처를 출력하는 메서드
	public static void print(Member member) {
		System.out.println("이름 : " + member.getName());
		System.out.println("연락처 : " + member.getTel());
	} // Member를 출력하는 print()의 끝
	
	// 학번과 이름을 출력해 보자.
	public static void print(Student student) {
		System.out.println("학번 : " + student.getHakbun());
		System.out.println("이름 : " + student.getName());
	} // Student를 출력하는 print()의 끝

	// 회원, 학생의 객체를 받아서 특성에 따라서 출력하는 메서드 작성
	public static void printInfo(Member member) {
		System.out.println("MemberMain.printInfo() --------------------------------");
		if(member instanceof Student) {
			// Student로 강제 캐스팅
			Student student = (Student) member; 
			// 학생 정보 출력
			System.out.println("학번 : " + student.getHakbun());
			System.out.println("이름 : " + student.getName());
		} else {
			// 회원 정보 출력
			System.out.println("이름 : " + member.getName());
			System.out.println("연락처 : " + member.getTel());
		}
	}
	
} // 클래스의 끝
