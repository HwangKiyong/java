package ch05.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}	//바이트 코드가 로딩되면 바로 실행된다.
	//static 멤버 변수는 이런식으로 초기화하면된다.
	private static void inMsg(String msg) {
		System.out.print(msg + "\n>");
	}
	
	public static String inStr(String msg) {
		Console.inMsg(msg);
		return sc.nextLine().trim();
	}
	//문자  입력
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	//숫자  입력
	public static void info(String msg) {
		System.out.println(msg);
	}
	//출력	
	public static void err(String msg) {
		System.out.println("에러]" + msg);
	}
	//에러메세지 출력
	//static 을 준 이유는 누가 했는지가 중요하지 않아서이다.	
}	
