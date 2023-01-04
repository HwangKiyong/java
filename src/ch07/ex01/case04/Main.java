package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		Platanus platanus = new Platanus();
		
		Tree tree = new Platanus();
		//관점에 따라 다른 변수에 확장을 하는것이다.
		platanus = (Platanus)tree;
		
		tree = platanus;
		tree = (Tree)platanus; 
	}
}
