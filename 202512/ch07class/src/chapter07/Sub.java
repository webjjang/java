package chapter07;

public class Sub extends Super {

	void print() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		// System.out.println(pri); // private은 다른 클래스에서 상속 받지 못한다. 사용도 안된다.
	}
}
