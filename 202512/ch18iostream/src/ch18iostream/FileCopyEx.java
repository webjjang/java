package ch18iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class FileCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
				// FileReader fr = new FileReader("src/ch18iostream/intest.txt");
				FileInputStream fis = new FileInputStream("src/ch18iostream/intest.txt");
				FileOutputStream fos = new FileOutputStream("src/ch18iostream/outtest.txt");
				
			){
			
			// char 단위로 처리 시 엔코딩이 필요함.
			int data = 0; // char 읽을 때는 한개의 데이터. byte 단위 버퍼를 가지고 처리 할 때 버퍼의 길이
			byte[] buffer = new byte[1024];
			while ((data = fis.read(buffer)) != -1) {
				// 파일로 저장한다.
				fos.write(buffer, 0, data);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
