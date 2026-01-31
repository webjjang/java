package ch09interface;

// 작성한 사용자 어노테이션 사용해 보기
public class UserClass {

	@UserAnnot(value = "A")
	public void methodA() {
		System.out.println("methodA() 실행");
	}
	
	@UserAnnot(value = "B", number = 10)
	public void methodB() {
		System.out.println("methodB() 실행");
	}
	
}
