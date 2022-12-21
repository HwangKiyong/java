package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i;
		System.out.printf("%f, %d\n", d , i);
		
		d = (double)i;
		System.out.printf("%f, %d\n", d , i);
		
		//i = d;
		i = (int)d;
		//큰거에서 작은걸로 갈때는 형변환연산자를 꼭 사용해야한다.
		System.out.printf("%f, %d", d, i);
	}
}
