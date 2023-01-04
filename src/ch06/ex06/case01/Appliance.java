package ch06.ex06.case01;

public abstract class Appliance {
	public void on() {}
	public abstract void off() ;
}

/*abstract 는 객체를 생성하지 않는다는것이다.(추상적)
단독으로 사용하기보다는 부모class 가 되는것이다.
*/