package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A {
	public void test() {
		int x = 0;
		
//		x = this.a; private기 때문에 사용하지못한다.
//		x = this.b; 다른 package에 있기 때문에 사용하지 못한다.
		x = this.c; //자식에게는 사용할수 있게 해주기위해서는 protected를 사용한다.
		x = this.d;	//public 이기 때문에 사용이 가능하다.
		
//		this.m1(); private기 때문에 사용하지 못한다.
//		this.m2(); 다른 package기 때문에 사용하지 못한다.
		this.m3(); 	//protected 는 사용이 가능하다.
		this.m4();	//public 이기 때문에 사용이 가능하다.
	}
}

/*protected 는 자식과 package안에서만 볼 수 있다.
public은 제한이 없다.
*/
