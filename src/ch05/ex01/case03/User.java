package ch05.ex01.case03;

public class User {
	private String userName;  // encapsulation 캡슐안에 있는것들끼리 대화하는것.
	private int age;
				
	public void setUserName(User this, String userName)/*메서드 선언문*/{  //setter
		this.userName = userName;
	} 	//this 변수의 타입은 User다
			
	public void setAge(int age) {
		this.age = age;
	}
				//읽기 메서드는 get을 쓰는게 관례이다.
	public String getUserName() {  //getter
		return this.userName;
	}
	
	public int getAge(User this) { //User this가 생략된거다.
		return this.age;
	}	// accessor 접속자
}
//this 는 기본적으로 변수지정이 자바 내에 되어있다.

//public은 공개적이다
//private 는 사적이다.
//access 할 수 있는 메서드를 만들면 접근이 가능해진다.
//리턴값이 있는 메서드와 없는 메서드로 메서드 종류를 정한다.

//run버튼은 JVM을 실행시키는 것이다.