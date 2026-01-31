package chapter12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		// 현재 날짜와 시간을 출력해 보자.
		Date now = new Date();
		System.out.println(now);
		
		// 요일 처리 위한 배열
		String [] days = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
		// 년월일을 출력 - 2026년 1월 9일
		int year = now.getYear() + 1900;// 년도 가져와서 계산
		int month = now.getMonth() + 1;// 월 가져와서 계산
		int date = now.getDate(); // 일 가져오기
		int day = now.getDay();
		System.out.println(year + "년 " + month + "월 " + date + "일 "
				+ days[day]);

		// 형식에 맞게 출력해 주는 객체 사용
		// SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 M월 d일");
		System.out.println(sf.format(now));
	}

}


