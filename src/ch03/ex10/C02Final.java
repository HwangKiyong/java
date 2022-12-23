package ch03.ex10;

public class C02Final {
	public static void main(String[] args) {
		final int MAX = 3;	//final을 쓰게되면 고정의 값을 갖는다. 변수를 상수로 변하게한다.
//		MAX = 1;
		
		double area = 3.14 * 3 * 3;
		
		final double PI = 3.14 * 3 * 3;
		int r = 3;
		area = PI * r * r;
	}
}
