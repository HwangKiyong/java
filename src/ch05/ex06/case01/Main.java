package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love java.");
//		Man.tell("");
		//static 메소드는 바로 실행이된다.
		Man man = new Man();
		man.tell("I LOVE JAVA.");
		man.say("Hello."); //static 메소드를 n번 사용하게 되면 유지보수에 좋지않다.
		//instance 메소드는 객체를 새로 만들어서 사용해야된다.
	}
}
