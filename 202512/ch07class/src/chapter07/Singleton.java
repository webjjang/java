package chapter07;

// 딱한번 생성이되서 한개의 프로그램만 처리에서 사용할 수 있도록 작성된 클래스
public class Singleton {

	// 꼭 이 클래스에서만 생성해야만 한다. 다른 곳에서는 생성 안됨
	private Singleton() {
		System.out.println("객체 생성");
	}
	
	// 이 클래스에서 생성 후 주소를 저장하는 변수
	// 변수는 private 으로 만들고 가져가는 getter와 저장하는 setter를 만들다.
	// 데이터 캡슐화. Singleton은 밖에서 생성할 수 없어서 setter는 없다.
	private static final Singleton instance = new Singleton();
	
	// 생성된 객체의 주소를 가져가는  getter 메서드를 만든다.
	// 사용법 : 타입 - Singleton작성,
	// Singleton.getInstance() - static
	public static Singleton getInstance() {
		return instance;
	}
	
}
