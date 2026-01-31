package chapter09;

public class InterfaceMain {

	public static void main(String[] args) {

		System.out.println("프로그램 시작~~~~");
		
		// 쇼핑몰
		Shop shop = new Shop();
		// shop 처리를 한다. -> 생략
		
		// 쇼핑몰 정산 처리
		calculate(shop);
		
		// 음식점
		Restaurant res = new Restaurant();
		// restaurnt 처리를 실행한다. -> 생략
		// 음식점 정산
		calculate(res);
		
		InterfaceEx.printPrice(10000);
		System.out.println("프로그램 끝~~~~");
	}
	
	// 정산 메서드
	@SuppressWarnings("static-access")
	public static void calculate(InterfaceEx ex) {
		// 평균가격 계산
		ex.meanPrice();
		// 판매 총가격 계산
		ex.totalPrice();
		// 판매가 받아가기.
		ex.getSalePrice(0);
		
		// 판매 범위 출력
		System.out.println("판매 금액의 범위 : " + ex.MIN_PRICE + " ~ " +ex.MAX_PRICE);
		// ex.MIN_PRICE = 100;
		
		// 가격 출력
		InterfaceEx.printPrice(100);
	}

}
