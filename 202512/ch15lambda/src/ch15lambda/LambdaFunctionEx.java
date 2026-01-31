package ch15lambda;

public class LambdaFunctionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 람다식을 사용하지 않는 경우 - 익명 클래스
		InterfaceEx nonLambda = new InterfaceEx() {
			
			@Override
			public int sum(int x, int y) {
				// TODO Auto-generated method stub
				return x + y;
			}
			
		}; // 익명 클래스의 끝
		
		System.out.println(nonLambda.sum(10, 20));
		
		// 람다식을 만들어서 사용한 경우.
		InterfaceEx lambda = (int x, int y) -> x + y;
		System.out.println(lambda.sum(100, 200));
		
	} // main()의 끝

}// 클래스의 끝


// 인터페이스 시작 - 추상메서드가 주를 이룬다.
interface InterfaceEx{
	public int sum(int x, int y);
}
