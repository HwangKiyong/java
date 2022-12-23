package ch04.ex04;

import java.util.Scanner;

public class C01DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result = 0;
		
		//while 은 0회이상 반복할때 사용 do while은 1회이상 반복할때 사용
		do {
			System.out.printf("a: ");
			a = sc.nextInt();
			
			System.out.printf("b: ");
			b = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n\n", a, b, result = a + b);
		}while(result != 0);
	}
}
