package com.my.hr.presentation;

import java.time.LocalDate;
import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static void info(Object obj) {
		System.out.println(obj);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
	
	public static String inStr(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[0a-zA-Z가-힣]+");
			if(!isGood) Console.err("문자가 아닙니다.");
		} while(!isGood);
		
		return input;
	}
	
	public static int inNum(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[0-9]+");
			if(!isGood) Console.err("0 이상의 정수가 아닙니다.");
		} while(!isGood);
		
		return Integer.parseInt(input);
	}
	
	public static LocalDate inDate(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("^[1-9][0-9]*\\-[0-1][0-9]\\-[0-1][0-9]");
			if(!isGood) Console.err("YYYY-MM-DD 형식의 날짜가 아닙니다.");
		} while(!isGood);
		
		return LocalDate.parse(input);
	}
}