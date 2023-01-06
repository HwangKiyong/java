package ch07.ex05.case01;

public class Basket<E> {
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}

/* 
generic type 
 <> 블록내에서 데이터타입이다.
 타입결정 시점은 new로 객체 생성 할때 결정된다.
 */

