package ch03.home;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int sum = 0;
		
		System.out.printf("a: ");
		a = sc.nextInt();
		System.out.printf("b: ");
		b = sc.nextInt();
		
		sum = a + b;
		System.out.printf("%d + %d = %d", a ,b ,sum);
	}
}

/*
 과제 : 두 자연수를 입력받아, 그 합계를 출력하라.
 a: 1
 b: 2
 1 + 2 = 3
 
*/