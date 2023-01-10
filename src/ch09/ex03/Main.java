package ch09.ex03;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Player(counter).start();	//start 가 시키는것이다.
		new Player(counter).start();
		new Player(counter).start();	
	}
}

//공유하는것 사용하지 말것!