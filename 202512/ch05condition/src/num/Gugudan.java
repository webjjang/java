package num;

public class Gugudan {

	public static void main(String[] args) {
		// 단수 처리 반복
		for(int i = 2; i <= 9; i++) {
			// 곱하는 수 처리
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "   ");
				// j가 3의 배수이면 줄바꿈을 한다.
				if(j % 3 == 0) System.out.println();
			}
			// 단수가 바뀌면 줄바꿈한다.
			System.out.println();
		}
	}
}
