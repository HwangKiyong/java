package ch06.ex03.case02;

public class Cat extends Animal {
	@Override	//annotation(주석) 업무에 사용하지는 않는다. 컴파일러가 사용한다.
	public void shout() {
		System.out.println("야옹야옹");
	}
}
//접근제한자의 scope 은 부모보다 커야된다.