package ch07.ex07.case01;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("hello"); 
		//-> 표를 사용하는것을 람다식이라고 한다.
		human.say();	
	}	
}
