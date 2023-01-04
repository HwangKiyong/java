package ch06.ex06.case09;

public interface UI {
	static String in() {		
		return "키보드로 입력하다.";
	}
	
	String out(); //출력하는 부분은 body를 구현할수 없다.
}
