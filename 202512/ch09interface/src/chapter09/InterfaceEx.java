package chapter09;

public interface InterfaceEx {

	// 상수 - final 변수(인터페이스에서 생략 가능)
	public int MIN_PRICE = 0;
	public int MAX_PRICE = 100000;
	
	// 추상 메서드 - 처리되는 것인 없다. = {} 없다.
	// 상속 받는 클래스에서 추상 메서드를 구현 : {} 만들어서 사용한다.
	public double meanPrice();
	public double totalPrice();
	
	// default 메서드 - 필요에 의해서 재정의해서 사용되는 메서드
	public default double getSalePrice(double price) {
		System.out.println("InterfaceEx.getSalePrice() - 기본 메서드");
		// 기본 할인율을 5%로 하겠다.
		return price - (price * 0.05);
	}
	
	// static 메서드 - new와 상관이 없고 자동으로 올라가서 실행된다.
	// InterfaceEx.printPrice(price)
	public static void printPrice(double price) {
		System.out.println("static InterfaceEx.printPrice() - 가격 : " + price);
	}
	
	
}
