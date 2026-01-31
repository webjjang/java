package chapter07;

import ext.sub.ExtSub;

public class SuperSubMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 같은 패키지의 클래스 테스트
		// Super의 변수 사용 여부
		Super super1 = new Super();
		super1.pub = 10; // 같은 패키지에서 pub 사용가능
		super1.pro = 10; // 같은 패키지에서 pro 사용가능
		super1.def = 10; // 같은 패키지에서 def 사용가능
		// super1.pri = 10; // 같은 패키지에서 pri 사용불가능
		super1.print();
		
		// Sub의 변수 사용 여부
		Sub sub1 = new Sub();
		sub1.pub = 10;
		sub1.pro = 10;
		sub1.def = 10;
		// sub1.pri = 10;
		
		// 다른 패키지의 사용 여부 확인
		// ExtSub의 변수 사용 여부
		ExtSub extSub1 = new ExtSub();
		extSub1.pub = 10;
		// extSub1.pro = 10;// 다른 패키지에서 pro 사용 불가능(상속 가능 - private 처럼 동작)
		// extSub1.def = 10;// 다른 패키지에서 def 사용 불가능
		// extSub1.pri = 10;// 다른 패키지에서 pri 사용 불가능
		
	}

}
