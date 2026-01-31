package op;

import java.util.Scanner;

public class CalcuMain {

	// nextLine()
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("프로그램 시작 -------------------------------------");

		// 예외처리 - try{ 정상처리 } catch(예외객체) { 예외처리 } finally { 반드시 실행되는 처리 }
		try {
			// ----- 정상 처리 -----------------------------

			// 사용하는 변수 선언
			int x, y;
			
			try {
				// --- 숫자 입력 정상처리
				// 1. 2개의 숫자입력, 연산자 입력
				System.out.print("첫번째 숫자 -> ");
				x = Integer.parseInt(scanner.nextLine());
				System.out.print("두번째 숫자 -> ");
				y = Integer.parseInt(scanner.nextLine());
			} catch (Exception e) { // NumbarFormatException이 들어 왔다.
				throw new Exception("숫자만 입력하셔야 합니다."); // 그냥 Exception을 던진다.
			}

			// 연산자 입력
			System.out.print("연산자 입력 -> ");
			String op = scanner.nextLine();

			// 2. 연산처리 : + - / * %
			// 연산 객체 생성 사용
			Calcu calcu = new Calcu();
			// 연산 결과 저장 변수
			int result = 0;
			// 연산자 입력의 적절성을 저장 변수
			boolean opTest = true;
			
			try {
				// 연산 정상 처리
				switch (op) {
				case "+":
					result = calcu.add(x, y);
					break;
				case "-":
					result = calcu.sub(x, y);
					break;
				case "*":
					result = calcu.mul(x, y);
					break;
				case "/":
					result = calcu.div(x, y);
					break;
				case "%":
					result = calcu.rem(x, y);
					break;
				default:
					opTest = false;
					// result = -999999;
					throw new Exception("잘못된 연산자 입니다.");
					// break;
				} // switch의 끝
			} // 연산처리 try
			catch (Exception e) {
				// 정상적인 연산자 일때 - 나누기 연산 시 예외
				if(opTest) throw new Exception("0으로 나누거나 나머지를 연산할 수 없습니다.");
				// 정상적이지 않은 연산자 - default -> default에서 생성한 예외 객체를 그대로 던진다.
				else throw e;
			}

			// 3. 결과 출력
			if (opTest)
				System.out.println("" + x + op + y + "=" + result);
			else
				System.out.println("적절한 연산자를 입력하셔야 한다. - [" + op + "]");

		} // try의 끝
			// catch 정의할 때 여러개 사용가능 - 범위가 작은 것 부터 큰것으로 정의한다.
//		catch (NumberFormatException e) {
			// 예외처리
//			System.out.println("*** 숫자만 입력하셔야 합니다.");
//		}
//		catch (ArithmeticException e) {
//			System.out.println("*** /, % 연산에서 두번째 숫자는 0이면 안됩니다.");
//		}
		catch (Exception e) {
			System.out.println("*** 프로그램 실행 중 오류 : " + e.getMessage());
		}
		// catch의 끝

		System.out.println("프로그램 종료 -----------------------------------------------");
	} // main()의 끝

} // 클래스의 끝
