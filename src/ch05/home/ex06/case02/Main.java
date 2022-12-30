package ch05.home.ex06.case02;

import ch05.ex06.case02.Console;

public class Main {
	public static void main(String[] args) {
		Console.inStr("문자를 입력하세요.");
		Console.inNum("자연수를 입력하세요.");
		
//		Console.err("전원이 끊깁니다.");
		Console.info("끝.");
	}
}

/*
 과제:ch05.ex06.case02.Console 을 고도화 하라.
 예외 처리를 하라.
 Console.inStr(): 문자를 입력한다.
 Console.inNum(): 자연수를 입력한다.
 --
 
 문자를 입력하세요.
 >
 ERROR] 문자가 아닙니다.
 > 12
 ERROR] 문자가 아닙니다.
 > hello
 자연수를 입력하세요.
 > 
 ERROR] 자연수가 아닙니다.
 자연수를 입력하세요.
 > hello
 ERROR] 자연수가 아닙니다.
 > 1
 끝.
*/
