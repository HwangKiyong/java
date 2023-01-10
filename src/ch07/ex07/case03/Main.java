package ch07.ex07.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = (int x, int y) -> {
			int result = x + y;
			return result;
		};	//명령문이 2줄 이상일떈 블록을 해주어야한다.
		
		calculator = (a, b) -> a + b; //return 이 생략되어있는거이다.
		
		System.out.println(calculator.calc(1, 2));
	}
}


//parameter 가 있는 람다이다.