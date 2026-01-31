package chapter07;

public class ParamEx2 {

	// main() 자동으로 올라간다. new와 상관이 없다.
	public static void main(String[] args) {
		
		// 자신 클래스를 생성해서 처리 할 수 있다.
		ParamEx2 p = new ParamEx2();
		p.add(10,5);
		p.add(10.0, 5.0);
		// 형식이 같은 불특정 다수개의 파라메터를 전달 할 때 "타입 ... 변수" - 배열로 받는다.
		// ... 파라메터는 다른 파라메터 맨 뒤에 위치해야만 한다.
		p.add(1,2,3,4,5,6,7,8,9,10);
	} // main()의 끝

	// ------------ 이 부분 밑으로 non-static 이므로 new 해서 생성된다.\
	// 메서드()를 만드는 목적 - 중복, 복잡
	void add(int x, int y) {
		System.out.println("add(int x, int y)");
		int z = x + y;
		System.out.println(z);
		
	} // add(int x, int y)의 끝
	
	void add(double x, double y) {// overload - 파라메터의 순서 개수 타입이 틀리면 다른 것으로 본다.
		System.out.println("add2(double x, double y)");
		double z = x + y;
		System.out.println(z);
		
	} // add(double x, double y)의 끝
	
	void add(int ... x) { // overload - 파라메터의 순서 개수 타입이 틀리면 다른 것으로 본다.
	// 형식이 같은 불특정 다수개의 파라메터를 전달 할 때 "타입 ... 변수" - 배열로 받는다.
	// ... 파라메터는 다른 파라메터 맨 뒤에 위치해야만 한다.
		System.out.println("add3(int ... x)");
		int sum = 0;
		for(int n : x) sum += n;
		System.out.println(sum);
		
	} // add(int x, int y)의 끝
	
} // 클래스의 끝