package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200;
	static final String MAKER_NAME = "LG";
	final int WEIGHT = 10;
	LocalDate PRODUCED_DATE = LocalDate.now();
		
	//멤버 variable에는 전부다 public static final 이 붙어있는거다.
	
	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
	
	//전부다 public abstract void 가 있는것이다.
}


/*
interface 안에는 static variable만 가능하다.
instance variable을 만들지 않는다.
final = 값을 한번 할당하면 바꾸지 못한다.
VOLTAGE 는 코드 네임이다.

전부다 public static final 이 붙어있는거다.
*/