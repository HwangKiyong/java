package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		//byte b = 128;
		byte b = 127;
		//b = b + 1;
		
		b++; //overflow 되어서 2진수이기 때문에 -128이 출력된다.
		b++;		
		System.out.println(b);
	}
}
