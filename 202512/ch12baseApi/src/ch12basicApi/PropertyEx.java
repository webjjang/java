package ch12basicApi;

import java.util.Arrays;

public class PropertyEx {

	public static void main(String[] args) {
		System.out.println("args : " + Arrays.toString(args));
		// 시스템 정보를 알아내는 getProperty(설정이름)
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("os.name"));
		System.err.println("오류 발생");
	}
	
}
