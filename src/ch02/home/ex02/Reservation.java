package ch02.home.ex02;
import java.time.LocalDate;
import java.util.Scanner;
public class Reservation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("공연 일자를 입력하세요.");
		System.out.printf("년: ");
		int y = sc.nextInt();
		System.out.printf("월: ");
		int m = sc.nextInt();
		System.out.printf("일: ");
		int d = sc.nextInt();
		System.out.println();
		
		LocalDate date = LocalDate.of(y, m, d);
		System.out.println(date + " 공연을 예매했습니다.");
		date = date.minusDays(3);
		System.out.println(date + " 까지 환불이 가능합니다.");
	}

}
/*
과제 : 예매하라. 환불은 공연일로부터 3일전까지 가능하다.


공연 일자를 입력하세요.
년: 2025
월: 7
일: 17

2025-07-17 공연을 예매했습니다.
2025-07-14 까지 환불이 가능합니다.
*/