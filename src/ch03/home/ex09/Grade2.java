package ch03.home.ex09;

import java.util.Scanner;

public class Grade2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor = 0; 	//국어 점수
		int eng = 0; 	//영어 점수
		int math = 0;	//수학 점수
		int tot = 0;	//합계
		double avg = 0;	//평균
		char grade = 0;	//학점
		
		System.out.printf("국어: ");
		kor = sc.nextInt();
		System.out.printf("영어: ");
		eng = sc.nextInt();
		System.out.printf("수학: ");
		math = sc.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3.0;
		grade = (avg >=90) ? 'A' : (avg >=80) ? 'B' : 'C';
		System.out.printf("\n총점: %d\n평균: %.1f\n학점: %c", tot, avg, grade);
		
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

