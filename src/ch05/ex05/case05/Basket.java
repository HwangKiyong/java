package ch05.ex05.case05;

public class Basket {  //도메인이다.
	//과제: 사과 바구니를 디자인하라.
	private Apple apple;//has a관계 A has a B A:Basket B:apple B를 dependency
	
	public Apple getApple() {
		return apple;
	}
	
	public void setApple(Apple apple) {
		this.apple = apple;
	}
}
