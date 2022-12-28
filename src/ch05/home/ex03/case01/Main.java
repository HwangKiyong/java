package ch05.home.ex03.case01;

public class Main {
	public static void main(String[] agrs) {
		Cat cat = new Cat();				
		
		cat.setColor("black");
		cat.setCatName("야코미");		
		
		System.out.printf("%s %s",cat.getColor(),cat.getCatName());		
	}
}

/*
검은 고양이 한 마리를 주웠습니다.
야코미라고 이름을 지었습니다.
*/