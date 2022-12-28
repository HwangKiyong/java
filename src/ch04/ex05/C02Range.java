package ch04.ex05;

public class C02Range {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) sum += i;
		//시작과 끝값을 알때 사용할 수 있다.
		System.out.println(sum);
	}
}
