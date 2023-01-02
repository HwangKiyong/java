package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Child extends Parent {
	public void play() {
		//this.getRegNum();
		this.getParentName(); 
		this.getMoney(); //protected 이기에 사용 가능하다.
		//this.addMoney(1000); 
	}
}
