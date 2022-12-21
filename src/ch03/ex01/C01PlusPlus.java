package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] agrs) {
		int i = 0;
		++i;
		System.out.println(i);
		i++;  //for문과 결합하여 자주 사용된다.
		System.out.println(i);
		
		i = 0; //i값을 초기화한것이다.
		int j = ++i;
		System.out.printf("i : %d, j : %d\n", i ,j);
		
		i = 0; 
		j = i++;
		System.out.printf("i : %d, j : %d\n", i ,j);
	}
}
