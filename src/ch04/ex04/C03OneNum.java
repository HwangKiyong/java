package ch04.ex04;

import java.util.Scanner;

public class C03OneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.println("입력: ");
			input = sc.nextInt();
		} while(!(1 <= input && input <= 9 )); //과제:자연수 1이상 9이하를 입력할 때까지 입력받아라
		
		System.out.println("끝.");
	}
}
