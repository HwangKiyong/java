package com.my.hr.presentation;

import java.time.LocalDate;
import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static String inStr(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			 Console.inMsg(msg);
			 input = sc.nextLine();
			 isGood = input.matches("[a-zA-Z가-힣]+");
			 if(!isGood) Console.err("문자가 아닙니다.");			 
		} while(!isGood);
		return input;
	}
	
	public static String inName(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			if(input.equals("0")) isGood = true;
			else {
				isGood = input.matches("[a-zA-Z가-힣]+");
				if(!isGood) Console.err("문자가 아닙니다.");
				else {
					isGood = input.length() <= 5;
					if(!isGood) Console.err("5글자를 초과하였습니다.");
				}
			}
		} while(!isGood);
		
		return input;
	}
	
	static int inNum(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("^[1-9][0-9]*");
			if(!isGood) Console.err("자연수가 아닙니다.");
		}while(!isGood);
		
		return Integer.parseInt(input);		
	}
	
	public static LocalDate inDate(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("^[1-9][0-9]*\\-[0-1][0-9]\\-[0-1][0-9]");
			if(!isGood) Console.err("날짜가 아닙니다.");
		} while(!isGood);
		
		return LocalDate.parse(input);
	}
	public static void info(Object obj) {
		System.out.println(obj);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR]" + msg);
	}
}
