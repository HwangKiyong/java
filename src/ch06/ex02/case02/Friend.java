package ch06.ex02.case02;

public class Friend {
	public void play() {
		Parent parent = new Parent();
		
		//parent.getRegNum(); private이기 때문에 사용할수 없다.
		parent.getParentName();
		parent.getMoney();
		parent.addMoney(1000);		
	}
}
