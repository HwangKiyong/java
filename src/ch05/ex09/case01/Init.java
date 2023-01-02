package ch05.ex09.case01;

import ch05.home.ex06.case02.Console;

public class Init {
	private static int s;
	private int i;
	
	static {
		Init.s = 1;
		//this.i = 1; 인스턴스 변수사용은 스태틱블럭에서는 문법상 불가능하다.
		Console.info("static{}");
	} // 문법상 기본값이기 때문에 0이 아닌 1이다.
	
	{
		this.i = 1; //인스턴스 변수 사용이 가능하다.
		Init.s = 1; //스태틱 변수도 사용이 가능하다. 하지만 사용하지않는다.가독성이 떨어진다.
		Console.info("{}");
	}	//인스턴스 블록 먼저 실행되고 생성자가 실행된다.
	
	{
		Console.info("{}2");
	} //인스턴스 블록은 여러개 만들수는 있지만 이름이 구별되지않아 만드는 의미가 없다.
	
	public Init() {
		Console.info("Init()");
	}
	
	public Init(int i) {
		Console.info("Init(int)");
	}
}
//인스턴스 블록은 꼭 실행되지만 생성자는 필요에 의해 실행 시킬 수 있다.