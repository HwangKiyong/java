package ch07.ex05.case08;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Dove dove = new Dove();
		Duck duck = new Duck();
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		List<Creeper> pen = new ArrayList<>();
		pen.add(lion);
		pen.add(leopard);
//		pen.add(dove); Creeper 타입이 없는 Bird는 넣을 수 없다.
		
		List<Bird> cage = new ArrayList<>();
		cage.add(dove);
		cage.add(duck);
//		cage.add(lion);	Bird 타입이 없는 Creeper는 넣을 수 없다.
		
		for(Creeper creeper: pen) creeper.walk();
		
		for(Bird bird: cage) bird.fly();
	}
}
