package ch06.ex01.case02;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();
		lion.run();				
	}
}
//상속을 쓰게 되면 유지보수가 어렵다.