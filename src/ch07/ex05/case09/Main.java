package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		if(c instanceof C) msg += "C ";
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg += "Object";
		System.out.println(msg);
 			//c객체가 C객체이다.
		
		B b = new B();
		msg = "";
		if(b instanceof C) msg += "C ";
		if(b instanceof B) msg += "B ";
		if(b instanceof A) msg += "A ";
		if(b instanceof Object) msg += "Object";
		System.out.println(msg);
		
//		if(b instanceof F)
//		if(c instanceof F)	F는 상속되지 않앗기때문에 사용할 수 없다.
		
		F f = new F();
		msg = "";
//		if(f instanceof C) F객체에서는 C타입이 없다.
		if(f instanceof A) msg += "A "; //A 는 interface이기에 사용이가능하다.
		System.out.println(msg); //F객체는 A타입을 가지고 있지 않으니 메세지출력은 안된다.
	}
}
//다형성을 구현할때 주로 interface를 사용해야한다.