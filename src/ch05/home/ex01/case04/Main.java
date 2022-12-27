package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);	
		User user = new User();
		LocalDate date = LocalDate.now();
		
		
						
		System.out.printf("이름: ");
		char str = sc.next().charAt(0);
		if(str == '') System.out.println("이름을 입력하세요.");		
		user.setUserName(sc.next());
				
		System.out.printf("나이: ");
		user.setAge(sc.nextInt());	
						
		System.out.println("\n이름: " + user.getUserName());
		System.out.println("나이: " + user.getAge());
		
		user.setJoinDate(user.getJoinDate());
		System.out.println("가입일: " + user.getJoinDate());
	}
}

/*
과제: 사용자를 생성하라. 
user가  user의 이름, 나이를 입력한다. 
app이 user의 가입일을 자동 입력한다.
--

이름: gambit
나이: 25

이름: gambit
나이: 25
가입일: 2022-12-27
 */
