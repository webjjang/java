package ch11exception;

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		try {
			// 정상처리
			meth1();
			meth2();
			meth3();
		} catch (Exception e) {
			System.out.println("catch 실행");
		} finally {
			System.out.println("반드시 실행 try의 finally");
		}
		
		System.out.println("프로그램 종료");
	}

	// 순차적으로 실행되는 메서드
	static void meth1(){
		System.out.println("meth1");
	}
	static void meth2() throws Exception{
		System.out.println("meth2");
		// System.out.println(10/0);
		meth4();
	}
	static void meth3(){
		System.out.println("meth3");
		
	}
	// 오류가 나기 때문에 예외처리를 꼭 해야만 합니다.
	// 예외 처리가 꼭 필요한 메서드 사용 강제 - 메서드 뒤에 throws Exception을 붙인다.
	static void meth4() throws Exception{
		System.out.println("meth4");
		System.out.println(10/0);
		
	}
}
