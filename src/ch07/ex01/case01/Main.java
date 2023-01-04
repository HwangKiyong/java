package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c;
		A a = c;
		
		c = (C)a;
		c = (C)b;
		
		b = (B)a; //B로 캐스팅해서 b변수에 담는것이다.
		//부모를 큰수로 보고 자식을 작은수로 보는것이다.
//		String s = (String)c; 가지고 있는 타입중에서만 변환이 가능한것이다.
		
	}
}

//polymorphism 다형성