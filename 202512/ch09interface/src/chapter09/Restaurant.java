package chapter09;

public class Restaurant implements InterfaceEx{

	@Override
	public double meanPrice() {
		System.out.println("Restaurant.meanPrice() 실행");
		return 0;
	}

	@Override
	public double totalPrice() {
		System.out.println("Restaurant.totalPrice() 실행");
		return 0;
	}

}
