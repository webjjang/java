package ext.super1;

// 클래스의 접근 제한자. - public 또는 default
// class의 파일 안에 같은 이름의 클래스만 public을 붙일 수 있다. public 은 딱 1개 존재
// 상위 = 슈퍼 = 부모 클래스
public class ExtSuper { 

	// 1. public:공공의, protected(보호된), default(기본-선언안함), private(개인적인)
	public int pub;
	protected int pro;
	int def;
	private int pri; // 사용하지 않으면 경고가 난다.
	
	void print() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		System.out.println(pri);
	}
}

// 클래스 파일 내부에 여러개의 class를 선언해서 사용 가능
// 클래스나 메서드를 만드는 목적 - 반복되거나 복잡해지면 만든다.
//class Super2{
//	
//}