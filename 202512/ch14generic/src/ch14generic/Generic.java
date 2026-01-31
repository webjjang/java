package ch14generic;

public class Generic<T> {

	// T 타입의 데이터 여러개를 저장하는 변수
	T[] v;
	
	// 데이터를 저장하는 setter()
	public void set(T[] v) {
		this.v = v;
	}
	
	// 데이터를 가져가는 getter()
	public T[] get() {
		return v;
	}
	
	public void print() {
		// 데이터 출력해 보기
		for(T t : v) System.out.println(t);
	}
	
}
