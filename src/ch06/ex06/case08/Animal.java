package ch06.ex06.case08;

public interface Animal {
	void move();
	
	default void eat() { }
	//default 메소드로 지정을 해줘야 알고리즘을 구현할 수 있다.
}
