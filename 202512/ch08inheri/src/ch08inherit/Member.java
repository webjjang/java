package ch08inherit;

public class Member { // MemberVO = MemberDTO = Member

	private String name;
	private String tel;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String toString() {
		return "Member[name=" + name + ", tel=" + tel + "]";
	}
}
