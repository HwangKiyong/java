package ch02.ex02;

import java.time.LocalDate;
import java.time.LocalTime;

public class C07Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2025, 1, 1);
		LocalTime time = LocalTime.of(18, 7 ,13);
		//지정된 날짜와 시간을 출력해주는 메소드이다.
		System.out.println(date);
		System.out.println(time);		
	}
}
