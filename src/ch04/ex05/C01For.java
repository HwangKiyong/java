package ch04.ex05;

public class C01For {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print("*");
		}  //for(조건) 조건에서 false 가 나오면 출력하지않는다.
		System.out.println();
		
		for(int i = 0 ; i < 10; i ++)
			System.out.print(i + " ");
		System.out.println();
		//개발자는 시작값이 0이여야된다.
		
		for(int i = 1; i <= 10; i++)
			System.out.print(i - 1 + " ");
	}
}
