package chapter07;

public class ParamEx {

	public static void main(String[] args) {
		
		Param p = new Param(); 
		p.add(10,5);
		// p.add2(10, 5);
		p.add(10.0, 5.0);
		// 형식이 같은 불특정 다수개의 파라메터를 전달 할 때 "타입 ... 변수" - 배열로 받는다.
		// ... 파라메터는 다른 파라메터 맨 뒤에 위치해야만 한다.
		// p.add3(1,2,3,4,5,6,7,8,9,10);
		p.add(1,2,3,4,5,6,7,8,9,10);
	} // main()의 끝
	
} // 클래스의 끝

class Param{

	void add(int x, int y) {
		System.out.println("add(int x, int y)");
		int z = x + y;
		System.out.println(z);
		
	} // add(int x, int y)의 끝
	
	// void add2(double x, double y) {
	void add(double x, double y) {// overload - 파라메터의 순서 개수 타입이 틀리면 다른 것으로 본다.
		System.out.println("add2(double x, double y)");
		double z = x + y;
		System.out.println(z);
		
	} // add(double x, double y)의 끝
	
	// void add3(int ... x) {
	void add(int ... x) { // overload - 파라메터의 순서 개수 타입이 틀리면 다른 것으로 본다.
	// 형식이 같은 불특정 다수개의 파라메터를 전달 할 때 "타입 ... 변수" - 배열로 받는다.
	// ... 파라메터는 다른 파라메터 맨 뒤에 위치해야만 한다.
	// void add3(int a, int b, int ... x) {
		System.out.println("add3(int ... x)");
		int sum = 0;
		// for(int i = 0; i < x.length; i++) sum += x[i];
		for(int n : x) sum += n;
		System.out.println(sum);
		
	} // add(int x, int y)의 끝
	
} // 클래스의 끝