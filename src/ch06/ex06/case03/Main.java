package ch06.ex06.case03;

public class Main {
	public static void main(String[] args) {
		Fridge fridge = new Fridge();
		
		fridge.on();
		fridge.off();
	}
}

//Appliance객체는 직접 사용은 안되지만 간접적으로는 사용이 가능하다.
//추상 클래스를 사용하는 이유는 간접적으로 사용하기 위함이다.