package ch06.ex06.case04;

public class Fridge implements Appliance{
	@Override
	public void on() { }		
	
	@Override
	public void off() {	}	
}


/*implements는 인터페이스를 상속하는것이다.
추상메서드를 가지고 있는 클래스는 객체를 생성하면 안된다.
추상클래스가 되어야한다.
*/