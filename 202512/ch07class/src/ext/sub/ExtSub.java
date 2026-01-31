package ext.sub;

import ext.super1.ExtSuper;

public class ExtSub extends ExtSuper {

	@SuppressWarnings("all")
	void print() {
		System.out.println(pub);
		System.out.println(pro);
		// System.out.println(def); // default는 다른 패키지에서 상속 받지 못한다. 사용도 안된다.
		// System.out.println(pri); // private은 다른 클래스에서 상속 받지 못한다. 사용도 안된다.
	}
}
