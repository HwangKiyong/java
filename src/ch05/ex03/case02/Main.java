package ch05.ex03.case02;

public class Main {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();	
		
		System.out.printf("%s\n%s\n\n", tv1, tv2);
		System.out.printf("%s\n%s\n\n", tv1.getColor(),tv2.getColor());
		
		tv1.setColor("red");
		System.out.printf("%s\n%s\n\n", tv1.getColor(),tv2.getColor());
		
		
		tv2 = tv1; //같은 값을 할당. tv1 과 tv2는 같은 위치 같은 속성을 갖는다.
		System.out.printf("%s\n%s\n\n", tv1, tv2);
		System.out.printf("%s\n%s\n\n", tv1.getColor(),tv2.getColor());
	}
}
