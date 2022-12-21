package ch02.ex02;

import java.time.LocalDate;
import java.time.LocalTime;

public class C06Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		//날짜와 시간을 가르쳐주는 메서드이다.
		System.out.println(date);
		System.out.println(time);
	}
}