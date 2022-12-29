package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		int day = 2;
		
		String dayName = switch(day) {
		case 1 -> "sunday";
		case 2 -> "monday";
		case 3 -> "tuesday";
		case 4 -> "wednesday";
		case 5 -> "thursday";
		case 6 -> "friday";
		case 7 -> "saturday";
		default -> "none";
		}; //괄호 끝에 ; 잊지말고 써야함
		
		System.out.println(dayName);
	}
}


/*
과제: 앱과 가위바위보를 하라. 게임 결과를 출력하라. 결과는
You win.
You lose.
Fair.
중 하나이다.
--

1. 가위, 2.바위, 3.보
> 1
You: 가위
Me: 보

You win.
*/