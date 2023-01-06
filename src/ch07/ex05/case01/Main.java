package ch07.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> basket = new Basket<Apple>();
		basket.set(new Apple());
		System.out.println(basket.get());
		
		//basket.set(new Grape());
		Basket<Grape> basket2 = new Basket<Grape>();
		basket2.set(new Grape());
		System.out.println(basket2.get());
	}
}


/*객체 생성시 타입을 정한다.
E 가 Apple가 되는것이다.
E 를 새로 지정해주면 다른 것으로도 사용 할 수 있다.
*/

//autoboxing