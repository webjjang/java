package chapter07;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Singleton class를 생성해 보자.
		// Singleton s = new Singleton();  // 생성자가 private
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		// hashCode 프로그램 동작 범위 안에서의 주소 값이다.
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// System 에서의 주소값을 알아보자.
		System.out.println
		("실제 주소 값 : " + System.identityHashCode(s1));
		System.out.println
		("실제 주소 값 : " + System.identityHashCode(s2));
		
	}

}
