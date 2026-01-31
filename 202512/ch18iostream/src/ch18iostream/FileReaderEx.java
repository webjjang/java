package ch18iostream;

import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		try {
			// 파일의 처음 찾는 위치 해당 프로젝트가 된다.
			// 파일을 연결한다.
			fr = new FileReader("src/ch18iostream/intest.txt");
			
			// 파일 읽어오기 - 한 문자씩 읽어오기.
			int data = 0;
			// fr.read() 리턴 값을 -1 세팅해 놓는다. 읽어 오면 읽은 데이터로 바꾼다.
			// char은 0이상 음수가 없다. 리턴 값이 -1이면 더이상 데이터가 없다.
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // try ~ catch ~ finally 의 끝

		// 자동 자원의 반환하는 자동 close try 문 작성
		try(FileReader fr2 = new FileReader("src/ch18iostream/intest.txt")){
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	} // main()의 끝

} // 클래스의 끝
