package ch05.ex05.case01;

public class Calculator {
	public int add(int a, int b){//메서드는 특별한 경우 아닌이상 public을 쓸것
		return a + b;
	}
	/*
	public int add(int x ,int y) {
		return x + y;
	} add가 중복되서 실행이 안된다.
	*/
	
	public int add(int a , int b ,int c) {
		return a + b + c;
	}  //overloading 은 두 메서드가 이름은 같으나 인자의 수나 자료형이 다른경우다.
}
