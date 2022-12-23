package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int tenDigit = 0;
		int oneDigit = 0;
		String grade = "";   //변수는 한군데에 모아두면 업무에 도움이된다.
		
		System.out.printf("점수: ");
		score = sc.nextInt();
		
		tenDigit = score / 10;
		oneDigit = score % 10;
		
		if(tenDigit >= 9) grade = "A";
		else if(tenDigit >=8) grade = "B";
		else grade = "C";
		
		if(score >= 80) {
			if(oneDigit >=8 || tenDigit ==10) grade += "+";
			else if (0 <= oneDigit && oneDigit <4) grade += "-";
		}
		System.out.println(grade);
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("점수: ");
//		int score = sc.nextInt();
//		char grade = 0;
//		
//		String a = "";
//		if(score>=90 && score<=100) a = "A";
//		else if (score >=80 && score<=89) a ="B";
//		else a = "C";
//		
//		if(score >= 98 && score<=100) a = a+"+";
//		else if(score >=90 && score<=93) a = a+"-";
//		
//		else if(score >=88 && score<=89) a = a+"+";
//		else if(score >=80 && score<=83) a =a+"-";	
//					
//		System.out.println(a);
	}
}
/*
다음 구간별로 학점을 부여하라.
98 이상 A+
94 이상 A
90 이상 A-
88 이상 B+
84 이상 B
80 이상 B-
80 미만 C
--
println 은 한번만 사용할것, A,B,C 도 한번만 사용할것.
점수: 100
A+
*/