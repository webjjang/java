package ch09interface;

import java.lang.reflect.Method;

// UserClass에서 어노테이션이 세팅되어 있는 메서드를 실행해보자. 데이터도 확인해 보자.
public class AnnotationEx {

	// 모든 메서드를 꺼내서 실행(UserClass
	public static void main(String[] args) throws Exception {

		// UserClass 안에 모든 메서드 꺼내기
		Method method[] = UserClass.class.getDeclaredMethods();
		
		// 모든 메서드의 어노테이션의 값을 확인하고 실행
		for(int i = 0; i < method.length; i++) {
			// 메서드 이름 출력 - 값 출력
			String methodName = method[i].getName();
			System.out.print(methodName + "의 어노테이션의 값 - ");
			// 어노테이션에 세팅되어 있는 값 출력
			// 어노테이션 가져오기
			UserAnnot annot = method[i].getAnnotation(UserAnnot.class);
			System.out.print("value : " + annot.value() + ", ");
			System.out.print("number : " + annot.number());
			System.out.println();
			
			// 메서드 실행
			// if((annot.value()).equals("A"))
			// method[i].invoke(new UserClass(), null);
			method[i].invoke(new UserClass());
		}
		
	}

}
