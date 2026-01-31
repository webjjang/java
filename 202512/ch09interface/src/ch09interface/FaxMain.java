package ch09interface;

public class FaxMain {

	public static void main(String[] args) {

		// 한번 사용하고 버리기 때문에 클래스를 만들지 않는다. - 안드로이드 개발할 때 보통 사용.
		// fax를 생성 - Fax가 인터페이스이므로 구현하고 사용한다.
		// 익명 클래스 사용하기
		Fax fax = new Fax() {
			
			@Override
			public void send(String tel) {
				System.out.println("팩스 전송 -----");
				System.out.println("팩스 전송 번호 : " + tel);
			}
		};
		
		// 팩스 보내기
		fax.send("02-777-9999");
		
	}

}
