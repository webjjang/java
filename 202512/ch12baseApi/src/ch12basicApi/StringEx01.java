package ch12basicApi;

public class StringEx01 {

	public static void main(String[] args) {
		String text = "제 이름은 이영환입니다.";
		// text 문자열을 문자 한개씩 꺼내서 출력하고 줄바꿈한다.
		// String은 인덱스와 길이를 가지고 있다.
		for(int i = 0; i < text.length();i++)
			System.out.println(text.charAt(i));
	}
}
