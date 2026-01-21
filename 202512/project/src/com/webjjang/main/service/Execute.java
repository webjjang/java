package com.webjjang.main.service;

import java.util.Arrays;

public class Execute {

	// AOP : 벽 구조 프로그램 - 
	public static Object execute(Service service, Object obj) throws Exception {
		Object result = null;
		System.out.println("<<<<<<<<< 로그 출력 >>>>>>>>>>>>");
		// 서비스 실행 전 로그 출력 -----------------------------------------------
		// 처리 시작 시간
		long start = System.nanoTime();
		// 실행하고 있는 객체의 이름과 메서드명
		System.out.println("실행 객체 : " + service.getClass().getName() + ".service()-------------");
		// obj가 배열이면 Arrays를 사용하여 출력하도록 한다.
		if(obj != null && obj.getClass().isArray())
			System.out.println("넘겨 받은 데이터 : " + Arrays.toString((Object[]) obj));
		else
			System.out.println("넘겨 받은 데이터 : " + obj);
		
		//service 실행
		result = service.service(obj);
		
		// 서비스 실행 후 로그 출력 -----------------------------------------------
		System.out.println("실행 결과 : " + result);
		long end = System.nanoTime();
		System.out.println("실행 시간 : " + (end - start));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++\n");
		return result;
		
	}
	
}
