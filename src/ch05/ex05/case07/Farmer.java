package ch05.ex05.case07;

public class Farmer { //도메인이 아니다.
	public Apple sell(int price) {
		Apple apple = new Apple();
		apple.setPrice(price);
		
		return apple;
	}
}