package chapter09;

public class Shop implements InterfaceEx {

	@Override
	public double meanPrice() {
		System.out.println("Shop.meanPrice() 실행");
		return 0;
	}

	@Override
	public double totalPrice() {
		System.out.println("Shop.totalPrice() 실행");
		return 0;
	}
	
	// default 메서드 - 필요에 의해서 재정의해서 사용되는 메서드
	@Override
	public double getSalePrice(double price) {
		System.out.println("Shop.getSalePrice() - 기본 메서드 재정의");
		// 기본 할인율을 20%로 하겠다.
		return price - (price * 0.2);
	}
	


}
