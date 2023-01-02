package ch05.ex08.case01;

public class Baby {
	private String babyName;
	
	public Baby() {} // 기본생성자
	
	public Baby(String babyName) {
		this.babyName = babyName; //생성자에서는 초기화를 시켜줘야된다.
	}	//객체 생성한 직후에 멤버변수값을 write 할 때 사용한다.
	
	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}	//객체 생성된 뒤에 멤버변수값을 write 할 때 사용한다.
}
