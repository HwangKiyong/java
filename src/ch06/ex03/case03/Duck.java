package ch06.ex03.case03;

public class Duck extends Object {
	@Override
	public String toString() {
		return "오리";
	}
}
//따로 적지 않아도 기본으로 생성되는 것들 : 기본생성자,this. , extends Object
//Object 클래스는 모든자바에 들어간다. 모든 class의 부모class는 Object이다.
//equals(Object obj) 어떤객체든 parameter로 받겠단 뜻이다.
//hashCode() 는 A->B로 바꾸는것이다.