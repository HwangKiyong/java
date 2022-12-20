package ch02.ex02;

public class C02Char {
	public static void main(String[] agrs) {
		char c = 'A'; //대문자 A의 유니코드는 65이다. , 소문자 a 는 97 
		System.out.printf("%c %s\n", c , Integer.toBinaryString(c));
		
		c = 65;
		System.out.printf("%c %s\n", c , Integer.toBinaryString(c));
		
		c = 0x0041;
		System.out.printf("%c %s\n", c , Integer.toBinaryString(c));
		
		c = '\u0041';
		System.out.printf("%c %s\n", c , Integer.toBinaryString(c));
	}
}


// https://www.rapidtables.org/ko/code/text/unicode-characters.html 유니코드표