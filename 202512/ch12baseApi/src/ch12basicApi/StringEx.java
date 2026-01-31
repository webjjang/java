package ch12basicApi;

public class StringEx {

	public static void main(String[] args) {
		// 다음 문자열의 파일명과 확장자 명을 출력해 보세요. - \ - \\로 표시한다.
		// 파일명의 길이와 이름 달라져도 적용되어야한다.
		String file = "C:\\java\\test.g\\text.1.txt";
		// indexOf(문자열) - 앞에서 위치 찾기, lastIndexOf(문자열)
		// substring(시작인덱스, 끝인덱스) - 시작인덱스 포함, 끝인덱스는 미포함(생략하면 마지막까지)
		int fileStart = file.lastIndexOf("\\") + 1;
		int extStart = file.lastIndexOf(".");
		System.out.println(fileStart);
		System.out.println(extStart);
		String fileName = file.substring(fileStart, extStart);
		System.out.println("파일명 : " + fileName);
		System.out.println("확장명 : " + file.substring(extStart + 1));
		
		// 아래 아이디를 대문자로만 처리하려고 한다. 전체 대문자로 출력해 보세요. 앞 뒤 공백은 제거한다.
		// toUpperCase() - 대문자로 변환, trim() - 앞 뒤 공백 제거
		String id = "  test1Ex  ";
		id = id.toUpperCase().trim();
		System.out.println("입력하신 아이디 : [" + id + "]");
		
		// 연락처를 분할해서 3개의 배열로 만들어서 화면에 한개씩 출력한다. 010-1111-2222 -> 010, 1111, 2222
		String tel = "010-1111-2222";
		// split() - 특정문자로 분할시킨다.
		String telsplit[] = tel.split("-");
		for(int i = 0; i < telsplit.length; i++) System.out.println(telsplit[i]);
		for(String t : telsplit) System.out.println(t);
		
		// 연락처 배열을 "-"을 이용해서 한개로 만든다. String.join()를 이용해 보세요.
		String tels[] = {"010", "1111", "3333"}; // -> 010-1111-3333
		System.out.println(String.join("-", tels));
		String telsStr = "";
		for(String t : tels) telsStr += t + "-";
		// 마지막 문자는 잘라낸다.
		telsStr = telsStr.substring(0, telsStr.length() - 1);
		System.out.println(telsStr);
		
		// 관심있는 데이터 중 JAVA가 있는지 확인하는 처리. MySQL도 확인해 보자.
		String interest = "JAVA, ORACLE, AI, API";
		// contains() - 포함되어 있는 확인 메서드
		System.out.println("JAVA 관심 유무 : " 
		+ ((interest.contains("JAVA"))?"있다.":"없다."));
		// indexOf()를 이용 - 찾는 문자열의 위치 : 없으면 -1
		int intPos = interest.indexOf("JAVA");
		System.out.println(intPos);
		System.out.println("JAVA 관심 유무 : " 
				+ ((intPos != -1)?"있다.":"없다."));
		// contains() - 포함되어 있는 확인 메서드
		System.out.println("MySQL 관심 유무 : " 
				+ ((interest.contains("MySQL"))?"있다.":"없다."));
		// indexOf()를 이용 - 찾는 문자열의 위치 : 없으면 -1
		intPos = interest.indexOf("MySQL");
		System.out.println(intPos);
		System.out.println("MySQL 관심 유무 : " 
				+ ((intPos != -1)?"있다.":"없다."));
		
		// 파일 중 확장명 앞에 . 앞에 숫자 cnt = 1을 추가 시켜보자.(cnt를 이용해서 추가시킨다.)
		int cnt = 1;
		String saveFile = "cat.jpg"; // -> cat1.jpg
		int pos = saveFile.lastIndexOf(".");
		saveFile = saveFile.substring(0,pos)
				+ cnt + saveFile.substring(pos);
		System.out.println(saveFile);
		
		// 문자열 데이터 중에서 맨 앞에 "redirect:" 문자열이 있는지 확인하는 프로그램 작성
		String url = "redirect:/board/list.do";
		// 맨앞에 시작되는 문자인가? - startsWith(). indexOf("redirect:") == 0
		System.out.println(url);
		if(url.startsWith("redirect:"))System.out.println("리다이렉트 시킨다.");
		else System.out.println("forward 시킨다.");
		if(url.indexOf("redirect:") == 0)System.out.println("리다이렉트 시킨다.");
		else System.out.println("forward 시킨다.");
		
	}
}
