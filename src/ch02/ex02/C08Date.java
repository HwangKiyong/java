package ch02.ex02;

import java.time.LocalDate;

public class C08Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		date = date.plusDays(1);
		//다음 날짜를 확인 하고 싶을땐 괄호안에 숫자를 쓰면된다.
		date = date.minusDays(1);
		System.out.println(date);
	}
}
