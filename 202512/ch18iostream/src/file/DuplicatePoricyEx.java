package file;

import java.io.File;
import java.io.IOException;

// 파일이 중복된 경우 처리하는 프로그램.
public class DuplicatePoricyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "D:\\leeyh\\data";
		String fileName = "text.txt";

		// 위의 2가지 정보를 이용하여 파일 객체를 만든다.
		// File file = new File(path + "\\" + fileName);
		File file = new File(path, fileName);
		System.out.println("저장 파일명 : " + file.getPath());

		// createNewFile()를 이용하여 빈 파일을 만드세요. - 존재하지 않으면 그냥 만든다.
		try {
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("파일 만듬 : " + file.getPath());
			} else {
				int cnt = 1;
				while(true) {
					// 중복이 되는 경우 fileName "." 앞에 cnt를 붙인다.
					int pos = fileName.lastIndexOf(".");
					// text.txt - text1.txt - text2.txt ... 만들어 져야한다.
					String saveFileName = fileName.substring(0, pos) + (cnt++) + fileName.substring(pos);
					System.out.println("새로 만든 파일명 : " + saveFileName);
					file = new File(path, saveFileName);
					if(!file.exists()) {
						// 반복문을 빠져 나간다.
						break;
					}
				}
				file.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
