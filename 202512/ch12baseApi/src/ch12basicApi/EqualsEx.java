package ch12basicApi;

public class EqualsEx {

	public static void main(String[] args) {
		
		// 문자열 값을 직접 넣으면 주소를 만들어내는 메서드를 돌린다. 값을 주소로 해서 저장한다.
		String name1 = "이영환";
		String name2 = "이영환";
		System.out.println("name1 : " + name1);
		System.out.println("name2 : " + name2);
		System.out.println("name1의 hash : " + name1.hashCode());
		System.out.println("name2의 hash : " + name2.hashCode());
		System.out.println("name1의 system hash : " + System.identityHashCode(name1));
		System.out.println("name2의 system hash : " + System.identityHashCode(name2));
		System.out.println("name1 == name2 :" + (name1 == name2));
		
		// String 클래스를 생성해서 값을 넣는 방식.
		String name3 = new String("이영환");
		System.out.println("name3 : " + name3);
		System.out.println("name3의 hash : " + name3.hashCode());
		System.out.println("name3의 system hash : " + System.identityHashCode(name3));
		System.out.println("name1 == name3 :" + (name1 == name3));
		
		// 값이 같으면 같은 것으로 처리하기 위해 메서드 작성. Object의 equals()를 재정의해서 만들어 놨다.
		// 문자열 비교는 equals()로 비교하세요.
		System.out.println("name1.equals(name3) :" + name1.equals(name3));
		
		// 학생 데이터 2개를 똑같이 넣어 보자.
		Student s1 = new Student();
		s1.no = 1111111;
		s1.name = "홍길동";
		Student s2 = new Student();
		s2.no = 1111111;
		s2.name = "홍길동";
		
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1의 system hash : " + System.identityHashCode(s1));
		System.out.println("s2의 system hash : " + System.identityHashCode(s2));
		System.out.println("s1.equals(s2) : " + (s1.equals(s2))); // 기본은 == 비교 -> 같게 코딩
		
		// s1의 클래스이름
		System.out.println(s1.getClass().getName());
		System.out.println(s1.getClass().getSimpleName());

	}

}
