package ch06.ex02.case02;

public class Parent {
	private String regNum;
	private String parentName;
	private int money;
	
	private String getRegNum() {
		return regNum;
	}
	
	public String getParentName() {
		return parentName;
	}
	
	public int getMoney() {
		return this.money;
	}	
	
	void addMoney(int money) {
		this.money += money;
	}	//같은 package에 있는경우에만 사용이 가능하다.
}
