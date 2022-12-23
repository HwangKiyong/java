package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int language = 0;
		int english = 0;
		int math = 0;
		int sum = 0;
		double average = 0;
		
		System.out.printf("국어: "); language = sc.nextInt();
		System.out.printf("영어: "); english = sc.nextInt();
		System.out.printf("수학: "); math = sc.nextInt();
		System.out.println();
		
		
		sum = language + english + math;
		System.out.printf("총점: " + sum + "\n");	
		
		average = (language + english + math)*10/30.0;
		System.out.printf("평균: " + "%.1f" , average);
		
		char grade = average >= 90? 'A' : (average >= 80? 'B':'C');
		System.out.printf("\n" + "학점: " + grade);
	}
}
/*
국어, 영어, 수학 점수를 입력한다.
총점, 평균, 학점을 출력한다.
평균점수는 소수점 이하 한자리까지만 출력한다.

 90 <= mean <= 100 : A
 80 <= mean <90 :B
       mean <80 :C
       
 국어: 95
 영어: 100
 수학: 100
 
 총점: 295
 평균: 98.3
 학점: A
*/
