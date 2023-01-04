package ch06.ex06.case06;

import ch06.ex06.case04.Appliance;

public class Fridge implements HomeAppliance{
	@Override public void on() {}
	@Override public void off() {}
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() { return 0;}
	@Override public String getModelName() { return null; }
} 


/*extends 에서는 한개를 상속하지만
implements 에서는 n개를 상속한다.
*/