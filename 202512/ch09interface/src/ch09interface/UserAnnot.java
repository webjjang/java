package ch09interface;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 어노테이션 정의
// @Retention - 정의하고 있는 어노테이션이 언제까지 유지되는지 정의, RUNTIME:실행
// RetentionPolicy - 열거형 클래스 - 사용할 수 있는 값을 한정한다.
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnnot {

	// 어노테이션 사용할 때 데이터 값은 세팅
	// value = "A"
	String value(); // 필수
	// number = 10
	int number() default 5; // 선택 - 세팅하지 않으면 5가 들어간다.
	
}
