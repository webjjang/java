package ch11exception;

public class OutOfScoreException extends Exception{

	private static final long serialVersionUID = 1L;

	public OutOfScoreException() {
		super("점수 범위를 벗어 났습니다.");
	}
}
