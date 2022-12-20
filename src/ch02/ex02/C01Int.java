package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		int x = 10; //decimal
		System.out.println(Integer.toBinaryString(x));
		
		x = 012; //octal 앞에 0을써주면 8진수로 인지한다.
		System.out.println(Integer.toBinaryString(x)); //Binary 두개란 뜻임
		
		x = 0xA; //hexa 0x가 붙게되면 16진수로 인지한다.
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010; //0b를 쓰게되면 2진수로 인지한다.
		System.out.println(Integer.toBinaryString(x));
		
		x = 1_234_567;
		System.out.println(x + 1);
		
		double y =1e1; //1e1 10의 1승
		System.out.println(y);
	}
}