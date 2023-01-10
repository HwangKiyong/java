package ch08.ex04.case01;

public class C05Hirearchy {
	public static void main(String[] args) {
		try {
			int i = 3 / 0;
		} catch(ArithmeticException e) {
			System.err.println("ArithmeticException."); //err 을 사용해서 빨간색으로 표기됨
		} catch(Exception e) {
			System.err.println("Exception.");
		}
	}
}
