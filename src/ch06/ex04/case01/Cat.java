package ch06.ex04.case01;

public class Cat extends Animal {
	private int age;
	
	public Cat(String catName, int age) {
		super(catName); /* 자식 class 생성자의 첫번째 명령문은 super이다.		
						기본 생성자가 아닌이상 코딩을 해줘야 한다.
						멤버변수 콜하기 위해 초기화하는것이다.*/
//		this.animalName = catName; private 이기 때문에 에러이다.
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	} //부모 class가 준것 외에도 다른것을 더 추가 할 수 있다.
	
	@Override
	public String toString() {
		return String.format("%s %d", this.getAnimalName(),this.getAge());
	}
}
