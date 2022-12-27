package ch04.home.ex05;

public class H01Gugudan {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		for(i = 2; i <= 9; i++ ) {
			for(j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i ,j , i*j);
			}
			System.out.println();
		}
	}
}

/*
과제 : 구구단을 출력하라. 
--
2 * 1 = 2 
2 * 2 = 4 
...

 3 * 1 = 3 
 ...
 9 * 9 = 81
*/