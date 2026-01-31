package ch13collection;

public class BoardVO {

	private long no;
	private String title;
	private String writer;
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + "]";
	}
	
}
