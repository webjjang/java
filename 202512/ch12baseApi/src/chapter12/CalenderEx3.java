package chapter12;

import java.util.Date;

public class CalenderEx3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 현재일
		int sYear = 2026;
		int sMonth = 1;
		int sDate = 9;
		
		// 이전일
		int eYear = 2026;
		int eMonth = 1;
		int eDate = 1;
		
		// 현재 날짜와 시간을 객체 생성
		Date sd = new Date();
		Date ed = new Date();
		
		// 위에 세팅한 데이터로 날짜 변경
		sd.setYear(sYear);
		sd.setMonth(sMonth-1);
		sd.setDate(sDate);
		ed.setYear(eYear);
		ed.setMonth(eMonth-1);
		ed.setDate(eDate);
		
		// 날짜 객체를 사용하는 이유 - 날짜 계산을 해야 하는 경우 만든다.
		// long temp = (sd.getTime() - ed.getTime()) / (1000L * 60L * 60L * 24L);
		// 자바에서 long 연산 long -> long - 소수이 없다. 소수점 이하 데이터가 잘린다.
		long diff = (sd.getTime() - ed.getTime()) / (1000L * 60L * 60L * 24L);
		// int diff = (int) temp;
		
		System.out.println(diff);
		
	}

}



