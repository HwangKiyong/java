package ch05.ex09.case01;

public class Main {
	public static void main(String[] args) {
		new Init();
		new Init();
		
		new Init(1);
	}
}


//static -> instance -> 생성자 순으로 실행된다.
//인스턴스 블록 먼저 실행되고 생성자가 실행된다.