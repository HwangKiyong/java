package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;
		b = (2 > 1) && (2 > 1);
		b = 2 < 1 && 2 > 1;
		b = 2 < 1 || 2 > 1;
		b = 2 < 1 || 2 < 1;
		
		//|| or 연산자  && and 연산자
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y <0;
		
		x = 0;
		y = 0;
		b = ++x < 0 && ++y <0;
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y <0;
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y <0;
		
		x = 0;
		y = 0;
		b = ++x > 0 | ++y <0;
		
		System.out.printf("x: %d, y: %d, b: %b",x ,x, b);
	}
}
