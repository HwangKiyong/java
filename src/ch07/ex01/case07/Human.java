package ch07.ex01.case07;

public class Human {
	// 과제: 아래 세 method call 을 한 method class로 refactoring 하라.
	//public void eat(Ramen ramen) {}
	//public void eat(Kimchi kimchi) {}
	//public void eat(Apple apple) {}
	
	public void eat(Food food) {
		System.out.println(food + "를 먹다.");
	}	
}

//변수의 타입은 인터페이스를 사용해야한다.
//특히 멤버변수를 인터페이스로 사용하는것이 좋다.