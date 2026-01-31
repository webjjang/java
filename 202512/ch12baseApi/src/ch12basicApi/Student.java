package ch12basicApi;

public class Student {

	int no;
	String name;
	
	@Override
	public boolean equals(Object obj) {
		// Object의 메서드와 맞춰주면 std가 없어짐 - 캐스팅해서 사용
		Student std = (Student) obj;
		
		// 번호가 같지 않으면 false 리턴
		if(this.no != std.no) return false;
		// 이름이 같지 않으면 false 리턴
		if(!this.name.equals(std.name)) return false;
		
		// 학번과 이름이 같으면 true를 리턴한다.
		return true;
	}
	
}
