package file;

import java.io.File;

public class CreateDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "D:\\leeyh\\data";
		
		// path가 존재하지 않으면 폴더를 생성한다.
		// 1. path로 File객체로 만든다
		File file= new File(path);
		// 2. if문으로 File객체가 존재하는지 알아낸다.
		if(file.exists()) {
			System.out.println("존재한다.");
			// 전체 정보를 출력
			System.out.println("폴더 만듬 : " + file.getPath());
		} else {
			// 3. 존재하지 않으면 새로 만든다.
			System.out.println("존재하지 않는다.");
			//mkdir() - 마지막 폴더만 만듬. mkdirs() - 중간 폴더까지 다 만듬.
			file.mkdirs();
			// 마지막 정보 출력
			System.out.println("폴더 만듬 : " + file.getName());
		}
		
	}

}
