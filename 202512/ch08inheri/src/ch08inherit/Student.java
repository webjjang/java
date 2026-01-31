package ch08inherit;

public class Student extends Member {
	
	private String hakbun;

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	//Override 어노테이션
	@Override
	public String toString() {
		return "Student [hakbun=" + hakbun + ", " + super.toString() + "]";
	}


	
}
