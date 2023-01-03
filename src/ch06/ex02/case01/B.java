package ch06.ex02.case01;

public class B {
	public void test() {
		A a = new A();
		
		int x = 0;
//		x = a.a;
		x = a.b;
		x = a.c;
		x = a.d;
		
		//a.m1(); private기 때문에 접근이 안된다.
		a.m2(); //default
		a.m3(); //protected
		a.m4(); //public
	}
}
