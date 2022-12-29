package ch05.ex05.case01;

public class Main {
	public static void main(String[] args) { //main 메서드는 VM이 콜한다.
		Calculator calculator = new Calculator();
		
		int result = calculator.add(1, 2);
		result = calculator.add(1, 2, 3);
		//main 메서드가 add를 콜한것이다.
		System.out.println(result);
		
	}
}
