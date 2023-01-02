package ch06.ex02.case01.sub;

import ch06.ex02.case01.A; //해주게되면 A클래스를 가져오게된다.

public class B {	//B객체는 package가 sub이다.
	public void test() {
		A a = new A(); //sub 패키지에는 A클래스가 없어서 에러가뜬다.
		//A객체는 package가 case01이다.
		int x = 0;
//		x = a.a;
//		x = a.b;
//		x = a.c;
		x = a.d;
		
		//a.m1(); private
//		a.m2(); //default
//		a.m3(); //protected
		a.m4(); //public
	}
}
