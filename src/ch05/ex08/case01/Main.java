package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby(); //객체가 만들어진 이유는 new라는 연산자가 실행됬기 때문이다.
		baby.setBabyName("초롱이"); //아이가 태어나고 이름을 지은것
		
		baby = new Baby("튼튼이");	//태어날때 이미 이름이 지어져있는것
	}
}
